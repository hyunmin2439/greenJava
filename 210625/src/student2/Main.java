package student2;

import java.io.IOException;
import java.util.Scanner;

/*
 * 학생 : 이름, 나이
 * 학급 : 학생이 여러명
 * 		 0. 학생을 추가, 삭제 가능
 * 		 1. 이름 순으로 학생목록을 콘솔창에 출력가능
 * 		 2. 나이 순으로 학생목록을 콘솔창에 출력가능
 * 		 3. 나이의 평균을 콘솔창에 출력가능.
 */

public class Main {

	public static void main(String[] args) throws IOException {
		boolean exit = false;
		SchoolClass school = new SchoolClass();
		Scanner sc = new Scanner(System.in);
		
		while( !exit ) {
			System.out.println("학생을 추가하려면 0\n" +
					"이름 순으로 학생목록을 출력하면 1\n" +
					"나이 순으로 학생목록을 출력하면 2\n" +
					"나이의 평균을 출력하려면 3\n" +
					"프로그램을 종료하려면 -1\n" +
					"을 입력해주세요.");
			
			int switNumber = sc.nextInt();
			sc.nextLine();
			
			switch(switNumber) {
			case -1: exit = true; break;
			case 0:
				boolean inputExit = false;
				System.out.println("이름,나이 순으로 ,를 붙여서 입력해주세요\n" +
						"같은 사람이 있을 경우 삭제됩니다.\n" +
						"종료하길 원하시면 -1을 입력해주세요.");
				
				while( !inputExit ) {
					String line = sc.nextLine().trim();
					if( line.equals("-1") ) inputExit = true;
					else {
						String[] split = line.split(",");
						school.newOrRem(split[0].trim(), Integer.parseInt(split[1].trim()));
					}
				}
				break;
			case 1: case 2:
				school.outputStdList(switNumber);
				break;
			case 3:
				school.avgAge();
				break;
			}
		}
		
		sc.close();
	}

}
