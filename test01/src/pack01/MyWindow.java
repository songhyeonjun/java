package pack01;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {

	public static void main(String[] args) {
		// 필요한 부품들 정리
		// 전체 틀
		JFrame f = new JFrame();
		// 버튼 2개
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		// 글자
		b1.setText("카카오 크롤링");
		// 색
		b1.setForeground(Color.red);
		b1.setBackground(Color.yellow);
		
		f.add(b1);
		f.setSize(300, 300);
		f.setVisible(true);
	}

}
