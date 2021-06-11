package com.green;

/* abstract class
 - 객체를 직접 생성할 수 있는 클래스를 실체 클래스라고 하는 반면, 
   이 실체 클래스들의 공통적인 속성(필드와 메소드)만 뽑아내어 선언한 클래스를 추상 클래스라 한다.
   
 - 추상 클래스는 new 연산자를 사용하여 객체를 생성할 수 없다.
 
 - 추상 클래스와 실체 클래스는 상속의 관계에 놓여있다.
 
 - 추상 클래스가 부모이고 실체 클래스가 자식으로 구현되며, 
   실체 클래스는 추상 클래스에 있는 속성 외에 추가적인 속성을 가질 수 있다.
   
 - 추상 클래스는 새로운 실체 클래스를 위한 부모 클래스의 용도로만 사용된다.
*/

// abstract 메소드가 있으면 클래스에도 붙여줘야 한다.
abstract class ParentClass {
	int field1;
	static char field2;
	
	abstract void methodA(); // { }가 없는 메소드 - abstract
	double methodB() {
		return 0.0;
	}
	void methodD() {
		
	}
}

// The type ChildClass must implement the inherited abstract method ParentClass.methodA()
class ChildClass extends ParentClass {

	// @ Annotation - 컴파일러에게 알려주는 역할을 한다.
	// @ Override : 재정의 한 것 - 수정 목적 : abstract, interface 두가지 경우는 반드시 재정의해야 한다.
	@Override
	void methodA() {
		System.out.println("ChildClass : " + field1);
	}
	
	static void methodC() {
		System.out.println("methodC()");
	}
	
}

public class TestMain {
	static int field1;

	public static void main(String[] args) {
		field1 = 12; // static해야지만 에러X
		System.out.println( field1 ); 
		
		TestMain.field1 = 34;
		System.out.println( TestMain.field1 );
		
		//------------------------------------------------------
		
		/* abstract로 변경시 error 발생 : Cannot instantiate the type ParentClass 
		   추상 클래스가 되면 상속 용도인 부모 클래스 용도로만 사용되기 때문에 new로 instance화 시킬 수 없다.
		   
		ParentClass pc1 = new ParentClass();
		pc1.field1 = 12;
		System.out.println(pc1.field1);
		*/
		
		// ParentClass.field1; //static이 아니라서 나오지 않는다.
		ParentClass.field2 = 'A'; //static이기 대문에 가능
		System.out.println( ParentClass.field2 );
		
		// ParentClass의 모든 field 메소드를 다 쓸 수 있다.
		// 부모의 모든 것을 복사해서 가져온다.
		ChildClass cc1 = new ChildClass();
		cc1.field1 = 123;
		System.out.println(cc1.field1);
		// pc1.field1 과 cc1.field은 다른 변수다.
		// 메모리 상에서 다른 것이다.
		
		cc1.methodA(); // 123
		// cc1.methodC();
		/* The static method methodC() from the type ChildClass 
		   should be accessed in a static way
		   ChildClass 유형의 정적 메서드 C()는 정적 방법으로 액세스해야 합니다.
		   그래서 아래와 같이 접근을 하였다.
		*/
		ChildClass.methodC();
	}

}
