package class_project;
public class ClassSample {

	public static void main(String[] args) {
		Animal dog     = new Animal();
		Animal cat     = new Animal();
		Animal giraffe = new Animal();
		int age = 30;
		String query 
		= "INSERT INTO users (age, id,name) VALUES ("+age+",'asdfqwer','������')";
		
		System.out.println(query);
		dog.setName("������["+age+"]");
		cat.setName("�߿���");
		giraffe.setName("������");
		
		System.out.println("�����̸�:"+dog.name);
		System.out.println("��������̸�:"+cat.name);
		System.out.println("�⸰���̸�:"+giraffe.name);
	}
}