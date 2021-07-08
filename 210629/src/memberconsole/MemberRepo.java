package memberconsole;

import java.util.List;

// 인터페이스를 만들어서 기능들을 먼저 틀을 잡아놓고 
// 추후 클래스로 제작하여 기능들을 구현하는 방법도 있다.

public interface MemberRepo {
	void add(Member m);
	void delete(int index);
	void set(int index, Member m);
	List<Member> getList();
}

class MemberRepoImpl implements MemberRepo {
	@Override
	public void add(Member m) {
		
	}

	@Override
	public void delete(int index) {
		
	}

	@Override
	public void set(int index, Member m) {
		
	}

	@Override
	public List<Member> getList() {
		return null;
	}
}