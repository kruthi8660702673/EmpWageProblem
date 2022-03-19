package Animal;

public class Dog extends Animal {
		String breed;
	public void speak() {
		System.out.println("Dog is Breaking !!!!!....");
}
	@Override
	public void eat() {
		System.out.println("Dog Food");
	}
	public void intro() {
		System.out.println(name + "is" + breed + "breed of Dog.");
	}
	
}