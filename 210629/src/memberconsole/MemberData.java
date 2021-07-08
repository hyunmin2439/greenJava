package memberconsole;

import java.util.ArrayList;
import java.util.List;

public class MemberData {
	List<Member> list = new ArrayList<>();

	public void add(Member m) {
		list.add(m);
	}
	
	public void delete(int index) {
		list.remove(index);
	}
	
	public void set(int index, Member newMember) {
		list.set(index, newMember);
	}
	
	public List<Member> getList() {
		return list;
	}
	
}
