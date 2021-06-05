package com.green;

public class TestArray1 {
	
	// 박초롱 윤보미 정은지 손나은 김남주 오하영

	public static void main(String[] args) {
		System.out.println("---------방법1---------");
		
		String apink1 = "박초롱";
		String apink2 = "윤보미";
		String apink3 = "정은지";
		String apink4 = "손나은";
		String apink5 = "김남주";
		String apink6 = "오하영";
		
		System.out.println(apink1);
		System.out.println(apink2);
		System.out.println(apink3);
		System.out.println(apink4);
		System.out.println(apink5);
		System.out.println(apink6);
		
		System.out.println("---------방법2---------");
		
		//------------------------------
		// 배열 - 여러 변수의 모임, apink[0], ... apink[5]
		// 0 : index 색인, 첨자 apink[0]번째 방
		// 1차원 배열
		
		String[] apink = new String[6]; // 배열 생성
		
		apink[0] = "박초롱"; apink[1] = "윤보미";
		apink[2] = "정은지"; apink[3] = "손나은";
		apink[4] = "김남주"; apink[5] = "오하영";
		
		System.out.println(apink[0]);
		System.out.println(apink[1]);
		System.out.println(apink[2]);
		System.out.println(apink[3]);
		System.out.println(apink[4]);
		System.out.println(apink[5]);
		
		System.out.println("---------방법3---------");
		
		String[] apinks = new String[] { // 초기값을 줄때는 숫자를 할당하면 안된다.
				"박초롱","윤보미","정은지","손나은","김남주","오하영","아이유"
		};
		
		// for 입력후 ctrl + space 입력시 알아서 입력된다.
		// for (int i = 0; i < apinks.length; i++) { } 
		
		int n = apinks.length; // 배열의 갯수
		for(int i = 0; i < n; i++) {
			// apink라고 입력을 하면 배열의 범위를 넘기 때문에 
			// ArrayIndexOutOfBoundsException이 발생한다.
			System.out.println(apinks[i]);
		}
		
		System.out.println("---------방법4---------");
		
		int i = 0;
		for(String tmp: "박초롱,윤보미,정은지,손나은,김남주,오하영".split(",")) {
			apink[i] = tmp;
			i++;
		}
		
		for(String tmp : apink) {
			System.out.println(tmp);
		}
	}

}
