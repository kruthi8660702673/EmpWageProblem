package Animal;

public class cat extends Animal {
	String colour;
	public void speak() {
		System.out.println("Cat Says Meow !!!!");		
	}
	public void intro() {
		System.out.println(name + "is" + colour + "colour Cat.");
	}
}
