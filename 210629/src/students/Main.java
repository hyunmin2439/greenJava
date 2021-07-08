package students;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean isExit = false;
		Scanner scan = new Scanner(System.in);
		School school = new School();
		
		while( !isExit ) {
			System.out.println(
					  "------------------------\n"
					+ "메뉴를 선택해주십시오.\n"
					+ "1. 학생등록\n"
					+ "2. 반 평균\n"
					+ "3. 전체 평균\n"
					+ "0. 종료\n"
					+ "-----------------------");
			int selectMenu = scan.nextInt();
			scan.nextLine();
			
			switch(selectMenu) {
			case 0: isExit = true; break;
			case 1: school.inputStudent(scan); break;
			case 2: {
				System.out.print("반을 입력해주십시오 : ");
				int num = scan.nextInt();
				scan.nextLine();
				school.printClassAvg(num);
				break;
			}
			case 3:
				school.printSchoolAvg();
				break;
			}
		}
		
	}

}
