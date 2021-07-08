package foreach;

public class ForEachMain {

	public static void main(String[] args) {
		int[] 	 intArr = { 5, 6, 22, 3, 2 };
		double[] dblArr = { 1.1, 2.2, 3.3 };
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.print( intArr[i] + " " );
		}
		
		System.out.println();

		for(int i = intArr.length - 1; i > - 1; i--) {
			System.out.print( intArr[i] + " " );
		}
		
		System.out.println();
		
		for(int i : intArr) {
			System.out.print( i + " " );
		}
		
		System.out.println();
		
		for(double d : dblArr) {
			System.out.print(d + " ");
		}
	}
}
