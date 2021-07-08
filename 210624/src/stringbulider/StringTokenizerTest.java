package stringbulider;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String text = "apple ball car dog";
		
		StringTokenizer st = new StringTokenizer(text, " ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println();
		
		String[] split = text.split(" "); // split( 안에 정규표현식을 쓸 수 있다. )
		for(String s : split) {
			System.out.println(s);
		}
	}

}
