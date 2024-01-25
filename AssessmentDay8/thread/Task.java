package AssessmentDay8.thread;

public class Task {
    int num;

    public int getNum() {
        return num;
    }

    public void exec() {
        this.num++;

        System.out.println("** Thread:" + Thread.currentThread() + " ** | Value of num = " + this.num);
    }
}
