/*Given an array with the lengths 
pieces of bamboo, repeatedly perform the following:
 
1.	Count the number of pieces of bamboo.
2.	Find the shortest length piece(s).
3.	Discard any piece of that length.
4.	Cut that shortest length from each of the longer pieces.  Each piece just cut is an offcut.
5.	Discard all offcuts.
6.	Repeat until there are no more pieces.
 
Maintain an array of the numbers of pieces at the beginning of each round of actions.
 
For example, there are n = 4 pieces, with lengths = [1, 1, 3, 4].  The shortest pieces are 1 unit long, so discard them and remember their length.  Remove their length, 1 unit, from the longer pieces and discard the offcuts.  Now there are 2 pieces of bamboo, lengths = [2, 3].  Discard the piece of length 2, cut 2 from the piece length 3 and discard the offcut. Now there is only one piece of length 1.  Discard it and return an array with the number of pieces at the start of each turn: [4, 2, 1].
lengths     cut length      pieces
1 1 3 4          1            4
_ _ 2 3          2            2
_ _ _ 1          1            1
_ _ _ _        DONE        DONE
 
Function Description 
Complete the function cutBamboo in the editor below. The function must return an array of integers, each the number of pieces at the start of a turn.
 
cutBamboo has the following parameter(s):
    lengths[lengths[0],...lengths[n-1]]:  an array of integers that represent the starting lengths of each piece of bamboo
 
Constraints
•	1 ≤ n ≤ 103
•	1 ≤ lengths[i] ≤ 103, where 0 ≤ i < n

Input Format for Custom Testing
Sample Input 0
6
5
4
4
2
2
8
 
Sample Output 0
6
4
2
1
 
Explanation 0
  lengths     cut length      pieces
5 4 4 2 2 8          2           6
3 2 2 _ _ 6          2           4
1 _ _ _ _ 4          1           2
_ _ _ _ _ 3          3           1
_ _ _ _ _ _        DONE        DONE

Sample Case 1
Sample Input 1
8
1
2
3
4
3
3
2
1
 
Sample Output 1
8
6
4
1
 
Explanation 1
    lengths       cut length   pieces
1 2 3 4 3 3 2 1       1           8
_ 1 2 3 2 2 1 _       1           6
_ _ 1 2 1 1 _ _       1           4
_ _ _ 1 _ _ _ _       1           1
_ _ _ _ _ _ _ _     DONE        DONE*/

//int a[] = { 1 ,2 ,3 ,4 ,3 ,3 ,2 ,1 };

package Practice;

public class BambooPieces {
	static int cOf0 = 0, k = 0; // made static

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 3, 3, 2, 1 };
//		int a[] = { 5 ,4 ,4 ,2 ,2 ,8  };
		int res[];
		res = bamboo(a);
		for (int x = 0; x < k; x++)
			System.out.print(res[x] + " ");
		System.out.println("bsja " + cOf0);
	}

	static int pcs[] = new int[10]; // static else new pcs made for every recursive call n final array is not
									// correct

	public static int[] bamboo(int a[]) {
		int countOfPcs = 0, min = Integer.MAX_VALUE, size = a.length, cOf0 = 0;
		for (int i = 0; i < size; i++) {
			if (a[i] != 0) {
				countOfPcs++;
				if (a[i] < min)
					min = a[i];
			} else {
				cOf0++;
			}
		}
		if (cOf0 == size) {
			System.out.println(cOf0 + " cof0 ");
			return pcs;
		}
		pcs[k++] = countOfPcs;

		for (int j = 0; j < size; j++) {
			if (a[j] != 0)
				a[j] -= min;
		}
		bamboo(a);
		return pcs;
	}
}
