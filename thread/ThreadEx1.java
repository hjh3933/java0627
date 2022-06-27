package org.java.thread;

import java.awt.Toolkit;

class ThreadeEx1Sub extends Thread {
	int num=0;
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i <100; i++) {
			System.out.println("Thread :" + (num++));
			toolkit.beep();//비프소리 // 실제로 사운드 켜보면 실행된다
			try {
				Thread.sleep(1000); // 1000당 1초, 멈추는 사이에 main스레드 진행
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


public class ThreadEx1 {
	public static void main(String[] args) {
		ThreadeEx1Sub t2 = new ThreadeEx1Sub();
		t2.start();
		for(int i = 0; i<5; i++) {
			System.out.println("main스레드"+(i+1));
			try {
				Thread.sleep(1000);	//멈추는 사이에 t2 진행	-> 번갈아가며 나오게된다(5회 후 안나옴)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
