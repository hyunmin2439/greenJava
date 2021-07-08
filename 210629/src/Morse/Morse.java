package Morse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Morse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Character, String> map = new HashMap<>();
		String[] morse = {"ㆍ－", "－ㆍㆍㆍ", "－ㆍ－ㆍ", "－ㆍㆍ", "ㆍ", "ㆍㆍ－ㆍ", "－－ㆍ", "ㆍㆍㆍㆍ", "ㆍㆍ",
				"ㆍ－－－", "－ㆍ－", "ㆍ－ㆍㆍ", "－－", "－ㆍ", "－－－", "ㆍ－－ㆍ", "－－ㆍ－ ", "ㆍ－ㆍ ", "ㆍㆍㆍ ",
				"－", "ㆍㆍ－", "ㆍㆍㆍ－", "ㆍ－－ ", "－ㆍㆍ－ ", "－ㆍ－－ ", "－－ㆍㆍ"};
		
		for(char c = 'A'; c <= 'Z'; c++) {
			map.put(c, morse[c - 65]);
		}
		
		System.out.println("영단어를 입력해주세요.");
		String word = scan.nextLine();
		String upper = word.toUpperCase().trim();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < upper.length(); i++) {
			String value = map.get( upper.charAt(i) );
			if(value != null) {
				sb.append(value);
			}
		}
		System.out.println(sb.toString());
		
		scan.close();
	}
}
