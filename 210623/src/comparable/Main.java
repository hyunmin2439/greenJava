package comparable;

import java.util.Arrays;

// Comparable
// public int compareTo(T o); 
// => 추상 메소드 하나만 가지고 있다. (다른거 없음...)

class Human implements Comparable<Human>{
	double height;
	double weight;
	double bmi;
	
	public Human(double height, double weight) {
		this.height = height;
		this.weight = weight;
		
		this.bmi = weight / Math.pow(height / 100, 2);
		this.bmi = Math.round(this.bmi * 10) / 10.0; 
		// round는 소수점 첫번째 기준으로 전부 올림
		// 때문에 미리 10을 곱해서 첫번째 올리고 10으로 다시 나눠서 담음
		// ex) 18.245 => 182.45 => 183 => 18.3
	}

	// 양수: 왼쪽 크면 / 0: 같다 / 음수: 오른쪽 크면
	
	@Override
	public int compareTo(Human other) { // Generic 지정 -> Comparable<Human> : Object -> Human
		//Human other = (Human) o; // Down Casting을 할 필요가 없어진다.
		
		/*
		if(this.bmi > other.bmi) { 
			return 1;
		} else if (this.bmi < other.bmi) {
			return -1;
		}
		return 0;
		*/
		
		// 비교를 할 필요 없이 이렇게 리턴해주면 더 간단하게 처리된다.
		return (int)(this.bmi - other.bmi);
	}

	@Override
	public String toString() {
		return "Human [height=" + height + ", weight=" + weight + ", bmi=" + bmi + "]";
	}
}

public class Main {

	public static void main(String[] args) {
		Human h = new Human(180, 60);
		Human h2 = new Human(190, 66);
		Human h3 = new Human(175, 65);
		
//		System.out.println(h.compareTo(h2));
		
		int[] arr = { 30, 3, 2, 55, 44 };
		
//		Arrays.sort( arr );
//		System.out.print( Arrays.toString(arr) ); // Arrays도 더 공부해야 함
		
		// Arrays : 배열에 대한 메소드를 모아놓은 클래스, 배열 검색, 채우기, 정렬 등등
		Human[] human = new Human[] { h, h2, h3 };
		Arrays.sort(human); // 정렬을 부르게 되면 자동으로 compareTo를 호출하여 사용
		System.out.println( "BMI지수기준 : " + Arrays.toString(human) ); // bmi기준으로 정렬했기 때문에 bmi 기준으로 나온다.
		
		// Human 클래스 안에서 비교를 하는 것이 아닌 하는 클래스를 따로 둔다.
		HumanWeightComparator comWei = new HumanWeightComparator();
		HumanHeightComparator comHei = new HumanHeightComparator();
		
		//System.out.println( comWei.compare(h, h2) ); 비교한 int값 return
		
		Arrays.sort(human, comWei); // 비교기를 함께 넘겨주어서 몸무게 기준으로 정렬을 할 수 있도록 만들어 준다.
		System.out.println( "몸무게기준 : " + Arrays.toString(human) );
		
		Arrays.sort(human, comHei);
		System.out.println( "키 기준 : " + Arrays.toString(human) );
		
		//Comparator를 여러개 두고 메인에서 비교할 대상을 선택하면 comWei, comHei 든 선택해서 정렬하게 하면 될 것 같다.
	}

}
