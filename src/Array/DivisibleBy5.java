package Array;

import java.util.Arrays;

public class DivisibleBy5 {
	
	static int[] div() {
		int array[]= new int[21];
		int j=0;
		for(int i=20; i<=120; i++) {
			if(i%5==0) {
				array[j]=i;
				j++;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] division = div();
		System.out.println("The array is: "+ Arrays.toString(division));
	}
}
