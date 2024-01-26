package ThreadingEx;
class SampleThread{
    int num;

    public int getNum() {
        return num;
    }
    public void exec()
    {
        this.num ++;
        System.out.println(Thread.currentThread()+ "Value: " + this.num);
    }

}

class ThreadOne implements Runnable {
    private SampleThread thread;

    ThreadOne(SampleThread thread)
    {
        this.thread = thread;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 20; i++)
        {
            thread.exec();
        }

    }
}
class ThreadTwo extends Thread{

     SampleThread thread;
    ThreadTwo(SampleThread thread)
    {
        this.thread = thread;
    }
    @Override
    public void run() {

            for(int i = 0; i <= 20; i++)
            {
                thread.exec();
            }

    }
}

public class MainThread {
    public static void main(String[] args) {
        SampleThread st = new SampleThread();
        ThreadOne tone = new ThreadOne(st);
        ThreadTwo ttwo = new ThreadTwo(st);

        Thread actual1 = new Thread(tone);
        Thread actual2 = new Thread(ttwo);

        actual1.start();
        actual2.start();




    }
}
