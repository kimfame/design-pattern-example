package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {

	private String name;
	private List<File> children;
	
	public Directory(String name) {
		this.name = name;
		this.children = new ArrayList<>();
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public void add(File file) {
		children.add(file);
	}

}
