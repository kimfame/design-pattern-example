package builder;

public class DogInfo {
	// mandatory
	private String name;
	private String address;
	
	// option
	private String hairColor;
	private int height;
	private int weight;
	
	public static class Builder {
		private String name = "None";
		private String address = "None";
		
		private String hairColor = "None";
		private int height = 0;
		private int weight = 0;
		
		public Builder(String name, String address) {
			this.name = name;
			this.address = address;
		}
		
		public Builder hairColor(String hairColor) {
			this.hairColor = hairColor;
			return this;			
		}
		
		public Builder height(int height) {
			this.height = height;
			return this;
		}

		public Builder weight(int weight) {
			this.weight = weight;
			return this;
		}

		public DogInfo build() {
			return new DogInfo(this);
		}
	}
	
	private DogInfo(Builder builder) {
		this.name = builder.name;
		this.address = builder.address;
		
		this.hairColor = builder.hairColor;
		this.height = builder.height;
		this.weight = builder.weight;
	}
	
	@Override
	public String toString() {
		return name + ", " + address + ", "	+ 
				hairColor + ", " + height + ", " + weight;
	}
}
