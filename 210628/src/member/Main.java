package member;

import java.util.Scanner;

/*
 * 회원 : 이름, 나이, 전화번호
 * 
 * 콘솔 프로그램. (입/출력)
 * 
 * 1. 회원 등록 - 이미 등록된 회원 X, 전화번호(PK)!!!!
 * 2. 회원 목록
 * 3. 회원 삭제
 * 4. 회원 정보 수정
 */

public class Main {

	public static void main(String[] args) {
		boolean isExit = false;
		MemberList list = new MemberList();
		Scanner sc = new Scanner(System.in);
		
		while( !isExit ) {
			System.out.println("1. 회원등록\n"
					+ "2. 회원 목록\n"
					+ "3. 회원 삭제\n"
					+ "4. 회원 정보 수정\n"
					+ "0. 종료");
			int sw = sc.nextInt();
			sc.nextLine();
			
			switch(sw) {
			case 0: isExit = true; break;
			case 1: {
				System.out.println("회원정보입력 : (이름, 나이, 전화번호)");
				String[] line = sc.nextLine().trim().split(",");
				list.regitMember(line[0].trim(), 
						Integer.parseInt(line[1].trim()), line[2].trim());
				break;
			}
			case 2: {
				list.printMemberList();
				break;
			}
			case 3: {
				System.out.println("삭제할 회원의 전화번호를 입력해주세요.");
				list.removeMember( sc.nextLine().trim() );
				break;
			}
			case 4: {
				System.out.println("수정할 회원의 전화번호를 입력해주세요.");
				list.modifyMember( sc.nextLine().trim() );
				break;
			}
			} 
		}
		
		sc.close();
	}

}
