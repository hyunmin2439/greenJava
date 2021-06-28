package has_a;

public class AlarmClock {
	private Time currentTime; // Time 객체가 포함된다.(has-a 관계)
	private Time alarmTime;   // has-a : 시계가 시간을 가지고 있다 || 시계가 시간을 알고 있다.
	
	// Time 객체는 private int hour / private int minute / private int second 정보를 다 가지고 있다.
	// 여기에 hour, minute, second를 가진 객체 여러개를 편하게 사용하기 위하여 클래스를 선언한다. (Time 클래스)
	// 그리고 그 클래스를 다른 클래스 안에서 활용하기 위해 has-a 관계로 클래스를 선언한다. (AlarmClock 클래스)
	
	public AlarmClock(Time a, Time c) {
		alarmTime = a;
		currentTime = c;
	}

	@Override
	public String toString() {
		return "currentTime = " + currentTime + "\nalarmTime = " + alarmTime;
	}
	
}
