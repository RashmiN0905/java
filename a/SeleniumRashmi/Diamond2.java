public class Diamond2 {
	Diamond2(){
		
	}
	public void cares() {
		System.out.println("Care1");
	}

}

public class Diamond1 {
	Diamond1(){
		
	}
	public void cares() {
		System.out.println("Care2");
	}


public class Test10_DiamondProblem extends Diamond1,Diamond2{
	
	Test10_DiamondProblem(){
		super();
		System.out.println("we cannot achieve multiple inheritance");
	}
	public static void main(String[] args) {
		Test10_DiamondProblem t=new Test10_DiamondProblem();
		

	}

}