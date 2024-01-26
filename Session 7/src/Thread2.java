
public class Thread2 extends Thread{

	Share share;

	public Thread2(Share share) {
		this.share = share;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		int b=share.getA();
		share.shareMethod(++b);
		}
	}
	
}