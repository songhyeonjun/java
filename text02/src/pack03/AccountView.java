package pack03;

import javax.swing.JOptionPane;

public class AccountView {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("name 입력");
		String title = JOptionPane.showInputDialog("title 입력");
		String price = JOptionPane.showInputDialog("price 입력");
		
		AccountVO accountVo = new AccountVO();
		accountVo.setName(name);
		accountVo.setTitle(title);
		accountVo.setPrice(Integer.parseInt(price));
		
		AccountDAO accountDao = new AccountDAO();
		accountDao.create(accountVo);
		
	}

}
