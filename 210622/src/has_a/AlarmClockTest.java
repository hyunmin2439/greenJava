package has_a;

public class AlarmClockTest {

	public static void main(String[] args) {
		Time alarm = new Time(6, 0, 0);
		Time current = new Time(12, 56, 34);
		AlarmClock c = new AlarmClock(alarm, current);
		
		System.out.println(c);
	}

}
