/*Arrange the Words
A sentence is defined as a string of space-separated words that starts with a capital letter followed by lowercase letters and spaces, and ends with a period, i.e., it satisfies the regular expression ^[A-Z][a-z ]*\.$. Rearrange the words in a sentence while respecting the following conditions :
 
1.	Each word is ordered by length, ascending.
2.	Words of equal length must appear in the same order as in the original sentence.
3.	The rearranged sentence must be formatted to satisfy the regular expression ^[A-Z][a-z ]*\.$
 
Example
sentence = Cats and hats.
 
Order the sentence by word's length and keep the original order for the words with the same length.
•	Length 3: {and}
•	Length 4: {Cats, hats}
Reassemble the sequence of words so that the first letter is uppercase, the intermediate letters are lowercase, and the last one is a period.
The result is ' And cats hats.'
 
Function Description 
Complete the function arrange in the editor below.
 
arrange has the following parameter(s):
    string sentence:  a well formed sentence string
Returns:
    string: an ordered sentence string
 
Constraints
•	1 ≤ length of sentence < 105

Input Format for Custom Testing
Input from stdin will be processed as follows and passed to the function.
 
A single line of space-separated words, sentence.

Sample Case 0
Sample Input 0
STDIN                                         Function 
-----                                         -------- 
The lines are printed in reverse order.  →    sentence = 'The lines are printed in reverse order.'

Sample Output 0
In the are lines order printed reverse.
Explanation 0
Order the sentence by the lengths of the words and keep the original order for the words with the same length.
•	Length 2: {in}
•	Length 3: {the, are} . S
•	Length 5: {lines, order}. same length, keep the original order.
•	Length 7: {printed, reverse}. same length, keep the original order.
Reassemble the sequence of words so that the first letter is uppercase, the intermediate letters are lowercase, and the last one is a period.
The result is ' In the are lines order printed reverse.'

Sample Case 1
Sample Input 1
STDIN            Function
-----            --------
Here i come.  →  sentence = 'Here i come.'
Sample Output 1
I here come.
Explanation 1
Order the sentence by the lengths of the words and keep the original order for the words with the same length.
•	Length 1: {i}
•	Length 4: {here, come}
Reassemble the sequence of words so that the first letter is uppercase, the intermediate letters are lowercase, and the last one is a period.
The result is ' I here come'.

Sample Case 2
Sample Input 2
STDIN               Function
-----               --------
I love to code. →   sentence = 'I love to code.'
Sample Output 2
I to love code.
Explanation 2
Order the sentence by the lengths of the words and keep the original order for the words with the same length.
•	Length 1: {i}
•	Length 2: {to}
•	Length 4: {love, code}
Reassemble the sequence of words so that the first letter is uppercase, the intermediate letters are lowercase, and the last one is a period.
The result is ' I to love code.'*/

package Practice;

import java.util.Arrays;

public class RearrangingWordsInStringLengthWise {

	public static void main(String[] args) {

		String str = "My name is Mayur i am a student";
		String strL = str.toLowerCase();
		String[] a = strL.split(" ");
//		Arrays.sort(a, (n1, n2) -> n1.length() - n2.length()); // if no strategy passed sorts on char basis
//		iamyisamnamemayurstudent WORKS same result as manual bubble sort 

		for (String x : a)
			System.out.print(x);
		int L = a.length;
		for (int i = 0; i < L - 1; i++) {
			for (int j = 0; j < L - 1 - i; j++) {
				if (a[j].length() > a[j + 1].length()) {
					String temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
//		char t = (char) (a[0].charAt(0) - 32);
		System.out.println("After mods"); //i a my is am name mayur student
		/*
		 * for (String x : a) System.out.print(x);
		 */

		/*
		 * String newStr = ""; for (int i = 0; i < L; i++) { newStr += a[i] + " "; }
		 * System.out.println(newStr); //works this way to
		 */

		String newStrUsingJoin = String.join(" ", a);
		System.out.println(newStrUsingJoin);
		char t1 = newStrUsingJoin.charAt(0);
		System.out.println(t1);
		String res = newStrUsingJoin.substring(0, 1).toUpperCase() + newStrUsingJoin.substring(1);
		System.out.println(res);
//		System.out.println(Character.toUpperCase(newStrUsingJoin.charAt(0)));
	}
}
