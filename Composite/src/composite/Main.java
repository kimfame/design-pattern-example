package composite;

public class Main {

	public static void main(String[] args) {
		
		// /
		Directory bin = new Directory("bin");
		Directory tmp = new Directory("tmp");
		Directory root = new Directory("root");
		Directory home = new Directory("home");
		
		// /bin/
		Regular xz = new Regular("xz");
		Regular bzip2 = new Regular("bzip2");
		Regular gzip = new Regular("gzip");
		bin.add(xz);
		bin.add(bzip2);
		bin.add(gzip);
		
		// /home/
		Directory user = new Directory("user");
		Directory guest = new Directory("guest");
		home.add(user);
		home.add(guest);
		
		// /home/user/
		Directory projects = new Directory("projects");
		user.add(projects);
		
	}

}
