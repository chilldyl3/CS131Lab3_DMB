package arraylist;

public class PointThreeD {
	private double x;
    private double y;
    private double z;

    public PointThreeD(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "Point3D: (" + x + ", " + y + ", " + z + ")";
    }
}
