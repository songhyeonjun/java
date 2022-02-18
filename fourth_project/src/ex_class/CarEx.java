package ex_class;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company:"+car1.company);
		System.out.println("car1.model:"+car1.model);
		System.out.println("car1.color:"+car1.color);
		System.out.println("car1.maxSpeed:"+car1.maxSpeed);
		
		Car car2 = new Car("Ä«´Ï¹ß");
		System.out.println("car2.company:"+car2.company);
		System.out.println("car2.model:"+car2.model);
		System.out.println("car2.color:"+car2.color);
		System.out.println("car2.maxSpeed:"+car2.maxSpeed);
	}

}
