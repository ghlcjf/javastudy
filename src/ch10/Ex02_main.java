package ch10;

public class Ex02_main {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.sound();
		cat.breathe();
		System.out.println("");
		
		
		Animal animal = null;
		
		animal = new Cat();
		
		animal.breathe();
		animal.sound();
		System.out.println("");
		
		
		animal = new Dog();
		animal.breathe();
		animal.sound();
		System.out.println("");
		
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(animal);
	}
	private static void animalSound(Animal ani) {
		ani.sound(); // 메서드 오버라이딩의 효과
	}
	
	
//	private static void animalSound(Cat cat) {
//		
//		cat.sound();
//		
//	}
//
//	private static void animalSound(Dog dog) {
//		
//		dog.sound();
//		
//	}

}
