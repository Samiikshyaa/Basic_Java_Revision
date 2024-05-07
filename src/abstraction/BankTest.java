package abstraction;

public class BankTest {
	
	public static void main(String[] args) {
		CentralBank cb = new KumariBank();
		cb.getInterestRate();
		cb.getBankName();
		cb.moneyExRate();
	}
}