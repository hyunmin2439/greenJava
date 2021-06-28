package comparable;

import java.util.Comparator;

// int compare(T o1, T o1); // 추상메서드를 가지고 있음.
// 사람을 비교할 수 있는 Human Comparator(비교기)
// compare은 추상메소드이기 때문에 파라미터를 더 추가하는 방법은 안된다.
// 그래서 다른 정보로 비교를 할 경우에는 클래스를 하나 더 만드는 방법 밖에 없다.

public class HumanWeightComparator implements Comparator<Human> {

	@Override
	public int compare(Human o1, Human o2) {
		return (int)(o1.weight - o2.weight);
	}
	
}

class HumanHeightComparator implements Comparator<Human> {

	@Override
	public int compare(Human o1, Human o2) {
		return (int)(o1.height - o2.height);
	}
}