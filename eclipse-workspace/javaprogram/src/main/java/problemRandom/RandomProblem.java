package problemRandom;

public class RandomProblem {
	public static void main(String[] args) {
		int min =1;
		int max =10;
	System.out.println("Generating 10 Random integer in range of 1 to 10 using Math.random");
		for(int i = 0; i < 10; i++) {
		int RandomNmber = (int) (Math.random()*(max-min)) + min;
		System.out.println(RandomNmber);
	}
}
}


