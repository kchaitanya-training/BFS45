public class MultiThread extends Thread {
    private int randomNum = 0;
    private int threadCount;

    MultiThread(int num){
        threadCount = num;
    }

    public void run(){
        System.out.println("Current thread: "+ threadCount);
        System.out.println("");
        for(int i = 0; i < 10; i++){
            randomNum++;
            System.out.println("Current thread: "+threadCount+ "; Current number: "+randomNum);
            //Integrating a sleep function to add some downtime.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadCount + " has been interrupted.");
            }
        }
        System.out.println("");
        System.out.println("The thread "+ threadCount +" has stopped.");
    }
}
