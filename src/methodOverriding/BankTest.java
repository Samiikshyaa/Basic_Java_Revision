package methodOverriding;

public class BankTest {
	
	public static void main(String[] args) {
		
		//static or early binding of object
//		NabilBank nb = new NabilBank();
//		nb.getBankName();
//		nb.getInterestRate();
		
		//upcasting
		CentralBank b = new CentralBank();		
		
		BankTest bt = new BankTest();
		bt.printBankInfo(b);
	}
	// dynamic or late binding of object
	//runtime polymorphism
	void printBankInfo(CentralBank bn){
		bn.getBankName();
		bn.getInterestRate();
	}
}