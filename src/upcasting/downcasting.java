package upcasting;

public class downcasting{
	public static void main(String[] args) {
		System.out.println("Downcasting");
		Father f= new Son();//upcasting
		
		Son z=  (Son)f;//downcasting
		z.home();//method from father class
		z.money();//method of father but value of son
		z.atm();//method from son class 
		z.bike(); //method of father but value of son
		
	}

}
