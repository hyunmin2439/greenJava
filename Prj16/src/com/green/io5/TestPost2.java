package com.green.io5;

import java.io.*;
import java.util.ArrayList;

public class TestPost2 {

	public static void main(String[] args) {
		String 			file	= "c:\\imsi\\zipcode.csv";
		String			path	= "c:\\imsi\\";
		FileReader 		fr = null;
		BufferedReader 	br = null;
		
		FileWriter 		fw = null;
		BufferedWriter 	bw = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			// 배열 대체 사이즈를 모른다.
			ArrayList<String> 	sidoList 	= new ArrayList<String>();	// 시도 목록
			ArrayList<Integer> 	sidoCntList = new ArrayList<Integer>();	// 시도별 우편번호 수
			
			String 	line 	 = "";
			int		sidoCnt  = 0;
			int 	postCnt  = 0;
			String  prevSido = "";
			int		pos		 = -1;
			
			br.readLine(); // 제목줄 skip
			
			while( (line = br.readLine()) != null ) {
				String[] li = line.trim().split(",");
				String sido = li[1].trim();
				
				if( ! prevSido.equals(sido) ) { //시도가 변경될 때
					fw = new FileWriter(path + sido + ".txt"); // 새로운 파일 생성
					bw = new BufferedWriter(fw);
					
					sidoList.add( sido );
					prevSido = sido;
					sidoCnt++;
					postCnt = 0;
					sidoCntList.add( 0 );
					pos++;
				}
				
				postCnt++;
				sidoCntList.set(pos, postCnt);
				
				// 파일 쓰기
				bw.write(line + "\n");
				if(postCnt > 7000) { // 빈번하게 IO 접근하여 속도 떨어지는 것을 방지, 조금 더 좋은 방법이 있지 않을까?
					bw.flush(); // 안쓰면 서울을 쓰다가 buffer가 가득차서 데이터가 안들어감.
								// 안쓰면 서울 데이터가 8080개인데 7771개 밖에 출력이 안됨.
				}
			}
			
			int index = 0;
			for(String sido : sidoList) {
				System.out.println( sido + " " + sidoCntList.get(index) );
				index++;
			}
			System.out.println( sidoCnt );
			
//			사용자가 예외를 만들어서 처리도 가능하다.
//			if( balance < 0) 
//				throw new BalanceNotEnoughException("잔액부족");
//			catch(BalanceNotEnoughException e) {
//				
//			}
//		catch (FileNotFoundException | IOException e) { // |로 Exception 묶는것 가능.
		} catch (FileNotFoundException e) { // 옛날부터 해오던 방식
			e.printStackTrace();
		} catch (IOException e) { 		 	// 차례대로 예외를 걸러냄. 
			e.printStackTrace();
		} catch (Exception e) {				// 가장 높은 단계의 예외가 마지막.
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
				
				bw.close();
				fw.close();
			} catch (IOException e) {
				
			}
		}

		
	}

}
