package collection;

public class Var {
	// parameter 개수가 정해져 있지 않을 때 ... 사용
	// 가변 길이 인자 ...은 항상 뒤에 있어야 한다. 
    // (int... params, double d)로 하면 params가 언제 끝날지 모른다.
	// 때문에 (double d, int... params)로 가변 길이 인자는 맨뒤에 있어야 한다.
	// params는 배열의 형태로 parameter를 받는다.
	
	public static void some(double d, int... params) { 
		for(int i = 0; i < params.length; i++) {
			System.out.println(params[i]);
		}
	}

	public static void main(String[] args) {
		some(1, 2, 3, 4, 5); // 1은 d에 들어가고, 2 ~ 5는 params에 넘겨진다.
		some(1, new int[] {3, 4, 5, 6}); // 애초에 배열로 넘겨줘도 된다.
	}
}
