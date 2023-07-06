/*Determine the integer floor of the sum of two floating point numbers. The floor is the truncated float value, i.e. anything after the decimal point is dropped. For instance, floor(1.1 + 3.05) = floor(4.15) = 4.
 
Function Description 
Complete the function addNumbers in the editor below. The function must return an integer that represents the floor of the sum of two floating point numbers.
 
addNumbers has th
e following parameter(s):
    a:  a floating point number
    b:  a floating point number
 
Constraints
•	0.1 < a, b < 106
•	a and b have at most 8 places after the decimal

Input Format For Custom Testing
The first line contains a floating point value, a
The second line contains a floating point value, b

Sample Case 0
Sample Input 0

2.3
1.9
Sample Output 0

4
Explanation 0
The sum of a = 2.3 and b = 1.9 is 2.3 + 1.9 = 4.2. Return the integer floor of the sum, 4.

Sample Case 1
Sample Input 1

2.34
5.7
Sample Output 1

8
Explanation 1
The sum of a = 2.34 and b = 5.7 is 2.34 + 5.7 = 8.04. Return the integer floor of the sum, 8.*/




package Practice;

public class FloorOfSumOfTwoNums {

	public static void main(String[] args) {
System.out.println(addNumbers(2.34,5.7));
	}
	
	public static int addNumbers(double a,double b) {
		int res=(int)(a+b);
		return res;
	}

}
