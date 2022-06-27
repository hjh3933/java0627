package org.java.io;

import java.io.InputStreamReader;

public class InputStreamReaderEx {
	public static void main(String[] args) {
		
		InputStreamReader inRd = new InputStreamReader(System.in);
		
		while(true) {
			try {
				System.out.println("문자를 입력");
				int ch = inRd.read();
				//ctr + z 누르면 입력 멈춘다
				if(ch==-1) break;
//				inRd.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
