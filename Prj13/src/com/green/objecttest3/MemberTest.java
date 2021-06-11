package com.green.objecttest3;

class Member {
	private String id;

	public Member(String id) {
		super();
		this.id = id;
	}
	

	public String getId() {
		return id;
	}

	// 업무적으로도 equals의 코딩은 자기 자신이 하는 것.
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if( obj instanceof Member ) {
			Member member = (Member) obj;
			if( this.id.equals( member.id ) ) // 문자열 데이터를 비교
				result = true;
		}
		
		return result;
	}
	
}

public class MemberTest {

	public static void main(String[] args) {
		Member m1 = new Member("sky");
		Member m2 = new Member("moon");
		Member m3 = new Member("moon");
		
								// HashCode가 다르다. 메모리상 주소가 다르다.
		System.out.println(m1); // Member@15db9742
		System.out.println(m2); // Member@6d06d69c
		System.out.println(m3); // Member@7852e922
		
		System.out.println( m1 == m2 ); // false
		System.out.println( m2 == m3 ); // false
		
		System.out.println( m1.equals(m2) ); // false
		System.out.println( m2.equals(m3) ); // false -> equals 재정의하면 true
		
		
		// Object 클래스의 equals()는 원래 == 연산자와 같이 hashCode를 비교한다.
		// equals()를 재정의하여 글자비교가 가능하도록 변경하면 문자열비교가 가능
		// String type의 경우 문자열 비교가 가능하도록 재정의 되어 있다.
		
		// 추가적인 정보  :  https://brunch.co.kr/@mystoryg/133
		// m1 ~ 3 객체 id String의 주소.
		// m2의 id인 moon 
		// m3의 id인 moon 두개의 주소가 왜 같을까?
		// String 객체를 만들때 JVM이 m2 moon을 생성하고
		// m3 moon을 만드려고 보니 이미 생성되어 있기 때문에
		// 같은 주소를 가르켜서 공간의 낭비를 줄이는 것.
		System.out.println( m1.getId().hashCode() ); // 113953
		System.out.println( m2.getId().hashCode() ); // 3357441
		System.out.println( m3.getId().hashCode() ); // 3357441
		System.out.println( m2.hashCode() == m3.hashCode() ); // false
		System.out.println( m2.getId().hashCode() == m3.getId().hashCode() ); // true
	}

}
