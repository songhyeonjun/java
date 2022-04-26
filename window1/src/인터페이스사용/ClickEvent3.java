package 인터페이스사용;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ClickEvent3 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// 인터페이스에 정의 되어있었던 추상메서드를 구현해주면 된다.

		System.out.println(e);
		JOptionPane.showMessageDialog(null, "@@@ 이벤트 처리군요##@@");
		
	}

}
