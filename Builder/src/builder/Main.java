package builder;

public class Main {

	public static void main(String[] args) {
		// Case 1
		DogInfo.Builder builder = new DogInfo.Builder("Welsh corgi", "Corgi City");
		builder.hairColor("Brown")
		.height(40)
		.weight(50);
		DogInfo cuteDog = builder.build();
		
		System.out.println(cuteDog.toString());
	
		// Case 2
		DogInfo doubleCuteDog = new DogInfo
				.Builder("Bichon Frise", "BF Town")
				.hairColor("White")
				.height(60)
				.weight(45)
				.build();
		
		System.out.println(doubleCuteDog.toString());
		
		
	}

}
