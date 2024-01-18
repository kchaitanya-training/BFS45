/*
 * Write program to express overloading and 
 * override method in between parent and child relation
 */
	
	class Samsung{
	public void folding() {
		System.out.println("Samsung folding is nice.");
	}
	
	public void folding(String function) {
		System.out.println("Samsung is nice and it can " + function);
	}
	

}

	class SamsungFeatures extends Samsung{
	
	public void folding() {
		System.out.println("Samsung folding is very popular.");
	}
	
	public void folding(String function) {
		System.out.println("Samsung is very popular and it can " + function);
	}
	
	public void folding(String function, int a) {
		System.out.println("Samsung is very popular, can " + function + " and "+"there are " + a + " Billions available in the market.");
	}

	}
	class Main{
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			
			Samsung sam = new SamsungFeatures();
			sam.folding();
			sam.folding("fold");
			
			SamsungFeatures samFe = new SamsungFeatures();
			
			samFe.folding("fold", 5);
			
			
		}
	}
	
		
	
