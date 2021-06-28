package pizzastore;

public class Main {

	public static void main(String[] args) {
		// 고객 (단골 피자가게를 알고 있음
		//		, 단골 피자가게에 피자를 주문할 수 있음
		//		, 가지고 있는 피자 상태값을 콘솔창에 출력할 수 있음)
		
		// 피자가게 (종업원 한명, 요리사 한명이 있음)
		// 종업원 - 주문을 받을 수 있음. -> 받은 주문을 요리사에게 전달함.
		// 요리사 - 피자를 만들 수 있음. -> 만든 피자를 종업원에게 전달함.
		
		// -- 시나리오 --
		// 고객을 한명 생성
		// 피자가게(종업원, 요리사) 생성
		
		// 고객이 피자를 주문 -> 받아 본 피자의 상태값을 콘솔창에 출력
		
		// int      ss   = 5;
		Customer cos 	= new Customer("콤비네이션"); // 고객 생성(원하는 피자 이름)
		Staff 	 staff 	= new Staff(); // 점원 생성
		Shef 	 shef 	= new Shef();  // 요리사 생성
		
		// 고객이 원하는 피자이름 가져와서 점원이 주문 받음
		staff.setPizzaName( cos.getWishPizza() );
		
		// 점원이 고객에게 받은 피자 이름 -> pizzaName에 저장.
		String pizzaName = staff.getPizzaName();
		
		// 요리사가 pizzaName으로 pizza 만듬
		Pizza pizza = shef.cookPizza( pizzaName );
		
		// 만든 pizza를 점원에게 건내줌
		staff.setPizza( pizza );
		
		// 점원이 가지고 있는 pizza를 고객에게 건내줌
		cos.setPizza( staff.getPizza() );
		
		// 고객이 가지고 있는 pizza 이름 출력
		System.out.println( cos.getPizza().getPizzaName() );
		
	}

}
