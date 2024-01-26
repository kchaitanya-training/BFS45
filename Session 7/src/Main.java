
public class Main {
public static void main(String[] args) {
		
		Share share=new Share();
		Thread1 t1=new Thread1(share);
		Thread2 t2=new Thread2(share);
		
		t1.start();
		t2.start();
	}
}
