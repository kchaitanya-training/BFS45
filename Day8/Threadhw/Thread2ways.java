package Threadhw;


public class Thread2ways {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
		t2.start();
		t2.setPriority(1);
		t1.setPriority(5);
/*		
		MyThread1Runnable bullet1= new MyThread1Runnable();
		Thread gun1 = new Thread(bullet1);
		MyThread1Runnable bullet2= new MyThread1Runnable();
		Thread gun2 = new Thread(bullet2);

		gun1.start();
		gun2.start();
		
*/		
	}

}
/*
class MyThread1Runnable implements Runnable{
	public void run () {
		int i = 0;
		while(i < 500000) {
		System.out.println("Runnable thread 1");
		i++;
		}
	}
}

class MyThread2Runnable implements Runnable{
	public void run () {
		int i = 0;
		while(i<50000) {
		System.out.println("I am Runnable thread 2");
		i++;
	}
}
}

*/
class MyThread1 extends Thread{
	@Override
	public void run() {
		int i = 0;
		while(i<40000) {
		System.out.println("cooking food");
		System.out.println("I am good");
		i++; 
	}
}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		int i = 0;
		while(i<40000 ) {
		System.out.println("He is chatting with her");
		System.out.println("I am happy!");
		i++;
	}
	  
}
} 

