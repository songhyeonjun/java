package 인터페이스사용;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow3 {

	public static void main(String[] args) {

		JFrame f= new JFrame();
		f.setSize(500, 500);
		
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			
			// ActionListener인터페이스를 구현한 익명 클래스의 객체를 생성
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b1, "b1을 클릭함");
				
			}
		});
			
		b1.setText("나를 눌러요");
		b1.setBackground(Color.yellow); // 배경색
		b1.setForeground(Color.blue); // 글자색
		b1.setBounds(136, 185, 208, 80); // 버튼위치 x, y, 가로크기, 세로크기 

		Font font = new Font("궁서", Font.BOLD, 30); // 반드시 입력값을 넣어야 한다.!
		//                    폰트,    진하기    글자크기
		b1.setFont(font);
		f.add(b1); // Component interface <<< JButton
		// 클래스의 다형성(업캐스팅, 자동형변환) 
		
		
		JButton b2 = new JButton();
		b2.setText("나를 눌러요");
		b2.setBackground(Color.yellow); // 배경색
		b2.setForeground(Color.blue); // 글자색
		b2.setBounds(100, 100, 208, 80); // 버튼위치 x, y, 가로크기, 세로크기 
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b2, "b2을 클릭함");
				
			}
		});
		
		f.setVisible(true);
	}

}
