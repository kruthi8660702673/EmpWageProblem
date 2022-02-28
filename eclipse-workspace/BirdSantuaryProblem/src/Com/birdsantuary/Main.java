package Com.birdsantuary;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Duck duck = new Duck();
		Penguine penguine = new Penguine();
		Flemingo flemingo= new Flemingo();
		Ostrich ostrich= new Ostrich();
		Parrot parrot= new Parrot();
		

		BirdRepository birdrepo = new BirdRepository();
		birdrepo.addBird(duck);
		birdrepo.addBird(penguine);
		birdrepo.addBird(flemingo);
		birdrepo.addBird(ostrich);
		birdrepo.addBird(parrot);
		List birds = birdrepo.birdList;
		for(int i = 0; i<birds.size(); i++) {
			System.out.println(birds.get(i));
		}
		
//		UserInterface userInterface = new UserInterface();
//		userInterface.print(birdrepo.getBirdList());
			
		parrot.eat();
		parrot.fly();
	}

}
