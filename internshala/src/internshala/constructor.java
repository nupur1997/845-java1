package internshala;

public class constructor {
	

		public float length;        // Instance Variable
		public float breadth;       // Instance variable

		public constructor() {        // Default Constructor
			this(20.4f, 10.2f);
		}

		public constructor(float length) {     // Parameterized Constructor
			this.length = length;
		}

		public constructor(float length, float breadth) {    // Parameterized Constructor
			this.length = length;
			this.breadth = breadth;
		}

		public float getArea() {
			float area = length * breadth;      // Local Variable
			return area;
		}

		public float getPerimeter() {
			float perimeter = 2 * ( length + breadth );     // Local variable
			return perimeter;
		}
	}



