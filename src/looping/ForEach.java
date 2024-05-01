package looping;

public class ForEach {
	
	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55,66,77,88,99};
		int esum=0;
		int osum=0;
		
		System.out.println("EVEN");
		for(int x: arr) {
			if(x%2 == 0) {
				System.out.println(x);
				esum = esum+x;
			}
		}
		
		System.out.println("\nOdd");
		for(int x: arr) {
			if(x%2 != 0) {
				System.out.println(x);
				osum = osum + x;
			}
		}
		
		System.out.println("Even Sum "+ esum);
		System.out.println("Odd Sum "+ osum);
	}
}
