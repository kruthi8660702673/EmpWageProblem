package Com.birdsantuary;

import java.util.ArrayList;
import java.util.List;

public class BirdRepository {
	List birdList = new ArrayList();
	
	List getBirdList() {
		return birdList;
	}
	
	void addBird(Duck duck) {
		birdList.add(duck);
	}
	
	void addBird(Ostrich ostrich) {
		birdList.add(ostrich);
	}
	
	void addBird(Penguine penguine) {
		birdList.add(penguine);
	}

	void addBird(Parrot parrot) {
		birdList.add(parrot);
	}
	
	void addBird(Flemingo flemingo) {
		birdList.add(flemingo);
	}
	
}
