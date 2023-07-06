package Practice;

import java.util.Scanner;

public class HighestNumberWithMinimumFrequency {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter");
		String r=s.nextLine();
		System.out.println(r);
//		System.out.println("helk2lqel");
//		int arr[] = { 2, 2, 5, 50, 100, 50, 50, 66, 66, 6, 100 };
//		int n = arr.length;
//		int mn = Integer.MAX_VALUE;
//		int count = 1;
//		int ans = 0;
//		for (int i = 0; i < n; i++) {
//			count = 0;
//
//			for (int j = 0; j < n; j++) {
//				if (arr[i] == arr[j] && i != j) {
//					count++;
//				}
//			}
//
//			if (count < mn) {
//				mn = count;
//				ans = arr[i];
//				System.out.println("ans is " + ans);
//			} else if (count == mn) {
//				if (arr[i] > ans) {
//					ans = arr[i];
//					System.out.println("lower ans is " + ans);
//				}
//			}
//		}
//		System.out.println(ans);

//		int x[] = { 1, 4, 4, 4, 5, 3 };
//		System.out.println(migratoryBirds(x));
	}

	// METHOD 2
	public static int migratoryBirds(int[] a) {
		/*
		 * Given an array of bird sightings where every element represents a bird type
		 * id, determine the id of the most frequently sighted type. If more than 1 type
		 * has been spotted that maximum amount, return the smallest of their ids.
		 * 
		 * Example There are two each of types and , and one sighting of type . Pick the
		 * lower of the two types seen twice: type .
		 */ //failed two test cases

		int L = a.length;
		int count = 1, res = 0, countToBeat = 1;
		for (int i = 0; i < L; i++) {
			count=1;
			for (int j = 0; j < L; j++) {
				if (i != j) {
					if (a[i] == a[j]) {
						count++;
					}
				}
			}
			if (count > countToBeat ) //if count of a digit is higher to fir waise hi win
			{
				res = i;
				countToBeat = count;
			}
			else if(count==countToBeat) //agar do digits ka same ho toh fir lighter wins
			{
				if(a[i]<a[res])
					res=i;
				countToBeat = count;
			}
			
		}
		return a[res];
		
		//this is highest frquency lightest/min element btw
		
	
		
	}
}
