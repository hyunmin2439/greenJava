package com.green.io3;

import java.io.*;

public class EmpTest {

	public static void main(String[] args) throws IOException {
		
		String filename1 = "c:\\imsi\\empdata.txt";
		String filename2 = "c:\\imsi\\empdataout.txt";
		
		FileReader fr = new FileReader( filename1 );
		FileWriter fw = new FileWriter( filename2 );
		
		BufferedReader br = new BufferedReader( fr );
		BufferedWriter bw = new BufferedWriter( fw );
		
		String line = "";
		int	   cnt  = 0;
		br.readLine();
		br.readLine();
		
		while( (line = br.readLine()) != null ) {
			Emp emp = new Emp( line );
			
			String msg = emp.calcPay();
			System.out.println( msg );
			bw.write(msg + "\n");
			
			cnt++;
		}
		System.out.println(cnt + "건 작업완료");
		
		br.close();
		bw.close();
		fr.close();
		fw.close();
	}

}
