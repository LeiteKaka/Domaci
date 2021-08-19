package osmi;

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits {

	public static int[] digitize(long n) {

       if( n == 0) {
    	   return new int[] {0};
       }
		
		
		int counter = 0;

		long tmp = n;


		while(n != 0) {

			n /= 10;
			counter++;
		}

		int[] a = new int[counter];

		for(int i = 0; i < a.length;i++) {

			a[i] =(int) tmp % 10;
			tmp /= 10;

		}
		
		return a;

	}




	public static void main(String[] args) {

          int[] rez = digitize(34567);
          System.out.println(Arrays.toString(rez));

	}

}
