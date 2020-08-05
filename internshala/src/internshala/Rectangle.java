package internshala;

public class Rectangle {
	private float length;        // Instance Variable
	private float breadth;       // Instance variable

	public float getArea() {
		float area = length * breadth;      // Local Variable
		return area;
	}

	public float getPerimeter() {
		float perimeter = 2 * ( length + breadth );     // Local variable
		return perimeter;
	}

	// Getter and Setter
	public float getLength() {  // Getter for length
		return length;
	}

	public void setLength(float length) {   // Setter for length
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}



}
