package com.green;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class StringTest {

	public static void main(String[] args) {

		// 문자열 조작 함수들 : 이것들은 외울 것
		// 문자열 저장방법
		//			  01234567 8 9 01234567 8  // 19개
		String 	s1 = " Hello 李순신 123 A 가 ";
		char	ch1 = '한';
		//						 0 1 2 3 4 56789012 = 13
		String 	s2 = new String("안녕하세요 Mark 41");
		// 각 방법들은 내부적으로 약간 차이가 있다.
		
		System.out.println( s1 );
		System.out.println( s2 );
		
		// 문자열 길이
		
		// C언어 처럼 한글은 2Byte라서 length가 *2로 쳐서 계산하지 않는다 영어와 똑같이 1개로 본다.
		// java 처음 나올때는 UTF-16체계를 썼지만
		// 현재는 UTF-16을 살짝 고쳐서 UTF-8로 쓴다.
		
		// 배열은 length를 썼지만 String은 length() => 메소드
		int len1 = s1.length(); 
		System.out.println( len1 );
		
		int len2 = s2.length();
		System.out.println( len2 );
		
		// 한글이든 영어든 length는 Byte 단위가 아니라 글자수를 센다
		// EUC-KR : 영어 1Byte / 한글(영어 말고 나머지) 2Byte
		// UTF-8  : 		   / 한글(일본어, 나머지) 3Byte
		
		
		// 특정 위치의 문자 charAt ( index )
		System.out.println( s1.charAt( 7 ) );
		
		// 문자의 코드 codePointAt( index )
		System.out.println( s1.codePointAt( 15 ) ); // 'A'  => 65
		System.out.println( s1.codePointAt( 17 ) ); // '가' => 44032(Unicode)
		
		
		// 문자열 비교 equals : 값이 같냐 다르냐를 따질 때 사용
		String s3 = "이순신";
		String s4 = "이순신";
		
		System.out.println( (s3 == s4) );	 	 // true, 주소비교, heap 메모리의 같은 위치
		System.out.println( ( s3.equals(s4) ) ); // true, 값  비교
		
		String s5 = new String("이순신");
		String s6 = new String("이순신");
		
		System.out.println( (s5 == s6) );	 	 // false, 주소비교, heap 메모리의 다른 위치
		System.out.println( ( s5.equals(s6) ) ); // true,  값  비교	
		
		
		// 대문자 / 소문자로 바꾸기
		String s7 = "john. f. kennedy";
		String s8 = "John. F. Kennedy";
		
		System.out.println(s7.toUpperCase()); // 다 대문자
		System.out.println(s7.toLowerCase()); // 다 소문자
		System.out.println(s8.toUpperCase()); // 다 대문자
		System.out.println(s8.toLowerCase()); // 다 소문자
		
		System.out.println( s7.equals(s8) ); // false
		System.out.println( s7.equalsIgnoreCase(s8) ); // true : 대소문자 무시하고 비교
		
		
		
		// 문자, 문자열 찾기 indexOf : 한번에 하나만 찾을 수 있다.
		//		     01234567890123
		String s9 = "Hello World!!!";
		
		int pos = s9.indexOf('o'); // 4
		System.out.println( pos );
		
				    //indexOf(int ch, int fromIndex) : fromIndex 위치부터 찾아준다.
		int pos2 = s9.indexOf('o', pos  + 1); // 7
		System.out.println( pos2 );
		
		int pos3 = s9.indexOf('o', pos2 + 1); // -1 : not found
		System.out.println( pos3 );
		
		int pos4 = s9.lastIndexOf('o'); // 7 : 뒤에서 부터 찾아준다. 뒤에서 0 1 2 ~ 이렇게 찾지는 않는다.
		System.out.println( pos4 );
		
		int pos5 = s9.lastIndexOf("lo"); // 문자열도 가능
		System.out.println( pos5 ); // 3 : l의 위치를 return
		
		
		// 비교 : 문자열 비교(순서) compareTo : 주로 순서를 따질때, 값을 비교하는 것도 있음
		// 순서를 따지고 sorting 할때 굉장히 중요한 함수이다.
		// s10  > s11 :  >  0  양수
		// s10 == s11 : ==  0   0,  같은 문자열
		// s10  < s11 :  <  0  음수
		
		String s10 = "alpha";  //"이순신" 
		String s11 = "beta";   //"이이"  
							   // 결과 : : - 1368
							   // 이 : 이 => 순 : 이 (비교시 - 1368)
		
		int p1 = s10.compareTo( s11 );
		System.out.println( p1 ); // a : b (비교시 -1)
		
		int p2 = s7.compareToIgnoreCase(s8); // 대소문자 무시하고 비교
		System.out.println( p2 ); // 0 같은 문자열
		
		
		// 포함되어 있다 contains
		System.out.println( s9.contains( "World" ) ); // true
		System.out.println( s9.contains( "world" ) ); // false
		
		// 대소문자 구분 없이 찾고 싶다. 아래 방법 외에도 다양한 방법이 있다.
		System.out.println( s9.toLowerCase().contains("world") ); // true
	
		
		// 문자열 분리 : split
		String 	  nameStr = "짱구,짱아,철수,희동,둘리,다오,디지니";
		String [] names = nameStr.split(",");
		for(int i = 0; i < names.length; i++) {
			System.out.println( names[i] );
		}
		
		String 	  str1 = "abcdefghijklmnopqrstuvwxyz";
		String [] strSplit = str1.split(""); // 한 글자씩 잘려서 문자 배열에 저장된다.
		System.out.println( Arrays.toString( strSplit ) ); // [a, b, ... , z] 이렇게 출력된다.
		
		
		// 문자열 결합 "+"
		// Jane Doe, John Doe 우리나라 홍길동 같은 미국의 이름.
		
		String firstName = "Jane";
		String lastName  = "Doe";
		
		String fullName = firstName + " " + lastName;
		// " + " : 문자열 결합(concatenate) 연산자
		System.out.println(fullName);
		
		// StringBuilder를 쓸 상황에서는 + 연산자를 못쓴다. concat을 써야 한다.
		// method chaining
		fullName = firstName.concat(" ").concat( lastName ); // (1) firstName.concat(" ")
															 // (2) 1.concat( lastName  을 수행한다.
		System.out.println( fullName );
		
		
		// 문자열 바꾸기
		String msg  = "Hello 자바! 자바 프로그래밍";
		System.out.println(msg);
		
		String msg2 = msg.replace("자바", "Java"); 
		// C언어는 바껴서 넘겨주는 것이 아니라 자기 자신이 바뀐다.
		// 하지만 replace는 바뀐 것을 넘겨준다.
		// 여러번 변경된다. JavaScript는 한번만 바뀐다. 옵션을 걸어줘야 여러번 바뀐다.
		
		System.out.println(msg);
		System.out.println(msg2);
		
		// public String replaceAll(String regex, String replacement)
		// replaceAll 메소드는 문자열에서 특정 문자열을 대체하여 
		// 다른 문자열로 치환하는 메소드
		// ex) String s1 = "HelloHelloHello;
		//	   System.out.println( s1.replaceAll("Hello", "A") );
		//     => AAA
		
		
		// 부분 문자열 추출 : substring
		//				   01234567
		String hiredate = "20080501";
		int    hYear	= Integer.parseInt( hiredate.substring(0, 3 + 1) );
		int    hMonth	= Integer.parseInt( hiredate.substring(4, 5 + 1) );
		int    hDate	= Integer.parseInt( hiredate.substring(6, 7 + 1) );
		String weekDay = getWeekofDay( hYear, hMonth, hDate );
		
		// String은 %02s 같이 사용하지 못한다.
		System.out.printf("%4d년 %02d월 %02d일 %s요일\n", hYear, hMonth, hDate, weekDay );

		
		// String 문자열 결합연산자 +는 String Builder 사용하는 것이 속도가 빠르다.
		// but. 자바 1.5부터는 문자열 + 연산자 사용시 내부적으로 StringBuilder로 변환해줌.
		StringBuilder sb = new StringBuilder();		// String sb;
		sb.append("하이 Hello");					// sb = sb + "하이 Hello"
		sb.append(" ");								// sb = sb + " "
		sb.append("World");							// sb = sb + "World"
		System.out.println( sb );
		System.out.println( sb.length() );
		System.out.println( sb.toString() );
		
		
		// 중간의 공백을 제거하는 함수를 만들어라
		String name01 = "이 순 신";
		System.out.println( name01 );
		
		char [] result = delBlank( name01 );
		
		// 바로 출력가능 하지만 추천하는 방법은 아님
		System.out.println( result );
		
		// char 배열을 String으로 새로 생성해서 nameNew를 가르키함
		String nameNew = new String( result );
		System.out.println( nameNew );
		
		
		// 간단한 공백 제거 방법
		String name02 = "이    순     신";
		System.out.println( name02.replace(" ", "") );
		// 추가적인 공백 제거 방법은 210603 메모장 참조
		
		
		// 왜 어렵게 char배열을 써서 하였나?
		// 문자열을 나열해놓고 특정 조건 숫자, 문자를 뽑아내는 알고리즘들이 있다.
		
	}

	// 배열을 리턴
	private static char[] delBlank(String name) {
//					i       0     1    2     3    4
//		char [] orgStr = { '이', ' ', '순', ' ', '신'};
//		char [] newStr = { '이', '순', '신'};
//		           pos      0     1     2
		
		int n		   = name.length();
		int pos		   = 0;
		
		char [] orgStr = new char[ n ];
		char [] newStr = new char[ n ]; // 공백이 하나도 없을 수도 있기 때문에 
										// 같은 크기의 배열로 만들어야 한다.
		
		for (int i = 0; i < n; i++) {
			orgStr[i] = name.charAt( i );
			
			if( orgStr[i] != ' ' ) {
				newStr[pos] = orgStr[i];
				pos++;
			}
		}
		
		return newStr;
	}


	// 요일, 날짜 사용법 책으로 다시 한번 살펴봐야한다.
	private static String getWeekofDay(int hYear, int hMonth, int hDate) {
		//					0     1     2     3     4     5     6
		String [] yoil = { "일", "월", "화", "수", "목", "금", "토"};
		
		Date 	theDate = new Date( hYear - 1900, 5 - 1, 1);
		// System.out.println( theDate.toLocaleString() ); // 데이터 확인용
		// parameter를 그대로 넣으면 3908. 6. 1 오전 12:00:00
		// => 년도는 2008 - 1900 = 108, 달은 12진수 0 ~ 11부터 시작

		Calendar cal = Calendar.getInstance();
		cal.setTime( theDate );
		int wkDay = cal.get( Calendar.DAY_OF_WEEK); // 1 ~ 7
		
		// System.out.println(wkDay); // 데이터 확인용

		String 	weekDay = yoil[wkDay - 1];
		
		return weekDay;
	}
}
