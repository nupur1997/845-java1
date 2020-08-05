package internshala;

public class Dog {
	

		private String breed;        // Instance Variable
		private int size;
		private String color;

		public void bark() {
			System.out.println(" Wooh ! Wooh !");
		}

		public void run() {
			System.out.println("My breed is " + breed+ ". I am running");
		}

		public String getBreed() {
			return breed;
		}

		public void setBreed(String breed) {
			this.breed = breed;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
	}
