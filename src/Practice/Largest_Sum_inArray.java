package Practice;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Largest_Sum_inArray {

	public static void main(String[] args) {

		int[] a = { -1, -7, -3, -2, -5, -1, -8, -9 };
//		Scanner s= new Scanner(System.in);
//		System.out.println("Enter The Elements");
//		for(int i=0;i<a.length;i++){
//			a[i]=s.nextInt();
//		}
		System.out.println("Ur Array is");
		for (int x : a) {
			System.out.println(x + " ");
		}

		int sum = 0;
		int F = 0, L = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (sum > max) {
				max = sum;
				L = i;
			}
			else if (sum < 0) {
				sum = 0;
				F = i+1;
			}
		}
		System.out.println(max + " is the max sum");
		System.out.println("subarray is");
		if(F>L)
		System.out.println(a[L]);
		for (int i = F; i <= L; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
