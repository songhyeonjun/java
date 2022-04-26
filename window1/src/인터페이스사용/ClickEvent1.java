package 인터페이스사용;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ClickEvent1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// 인터페이스에 정의 되어있었던 추상메서드를 구현해주면 된다.
		JOptionPane.showMessageDialog(null, "첫 번째 이벤트 처리군요");

	}

}
