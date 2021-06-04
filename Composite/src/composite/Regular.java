package composite;

public class Regular implements File {

	private String name;
	
	public Regular(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

}
