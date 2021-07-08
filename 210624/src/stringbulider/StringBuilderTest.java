package stringbulider;

import java.util.StringJoiner;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); 
		sb.append("One=");
		sb.append(1); // 문자로 취급해서 붙여준다.
		sb.append("\n").append("color=").append("red"); // append는 자기자신을 return 해준다.
		
		String result = sb.toString(); // StringBuilder()는 O|n|e|... 따로 가지고 있다가 
									   // 문자열로 만들어 달라고 할 때 문자열로 변환하여 준다.
									   // 이것을 쓰면 공간을 효율적으로 쓸 수 있다. (String은 쓸 때 마다 새로 생성)
		System.out.println(result);
		// 문자열을 붙일 때 사용. // 9delimiter : 구분자, prefix : 시작 문자, suffix : 끝 문자)
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		for(String s : new String[] {"A", "B", "C"}) {
			sj.add(s);
		}
		System.out.println(sj.toString());
	}

}
