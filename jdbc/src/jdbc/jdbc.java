package jdbc;

public class jdbc {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Class.forName("org.postgresql.Driver");
			System.out.println("JDBC ����̹� �ε� ����~");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			} 
		finally {
			System.out.println("������ ���� ~ ");
		}
		
	}

}
