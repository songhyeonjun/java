package 인터페이스사용;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {

	public static void main(String[] args) {

		JFrame f= new JFrame();
		f.setSize(500, 500);
		
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// static메서드로 만들어놓았음
				// 자주 쓰는 메서드(함수)나 변수는 static으로 만들어 놓으면
				// 클래스 이름으로 언제든 접근해서 쓸 수 있음
				JOptionPane.showMessageDialog(b1, "나를 클릭했군요@@@");
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
		f.setVisible(true);
	}

}
