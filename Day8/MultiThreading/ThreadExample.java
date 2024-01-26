public class ThreadExample {

    public static void main(String[] args) {
        System.out.println("===Starting of the main thread===\n");

        MultiThread thread1 = new MultiThread(1);
        MultiThread thread2 = new MultiThread(2);
        MultiThread thread3 = new MultiThread(3);

        thread1.start();
        thread2.start();
        thread3.start();

//        System.out.println("Main thread has stopped.");

    }
}
