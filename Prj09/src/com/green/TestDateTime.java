package com.green;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDateTime {

	public static void main(String[] args) {
		double piValue = Math.PI;
		
		// 0 1 2 3 4 5 6
		String[] wkday = { "일", "월", "화", "수", "목", "금", "토" };
		String[] wkdayh = { "日", "月", "火", "水", "木", "金", "土" };

		// 현재 java에서는 잘 안쓴다.
		// 하지만 javaScript에서는 아직까지 쓴다.
		Date today = new Date(); // java.util 안에는 생성자 new Date()가 있다.
		// 현재 컴퓨터의 시간과 날짜를 가져옴
		int yy = today.getYear() + 1900;
		int MM = today.getMonth() + 1; // 0 ~ 11
		int dd = today.getDate();

		int hh = today.getHours();
		int mm = today.getMinutes();
		int ss = today.getSeconds();

		int weekDay = today.getDay(); // 요일 0(일) 1(월) ~

		System.out.printf("%4d년 %2d월 %2d일 %2d시 %2d분 %2d초 %s요일\n\n", yy, MM, dd, hh, mm, ss, wkday[weekDay]);

		// Calendar
		Date today2 = new Date(); // 객체 생성
		Calendar cal = Calendar.getInstance(); // singleton pattern

		cal.setTime(today2);
		int yy2 = cal.get(Calendar.YEAR);
		int MM2 = cal.get(Calendar.MONTH) + 1;
//		int dd2 	 = cal.get(Calendar.DATE); 		// 31일
		int dd2 = cal.get(Calendar.DAY_OF_MONTH); // 31일 무슨 차인지 모르겠음.
		int hh2 = cal.get(Calendar.HOUR_OF_DAY); // 24시간제
		int hh2_2 = cal.get(Calendar.HOUR); // 12시간제
		int mm2 = cal.get(Calendar.MINUTE);
		int ss2 = cal.get(Calendar.SECOND);
		int ms2 = cal.get(Calendar.MILLISECOND);
		int weekDay2 = cal.get(Calendar.DAY_OF_WEEK); // 요일 1(일) 2(월) ~

		// 0을 앞에다 붙이면 앞에 0이 붙는다.
		System.out.printf("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초 %s曜日\n\n", yy2, MM2, dd2, hh2, mm2, ss2,
				wkdayh[weekDay2 - 1]);

		// Calendar File의 날짜 불러오기
		File file1 = new File("D:\\국비교육", "시간표.xlsx");
		Date today3 = new Date(file1.lastModified()); // 파일의 마지막 수정날짜
		Calendar cal3 = Calendar.getInstance(); // singleton pattern

		cal.setTime(today3);
		int yy3 = cal.get(Calendar.YEAR);
		int MM3 = cal.get(Calendar.MONTH) + 1;
		int dd3 = cal.get(Calendar.DAY_OF_MONTH);
		int hh3 = cal.get(Calendar.HOUR_OF_DAY); // 24시간제
		int hh3_2 = cal.get(Calendar.HOUR); // 12시간제
		int mm3 = cal.get(Calendar.MINUTE);
		int ss3 = cal.get(Calendar.SECOND);
		int ms3 = cal.get(Calendar.MILLISECOND);
		int weekDay3 = cal.get(Calendar.DAY_OF_WEEK); // 요일 1(일) 2(월) ~

		// 0을 앞에다 붙이면 앞에 0이 붙는다.
		System.out.printf("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초 %s曜日\n\n", yy3, MM3, dd3, hh3, mm3, ss3,
				wkdayh[weekDay3 - 1]);

		// SimpleDateTime
		// 12/11/21 - 21년 12월 13일 - 미국식
		// 12/11/21 - 21년 11월 12일 - 영국식

		// Locale이 어느 나라이냐에 따라 달라진다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.KOREA); // mm:11 MM:05 / hh:07 HH:19
		Date today4 = new Date();
		String dTime = sdf.format(today4);
		System.out.println(dTime);
	}
}
