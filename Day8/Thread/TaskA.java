package Day8.Thread;

public class TaskA implements Runnable{
    private String message;

    public TaskA (String message)
    {
        this.message = message;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 15; i++)
        {
            System.out.println("Value: " + Thread.currentThread() + i);
        }
    }

}
