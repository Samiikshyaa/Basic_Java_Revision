package abstraction;

public class KumariBank extends CentralBank{

	@Override
	void getBankName() {
		System.out.println("Kumari BAnk");
		
	}

	@Override
	void getInterestRate() {
		System.out.println("Interest RAte is 15%");
		
	}
	
}
