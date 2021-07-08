package member;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MemberList {
	private Set<Member> memberList;

	public MemberList() {
		super();
		memberList = new TreeSet<Member>();
	}

	// 회원 등록
	public void regitMember(String name, int age, String tel) {
		if( memberList.add( new Member(name, age, tel) ) ) {
			System.out.println("회원등록에 성공하였습니다.");
		} else {
			System.out.println("회원정보가 이미 존재합니다.");
		}
	}

	// 회원 목록
	public void printMemberList() {
		int i = 1;
		String result = "";
		for(Member member : memberList) {
			result += i + ". " + member + "\n";
			i++;
		}
		System.out.println(result);
	}
	
	// 회원 삭제
	public void removeMember(String tel) {
		boolean success = false;
		Iterator<Member> iter = memberList.iterator();
		
		while( iter.hasNext() ) {
			if( iter.next().getTel().equals(tel) ) {
				iter.remove();
				success = true;
				break;
			}
		}
		
		if(success) System.out.println("회원 삭제가 완료되었습니다.");
		else System.out.println("회원 정보가 존재하지 않습니다.");
	}

	// 회원정보 수정
	public void modifyMember(String tel) {
		boolean success = false;
		Iterator<Member> iter = memberList.iterator();
		Scanner sc = new Scanner(System.in);
		
		while( iter.hasNext() ) {
			Member member = iter.next();
			if( member.getTel().equals(tel) ) {
				System.out.println("수정할 이름, 나이를 입력해주세요.");
				String[] line = sc.nextLine().trim().split(",");
				String mName = line[0].trim();
				int    mAge  = Integer.parseInt( line[1].trim() );
				
				member.setName(mName);
				member.setAge(mAge);
				
				success = true;
				break;
			}
		}
		
		if(success) System.out.println("회원 정보 수정이 완료되었습니다.");
		else System.out.println("회원 정보가 존재하지 않습니다.");
		
		sc.close();
	}
}
