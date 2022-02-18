package ex_class;

public class UserCreate {

	public static void main(String[] args) {
		User user = new User();
		user.setIdx(1);
		user.setId("icarus");
		user.setPassword("12345");
		user.setBirth("2000-01-02");
		user.setEmail("icarus@gmail.com");
		user.setPhone("010-0000-0000");
		user.setRgstdate("2021-12-31");
		
		User user2 = new User();
		user2.setIdx(2);
		user2.setId("freeman");
		user2.setPassword("093654");
		user2.setBirth("1996-05-10");
		user2.setEmail("freeman@gmail.com");
		user2.setPhone("010-1111-1111");
		user2.setRgstdate("2020-05-25");
		
		User[] users = new User[2];
		users[0] = user;
		users[1] = user2;
	
		for(int i=0;i<users.length;i++) {
			System.out.println("idx:"+users[i].getIdx());
			System.out.println("id:"+users[i].getId());
			System.out.println("password:"+users[i].getPassword());
			System.out.println("birth:"+users[i].getBirth());
			System.out.println("email:"+users[i].getEmail());
			System.out.println("phone:"+users[i].getPhone());
			System.out.println("rgstdate:"+users[i].getRgstdate());	
		}
	}

}
