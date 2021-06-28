package testclass;

import java.util.ArrayList;
import java.util.List;

public class CarrotFactory { // 객체(당근)를 만드는 객체(공장)
	// 당근을 만들어서 주면 됨.
	public List<Carrot> makeCarrots(int count) {
		List<Carrot> clist = new ArrayList<>();
		
		for(int i = 0; i < count; i++) {
			clist.add( new Carrot(15) );
		}
		
		return clist;
	}

}
