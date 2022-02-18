package class_project;
public class ClassSample {

	public static void main(String[] args) {
		Animal dog     = new Animal();
		Animal cat     = new Animal();
		Animal giraffe = new Animal();
		int age = 30;
		String query 
		= "INSERT INTO users (age, id,name) VALUES ("+age+",'asdfqwer','ÂĞÂĞÀÌ')";
		
		System.out.println(query);
		dog.setName("ÂĞÂĞÀÌ["+age+"]");
		cat.setName("¾ß¿ËÀÌ");
		giraffe.setName("¸ÚÀïÀÌ");
		
		System.out.println("°³ÀÇÀÌ¸§:"+dog.name);
		System.out.println("°í¾çÀÌÀÇÀÌ¸§:"+cat.name);
		System.out.println("±â¸°ÀÇÀÌ¸§:"+giraffe.name);
	}
}