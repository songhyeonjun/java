package 인터페이스사용;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowProject {
	static int i;
	static JButton b;
	static ImageIcon icon0;
	static ImageIcon icon1;
	static ImageIcon icon2;
	static ImageIcon icon3;
	static ImageIcon icon4;
	static JLabel l0;
	static Image img, updateImg;
	public static void main(String[] args) {
		JFrame f = new JFrame();

		f.setSize(600, 600);

		f.setLayout(new FlowLayout());
		
		icon1 = new ImageIcon("1.jpg");
		icon2 = new ImageIcon("2.jpg");
		icon3 = new ImageIcon("3.jpg");
		icon4 = new ImageIcon("4.jpg");
		icon0 = new ImageIcon("");

		img = icon1.getImage();
		updateImg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		icon1 = new ImageIcon(updateImg);
		
		img = icon2.getImage();
		updateImg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		icon2 = new ImageIcon(updateImg);
		
		img = icon3.getImage();
		updateImg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		icon3 = new ImageIcon(updateImg);
		
		img = icon4.getImage();
		updateImg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		icon4 = new ImageIcon(updateImg);
		
		
		l0 = new JLabel(icon0);
		//image의 위치는 project아래에!
		l0.setIcon(icon0);
		f.add(l0);
		
		
		for (i = 1; i < 5; i++) {
				b = new JButton("버튼" + i);
				f.add(b);
				b.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println(e.getActionCommand());
						if(e.getActionCommand().equals("버튼1")){
							l0.setIcon(icon1);
							
							f.add(l0);
						}
						else if(e.getActionCommand().equals("버튼2")) {
							l0.setIcon(icon2);
							f.add(l0);
						}
						else if(e.getActionCommand().equals("버튼3")) {
							l0.setIcon(icon3);
							f.add(l0);
						}
						else  {
							l0.setIcon(icon4);
							f.add(l0);
						}
					}
				});
			}
		f.setVisible(true);
	}

}
