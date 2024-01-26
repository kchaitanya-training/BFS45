package com.thread;

class WorkerThread implements Runnable {
	
    SharedData sharedData;
    String threadName;

    public WorkerThread(SharedData sharedData, String threadName) {
        this.sharedData = sharedData;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        // Access the shared class and modify data
        for (int i = 0; i < 4; i++) {
            sharedData.changeData(threadName);
            try {
                Thread.sleep(100); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
