package Array;

public class ArrayAsArguments {

	static void printing(String[] array) {
		System.out.println("The names are: ");
		for (String x: array) {
			System.out.println(x);
		}
	}
	
	static int add (int[] arr) {
		int s=0;
		for (int x: arr) {
			s=s+x;
		}
		return s;
	}
	
	public static void main(String[] args) {
		String[] array= {"Samikshya", "Timalsina", "RAM"};
		printing(array);
		
		int[] arr = {1,2,33,4,5,66};
		System.out.println("The sum of the given numbers is: "+add(arr));
		
	}
}
