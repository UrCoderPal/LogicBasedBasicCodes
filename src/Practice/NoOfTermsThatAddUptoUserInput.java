package Practice;

import java.util.Scanner;

public class NoOfTermsThatAddUptoUserInput {

	public static void main(String[] args) {

//		int[] a = { 1, 2, 3, 5, 2, 6, 1 };
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter sum");
//		int ip = s.nextInt();
		/*
		 * int terms = fun(a, ip); if (terms != 0) System.out.println("terms " + terms);
		 * else System.out.println("No elms sum up to input value");
		 */

		// Question 2 find all pairs of an integer array whose sum is equal to a given
		// number
		int b[] = { 6, 6, 7, 2, 3, 5, 3, 4, 1, 2 };
		System.out.println(pairsThatAddToInput(b, 6));
//		System.out.println(fun(b,6));

	}

	public static int fun(int[] a, int ip) {
		int sum = 0, count = 0;
		for (int i = 0, j = i + 1; j < a.length;) {
			sum = a[i];
			if (sum == ip)
				return 1;
			while (true) {
				sum += a[j];
				j++;
				count++;
				if (sum > ip) {
					i++;
					j = i + 1;
					count = 0;
					break;
				} else if (sum == ip) {
					System.out.println("terms series begin from index [" + i + "]");
					return count + 1;
				}
			}
		}
		return 0;
	}

	public static int pairsThatAddToInput(int a[], int ip) // 1, 6, 7, 2, 3, 5, 3, 4, 1, 2
	{
		int count = 0, pair = 0, j = 0, sum = 0;
		boolean isPair = false;
		for (int i = 0; i < a.length; i++) {
			j = i; // dsnt work similar if put next to i++ in for itself
			if (isPair)
				pair++;

			sum = 0; // forgot again to refresh sum in every iteration of i got nos of pairs as 1 ie
						// only first occurance
			isPair = false; // didnt refresh so got pairs = 9 since first find true then every tr of i
							// pair++ in above condnt
			while (j < a.length) {
				sum += a[j];
				if (sum == ip) {
					if (j - i > 0) {
						System.out.println("Index range from: " + i + " to " + j);
						isPair = true;
					}
					break;
				} else if (sum > ip) {
					break;
				} else {
					j++; // ie jab tak greater ya equal nahi aa jaata j badhte raho
				}
			}
		}
		return pair;
	}
}
