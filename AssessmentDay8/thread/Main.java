package AssessmentDay8.thread;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();

        ThreadTask thread1 = new ThreadTask(task);
        ThreadTask thread2 = new ThreadTask(task);
        ThreadTask thread3 = new ThreadTask(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
