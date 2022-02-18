package pack03;

public class AccountDAO {
	// CRUD
	
	// create 기능만 호출. vo 만들어서 넣어서 전달, 확인
	
	public void create(AccountVO vo) {
		System.out.println("dao에서 전달받은 값 : " + vo);
		String name2 = vo.getName();
		String title2 = vo.getTitle();
		int price2 = vo.getPrice();
		
		System.out.println("전달 받은 name는 " + name2);
		System.out.println("전달 받은 title는 " + title2);
		System.out.println("전달 받은 price는 " + price2);
		
		System.out.println("계좌 생성 처리 요청됨");
	}
	
}
