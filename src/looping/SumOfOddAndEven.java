package looping;

public class SumOfOddAndEven {
	
	public static void main(String[] args) {
		int esum= 0 , osum = 0;
		for (int i=1; i<=100; i++) {
			if (i%2 == 0) {
				esum = esum + i;
			}
			else {
				osum = osum + i ;
			}
		}
		
		System.out.println("Even");
		for (int i=1; i<=100; i++) {
			
			if (i%2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("Odd");
		for (int i=1; i<=100; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}

		System.out.println("Odd sum "+osum);
		System.out.println("Even sum "+esum);
	}
}
