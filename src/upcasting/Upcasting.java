package upcasting;

public class Upcasting {
	public static void main(String[] args) {
		System.out.println("Upcasting");
		
		Father f= new Son();//upcasting
		f.home();//method of father but value of son
		f.money();//method of father but value of son
		f.bike();//method of father but value of son
		//f.atm();//not accesss son method
	
	
		
	}

}
