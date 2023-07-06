package Practice;

/*logic
i mera dhundta hai 0, 0 aane pe ruk jaata hai
j tab chalta hai ek kadam aage ka elm swap karne 
ek agla isliye cz j ko pura time i pe depend nahi rakh sakte j=i+1 se cz suppose back to back zeros hai i wud never move then n j=i+1 bhi agle idx pe hi atke rahega no mvmnt in i or j so j has to keep moving if i has got a zero swap n keep moving in psbl hunt of non zero until end of array  */

public class ShiftingZeros {

	public static void main(String[] args) {

		int[] a = { -1, 0, 2, 0, 3, 4, 8, -5 };
		for (int i = 0, j = i + 1; j < a.length - 1;) // IOOB xpn came up cz term cndtn was j<a.len which shud be -1 cz
														// we wud in dat case check j<len yes andar aaega for say last
														// index then else me ++ karre so a[len] ie IOOB jaaega cz usual
														// for loop me j++ ke turant baad term cndtn check hota yaha
														// apan check karre fir ++ karre fir access rather than usual ++
														// check only then access
		{
			if (a[i] != 0) {
				i++;
				j = i + 1; // no ya ek hi zero ho toh error deta ye nahi kiya toh cz no zero case me j++
							// hoga hi nahi so let i drive j to end
			}

			else {
				j++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		for (int x : a)
			System.out.print(x + " ");
	}
}

//desc sort nahi sochna aiseme cz then -ve values pe lafda

/*
 * if it was a list predefined methods that cud be used
 * 
 * List<Integer> list = Arrays.asList(-1, 0, 2, 0, 3, 4, 0, -5);
 * 
 * //Remove all zeros from the list list.removeIf(element -> element == 0);
 * 
 * //Add the removed zeros at the end of the list int zeroCount =
 * Collections.frequency(list, 0); list.addAll(Collections.nCopies(zeroCount,
 * 0));
 * 
 * //Print the shifted list System.out.println(list);
 */