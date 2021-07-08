package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OtherSets {

	public static void main(String[] args) {
		// HashSet은 삽입한 순서를 유지해주지 않음.
		Set<String> set = new HashSet<>();
		set.add("Apple");	
		set.add("Banana");
		set.add("Carrot");
		set.add("Durian");
		System.out.println("HashSet : " + set);
		
		// LinkedHashSet은 넣은 순서를 유지해준다.
		Set<String> linkedSet = new LinkedHashSet<>();
		linkedSet.add("Apple");
		linkedSet.add("Carrot");
		linkedSet.add("Durian");
		linkedSet.add("Banana");
		System.out.println("\nLinkedHashSet : " + linkedSet);
		
		// TreeSet은 삽입 시 마다 대소비교를 통해서 순서를 정렬해서 넣는다.
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Apple");
		treeSet.add("Carrot");
		treeSet.add("Durian");
		treeSet.add("Banana");
		System.out.println("\nTreeSet : " + treeSet);
	}

}
