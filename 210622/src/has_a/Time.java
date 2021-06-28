package has_a;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	
	// getter / setter는 필요에 의해서 작성된다. 
	// 하지만 지금은 거의 법칙처럼 여겨진다.
	// 필드가 있으면 getter / setter가 있어야 한다.
	public void setHour(int hour) {
		if (hour > 25 && hour < 0) { // 잘못된 값이 들어오지 않게 감시
			this.hour = 0;
		}
		this.hour= hour;
	}

	// @ annotation : 컴파일러에게 알려주는 것.
	// @Override : 컴파일러에게 Override를 한다고 알려준다. 사람이다 보니 Override하다가 실수할 수도 있다.
	// 파라미터를 빼먹거나 메서드 이름이 틀릴 수가 있기 때문에 컴파일러가 오류를 잡아낼 수 있게 하는 것이다.
	
	// toString 필요 이유 : 만약 Main에서 Time 객체를 그냥 출력할 경우 Hash Code 값만 나온다.
	// 자신에게 맞는 방식으로 문자열로 보고 싶을 때 만들면 된다. 내가 확인 할 수 있는 가장 좋은 방식으로.
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
