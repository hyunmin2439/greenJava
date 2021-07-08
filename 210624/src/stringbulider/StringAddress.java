package stringbulider;

public class StringAddress {

	public static void main(String[] args) {
		// char 배열 => 문자열 => char 배열
		char[] chArr = { 'A', 'B', 'C' };
		String str   = new String(chArr);
		char[] tmp   = str.toCharArray();
		
		String abc = "abc";
		String abcdef = abc + "def";
		
		String abc2 = "abc";
		
		System.out.println(abc.hashCode());
		System.out.println(abc2.hashCode());
		
		String abc3 = new String("abc");
		
		System.out.println(abc.hashCode());
		System.out.println(abc3.hashCode());
		
		// 주소(해쉬 코드)가 전부 다 같다.
		
		abc2 += "abc";
		System.out.println(abc); // abc
		System.out.println(abc2); // abcabc

	}

}
