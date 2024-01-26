package Day8.Thread;

public class myMain {
    public static void main(String[] args) {
        myMain my = new myMain();

        TaskA taa = new TaskA("hello from task A...");
        Thread actual1 = new Thread(taa);

        TaskB tbb = new TaskB();
        Thread actual2 = new Thread(tbb);

        actual1.start();
        actual2.start();
    }
}
