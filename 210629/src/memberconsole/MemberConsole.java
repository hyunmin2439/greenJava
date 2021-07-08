package memberconsole;

import java.util.List;
import java.util.Scanner;

public class MemberConsole {
	static Scanner scan = new Scanner(System.in);
	MemberData memberData = new MemberData();

	private int menu() {
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1. 회원등록");
		System.out.println("2. 회원목록");
		System.out.println("3. 회원삭제");
		System.out.println("4. 회원수정");
		System.out.println("0. 종료");
		
		return scan.nextInt();
	}
	
	private Member inputMember() {
		scan.nextLine();
		
		System.out.println("회원등록 정보를 입력하세요.");
		System.out.print("이름은? ");
		String name = scan.nextLine();
		
		System.out.print("나이는? ");
		int age = scan.nextInt();
		scan.nextLine();
		
		System.out.print("전화번호는? ");
		String phoneNumber = scan.nextLine();
		
		Member member = new Member(name, age, phoneNumber);
		return member;
	}
	
	private void printMembers(List<Member> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("-- %d번 회원 --\n", i + 1);
			Member m = list.get(i);
			System.out.println("이름: " + m.getName() );
			System.out.println("나이: " + m.getAge() );
			System.out.println("전화번호: " + m.getPhoneNumber() );			
		}
		System.out.println("-------------------------------");
	}
	
	private void process(int userInput) {
		switch( userInput  ) {
		case 1:
			Member member = inputMember();
			memberData.add(member);
			break;
		case 2:
			List<Member> list = memberData.getList();
			printMembers(list);
			break;
		case 3:
			System.out.println("삭제할 회원 번호를 입력하세요");
			int index = scan.nextInt();
			memberData.delete(index - 1);
			break;
		case 4:
			System.out.println("수정할 회원 번호를 입력하세요");
			int indexToDel = scan.nextInt();
			Member newM = inputMember();
			memberData.set(indexToDel - 1, newM);
			break;
		}
	}

	public void start() {
		System.out.println("안녕하세요");
		System.out.println("회원 등록 프로그램입니다.");
		while (true) {
			int userInput = menu();
			if (userInput == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			process( userInput );			
		}
	}
	
	public static void main(String[] args) {
		MemberConsole m = new MemberConsole();
		m.start();
		
		scan.nextLine();
		
	}

}
