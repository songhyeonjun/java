package object;

class Animal{
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal{
	void sleep() {
		System.out.println(this.name+"는 잔다.");
	}
}

public class Sample2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("멍멍이");
		System.out.println(dog.name);
		dog.sleep();
		// IS - A관계
		// 개는 동물이다.
		Animal dog2 = new Dog();
		//Object java 최상위 객체(class)
		Object obj = new Dog();
	}

}
