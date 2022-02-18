package jdbc;

public class jdbc {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Class.forName("org.postgresql.Driver");
			System.out.println("JDBC 드라이버 로딩 성공~");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			} 
		finally {
			System.out.println("무조건 실행 ~ ");
		}
		
	}

}
