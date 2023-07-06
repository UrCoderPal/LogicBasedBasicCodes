package Practice;

public class RemovingRepeatedSingleLoop {

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 2, 1, 4, 2, 3, 3, 3 };
		int i, j, count = 0;
		for (i = 0, j = i + 1; j < a.length; j++) {
			if (a[i] != a[j]) {
				i++;
				a[i] = a[j]; // took a[i+1] here which wasnt working cz comparing reference will always be
								// index0 then cz we have to increment i when a distinct is found not just put a
								// distict at neighbour but also check for another distinct ie 1->2 distinct
								// found replace neighbour by 2 now refernce to check is 2 something distinct
								// from 2 so 2->3 ie y we increment
				count++;
			}
		}
		System.out.println("With no consecutive repeats is ");
		for (int i1 = 0; i1 <= count; i1++)
			System.out.print(a[i1] + " ");
	}
}
/*
 logic is j will look for distinct n then we replace next elm where i is cz we want to have one ocrnc of i 
 with this we also achieve that if a[i]==a[j] toh dnt swap cz then again i will have a repeat at its next 
 */