package Com.birdsantuary;

import java.util.List;

public class UserInterface {
	void print(List birds) {
		for(int i = 0; i < birds.size(); i++ ) {
			System.out.println(birds.get(i));
		}
	}
}
