package util;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//�������ķ��������԰�װ��һ�����࣬��������̳�

public class MyFrame extends Frame {
	
 	/**
	 * ���ش���
	 */
	public void launchFrame() {
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		setLocation(100, 100);
		setVisible(true);
		
		
		new PaintThread().start();   //�Զ��ػ��߳�
		addWindowListener(new WindowAdapter() {

			@Override
				public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	class PaintThread extends Thread{
			
			public void run() {
				while(true) {
					repaint();
					try {
						Thread.sleep(50);		//��Ϣ50ms
					} catch (InterruptedException e) {
						e.printStackTrace();
					}		
				}
			}
	}
}