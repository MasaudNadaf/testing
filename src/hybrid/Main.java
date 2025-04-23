package hybrid;//with Super and this keyword

public class Main {

	
	public static void main (String[]args) {
		
		
	 Account Z=new Account();
	 Z.Bank();   //access global variable with "this" keyword
	 Z.AccNo();  //from same class
	 
	 Balance X=new Balance();
	 Z.Bank();  //access global variable from super class bank 
	 X.ACBal(); //with "super" keyword 
	 
	 Atm Y=new Atm();
	 Z.Bank();   //access global variable super from class bank
	 Y.AtmNo();   //with "super" keyword
	 
	 Ifsc I=new Ifsc();
	 I.Bank();
	 I.IFSC();
	
	
	
	}
}
