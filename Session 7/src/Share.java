
public class Share {
	
	int a=0;
	
	public  void shareMethod(int a) {
		this.a=a;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" the value a "+Thread.currentThread()+a);
	}


	public int getA() {
		return a;
	}

}
