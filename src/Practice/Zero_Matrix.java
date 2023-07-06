package Practice;

public class Zero_Matrix {

	public static void main(String[] args) {
		int[][] a = { { 1, 1, 1 }, { 1, 1, 1 }, { 0, 1, 1 } };
		System.out.println("Ur Array is");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int r = 0, c = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] == 0) {
					r = i;  //pehla 0 jidhar mila usko row(i) pakad 
					c = j;  // uska column(j) pakad
					break;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (i == r || j == c) //pakdele row n column pe match dhundhke 0 kar daal wo wo jagah pe 
				{
					a[i][j] = 0;
				}
			}
		}

		System.out.println("New Array is");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
