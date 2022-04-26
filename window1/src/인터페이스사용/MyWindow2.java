package 인터페이스사용;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow2 implements ActionListener{
	static JButton b3; // 전역변수, 클래스내 아무곳에서나 사용 가능한 변수
	
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		// 위치를 내 마음대로 지정할 수 있음
		f.setLayout(null);
		JButton b1 = new JButton();
		b1.setText("나를 눌러요");
		
		f.add(b1);
		b1.setBounds(100, 100, 100, 100); // x, y, 가로크기, 세로크기
		b1.setBackground(Color.black); // 배경색
		b1.setForeground(Color.white); // 글자색
		
		JButton b2 = new JButton();
		b2.setText("나도 눌러요1111");
		
		f.add(b2);
		b2.setBounds(250, 100, 100, 100); // x, y, 가로크기, 세로크기
		b2.setBackground(Color.white); // 배경색
		b2.setForeground(Color.black); // 글자색
		
		b3 = new JButton(); // 지역변수(main)
		b3.setText("나도 눌러요2222");
		
		f.add(b3);
		b3.setBounds(100, 250, 100, 100); // x, y, 가로크기, 세로크기
		b3.setBackground(Color.blue);  // 배경색
		b3.setForeground(Color.red); // 글자색
		
		JButton b4 = new JButton();
		b4.setText("나도 눌러요3333");
		
		f.add(b4);
		b4.setBounds(250, 250, 100, 100); // x, y, 가로크기, 세로크기
		b4.setBackground(Color.cyan);  // 배경색
		b4.setForeground(Color.darkGray); // 글자색
		
		ClickEvent1 event1 = new ClickEvent1();
		b1.addActionListener(event1);
		
		// b2를 처리할 수 있는 클래스를 actionListener인터페이스에 따라서
		// 구현한 후, b2에 처리할 수 있는 클래스로 설정
		ClickEvent2 event2 = new ClickEvent2();
		b2.addActionListener(event2);
		
		MyWindow2 event3 = new MyWindow2();
		b3.addActionListener(event3);
		b4.addActionListener(event3);
		
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b3) { // b3는 main 지역변수로 그냥 사용 불가 전역변수로 바꿔 진행
			JOptionPane.showMessageDialog(null, "b3를 클릭했습니다.!~@!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "b4를 클릭했습니다.!~@!!");
		}
		
	}

}
