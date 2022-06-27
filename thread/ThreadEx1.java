package org.java.thread;

import java.awt.Toolkit;

class ThreadeEx1Sub extends Thread {
	int num=0;
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i <100; i++) {
			System.out.println("Thread :" + (num++));
			toolkit.beep();//�����Ҹ� // ������ ���� �Ѻ��� ����ȴ�
			try {
				Thread.sleep(1000); // 1000�� 1��, ���ߴ� ���̿� main������ ����
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
			System.out.println("main������"+(i+1));
			try {
				Thread.sleep(1000);	//���ߴ� ���̿� t2 ����	-> �����ư��� �����Եȴ�(5ȸ �� �ȳ���)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
