package com.green.objectarray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// 모든 클래스는 extends Object가 생략되어 있음.
class Member {
	int 	num;
	String 	name;
	String	tel;
	
	public Member() {
		
	}
	
	public Member(int num, String name, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}
	
	// 디버깅용으로 많이 쓴다. 코딩 스타일에 따라 안쓰는 사람도 있다.
	@Override
	public String toString() {
		return "번호=" + num + ", 이름=" + name + ", 전화=" + tel;
	}
	
	
	// Alt + Shift + S : Override/Implement Methods => 간단히 나옴. 코딩을 자신이 직접해야 한다.
	// 				   : Generate hashCode() and equals => 굉장히 길게 나옴. 자동으로 코딩을 알아서 다 해준다.
	// 중요 : Set에서 객체의 중복을 판단할 때는 hashCode( )와 equals( )를 사용하여 비교한다.
	// hashCode가 같은지 먼저 살펴본다 -> 같으면 equals를 사용해서 비교
	// hashCode가 같지 않으면 equals 동작 안함.
	
	
	/* 동작원리
	// 어려움. 코드가 이해가 안됨. 나중에 다시 살펴 볼것
	// hashCode : Heap 메모리의 위치비교
	
	@Override
	public int hashCode() {
		return tel.hashCode() + num;
	}
	
	// 객체의 데이터 비교 num, tel
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // obj가 Member타입의 인스턴스이냐?
			Member mem = (Member) obj; // 다운캐스팅
			boolean result = ( mem.num == this.num ) 
						  && ( mem.tel.equals(this.tel) );
			return result;
		}
		return super.equals(obj);
	}
	*/
	
	// 이것도 이해가 안됨. 나중에 다시 살펴 볼것
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	}
}

public class TestObjectArray {
	
	public static void main(String [] args) {
		// 3명 회원 정보
		int   [] nums = new int[5]; 
		Member[] mArr = new Member[ 3 ]; // 객체배열, 기본 type 배열과 다를 것이 없다.
		
//		Member	 m1	  = new Member(1, "홍길동", "010-1234-5678"); // new 다음에는 생성자 밖에 못 온다.
//		mArr[0] = m1; // 아래와 같이 만들면 하나의 줄로 가능.
		
		mArr[0] = new Member(1, "홍길동", "010-1234-5678");
		mArr[1] = new Member(2, "이세종", "010-1234-5678");
		mArr[2] = new Member(3, "이몽롱", "010-1234-5678");
		
		for (int i = 0; i < mArr.length; i++) {
			System.out.println( mArr[i] );
		}
		
		
		System.out.println("----------------------------------------------");
		//----------------------------------------------
		
		
		// 배열은 범위를 벗어나서 에러 발생하기 쉬움 때문에 ArrayList 사용하는 것이 좋다.
		ArrayList<Member> mList = new ArrayList<Member>();
		
		mList.add( new Member(1, "홍길동", "010-1234-5678") );
		mList.add( new Member(2, "홍길동", "010-2324-5438") ); // 1번과 2번은 다른 사람, 동명이인
		mList.add( new Member(3, "이몽롱", "010-7334-4688") );
		mList.add( new Member(4, "길동이", "010-2174-7835") );
		mList.add( new Member(1, "홍길동", "010-1234-5678") ); // 1번과 같은 사람이라서 정보가 들어가면 안된다.
		
		for(int i = 0; i < mList.size(); i++) {
			System.out.println( mList.get(i) );
		}
		
		
		System.out.println("----------------------------------------------");
		//----------------------------------------------
		
		// Set을 이용한 중복저장 방지
		// 일반 변수는 Set이 알아서 비교를 해서 걸러준다.
		
		// 하지만 Set<Member> 처럼 객체를 저장하면 비교메소드를
		// 재정의하여 추가하기 전에는 중복을 걸러내지 못한다.
		HashSet<Member> mSet = new HashSet<>();
		
		mSet.add( new Member(1, "홍길동", "010-1234-5678") );
		mSet.add( new Member(2, "홍길동", "010-2324-5438") ); // 1번과 2번은 다른 사람, 동명이인
		mSet.add( new Member(3, "이몽롱", "010-7334-4688") );
		mSet.add( new Member(4, "길동이", "010-2174-7835") );
		mSet.add( new Member(1, "홍길동", "010-1234-5678") ); // 1번과 같은 사람이라서 정보가 들어가면 안된다.
		
		System.out.println( mSet.size() );
		
		// for Ctrl + Space를 하면 처음에는 변수명이 선택되어 있는데
		// 바로 글자를 바꾸면 바로 다 바뀐다.
		for (Iterator<Member> iter = mSet.iterator(); iter.hasNext();) {
			Member member = (Member) iter.next();
			System.out.println( member );
		}
		/* 위의 출력 코드 간략화
		for (Member m : mSet) {
			System.out.println( m );
		}
		*/
	}
}
