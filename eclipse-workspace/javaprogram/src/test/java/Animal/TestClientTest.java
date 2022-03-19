package Animal;

import static org.junit.Test.*;

import org.junit.Test;

public class TestClientTest {

	@Test
	public void testInheritance() {
		Dog dog = new Dog();
		dog.breed = "Pug";
		dog.name = "Rocky";
		dog.speak();
		dog.eat();
		dog.intro();

		cat cat = new cat();
		cat.name = "kitty";
		cat.colour = "white";
		cat.speak();
		cat.eat();
		cat.intro();

		babyDog babyDog = new babyDog();
		babyDog.height = 1.2;
		babyDog.breed = "Huskey";
		babyDog.name = "Lucy";
		babyDog.eat();
		babyDog.speak();
		babyDog.intro();
		babyDog.play();
	}	
}
	

