package AssessmentDay8.thread;

public class ThreadTask extends Thread {
    Task task;

    public ThreadTask(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            task.exec();
        }
    }
}
