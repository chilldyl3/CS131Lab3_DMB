package arraylist;

public class Square {
	 private double side;

	    public Square(double side) {
	        this.side = side;
	    }

	    public double getArea() {
	        return side * side;
	    }

	    public String toString() {
	        return "Square with side: " + side + ", Area: " + getArea();
	    }
}
