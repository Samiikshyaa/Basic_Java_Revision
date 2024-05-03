package Array;

import java.util.Arrays;

public class ArrayAsReturnType {
		
		static int[] age(){
			int[] age = {22,23,34,45};
			return age;
		}
		
		static char[] printvowel(char[] vow) {
			return vow;
		}

		public static void main(String[] args) {
			char[] vowel = {'a','e','i','o','u'};
			int[] age = age();
			System.out.println(Arrays.toString(age()));
			
			System.out.println(Arrays.toString(age));
			
			System.out.println(Arrays.toString(printvowel(vowel)));
			
		}
}
