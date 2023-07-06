/*Given an array of sales numbers, find the index of the smallest array element (the pivot), for which the sums of all elements to the left and to the right are equal. The array may not be reordered.
 
Example
sales=[1,2,3,4,6]
 
•	the sum of the first three elements, 1+2+3=6. The value of the last element is 6. 
•	Using zero based indexing, sales[3]=4 is the pivot between the two subarrays.
•	The index of the pivot is 3.
 
Function Description 
Complete the function balancedSum in the editor below.
 
balancedSum has the following parameter(s):
    int sales[n]:  an array of integers
Returns:
    int: an integer representing the index of the pivot
 
Constraints
•	3 ≤ n ≤ 105
•	1 ≤ sales[i] ≤ 2 × 104, where 0 ≤ i < n
•	It is guaranteed that a solution always exists.

Input Format for Custom Testing
Input from stdin will be processed as follows and passed to the function.
 
The first line contains an integer n, the size of the array sales.
Each of the next n lines contains an integer, sales[i], where 0 ≤ i < n.

Sample Case 0
Sample Input 0
STDIN     Function Parameters
-----     ------------------- 
4      →  sales[] size n = 4
1      →  sales=[1,2,3,3] 
2
3
3
 
Sample Output 0
2
 
Explanation 0
•	the sum of the first two elements, 1+2=3. The value of the last element is 3. 
•	Using zero based indexing, sales[2]=3 is the pivot between the two subarrays.
•	The index of the pivot is 2.

Sample Case 1
Sample Input 1
STDIN     Function Parameters
-----     -------------------
3      →  sales[] size n = 3 
1      →  sales=[1,2,1] 
2
1
 
Sample Output 1
1
 
Explanation 1
•	the first  and last elements are equal to 1. 
•	Using zero based indexing, sales[1]=2 is the pivot between the two subarrays.
•	The index of the pivot is 1*/

package Practice;

public class SumOfLeftOfPivotnRight {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 6 };
		int L = a.length, i, j, k;
		boolean equiFound = false;
		for (k = 1; k < L - 1; k++) //cz first elm ke left pe koi nahi so k=1 n last elm ke ryt pe koi na so <L-1
		{
			int sumL = 0, sumR = 0;
			i = k - 1;
			j = k + 1;
			while (i >= 0 || j < L) //cud hv used two loops ek jo pehle pura left ka sum nikalta i=0 hone tak
				                    //fir dusra j loop uske khatam hone ke baad jo ryt ka nikalta sum
				                    //but ek while n do if se optimize hogaya 
			{
				if (i >= 0) {
					sumL += a[i--]; //can hv i=k then use pre-dcrmt 
				}
				if (j < L) {
					sumR += a[j++]; //same can hv j=k n pre incrmt
				}
			}
			if (sumL == sumR) {
				equiFound = true;
				break;
			}
		}
		if (equiFound)
			System.out.println("equilibrium found when pivot on index [" + k + "]");
		else
			System.out.println("No Equilibrium");
	}

}
