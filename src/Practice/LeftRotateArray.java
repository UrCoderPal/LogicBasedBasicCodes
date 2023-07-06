package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeftRotateArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Enter Axis Index");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		turnAround(0, n - 1, a);
		System.out.println();
		turnAround(n, a.length-1, a);
		System.out.println();
		turnAround(0, a.length-1, a);
		System.out.println();
		System.out.println("Result: ");
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static void turnAround(int i, int j, int[] a) {
		int length = i + j;
		while (i <= length / 2) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
//		for(int x:a)
//			System.out.print(x+" ");
		List<int[]> myl=Arrays.asList(a);
		System.out.println(myl);
	}
}


/* Alternate soln
 * public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n;i++) {
            array[(i+n-d)%n] = scan.nextInt();
        }
        for(int i=0; i<n;i++) {
            System.out.print(array[i] + " ");
        }      
    }
}*/
