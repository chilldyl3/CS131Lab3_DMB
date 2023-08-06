package arraylist;

public class ListApp {
    public static void main(String[] args) {
        // Create a list of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.addItem("Hello");
        stringList.addItem("World");
        System.out.println("List of Strings:");
        System.out.println(stringList);

        // Create a list of Squares
        ArrayList<Square> squareList = new ArrayList<>();
        squareList.addItem(new Square(4.0));
        squareList.addItem(new Square(5.0));
        System.out.println("\nList of Squares:");
        System.out.println(squareList);

        // Create a list of PointThreeD
        ArrayList<PointThreeD> pointList = new ArrayList<>();
        pointList.addItem(new PointThreeD(1.0, 2.0, 3.0));
        pointList.addItem(new PointThreeD(4.0, 5.0, 6.0));
        System.out.println("\nList of PointThreeD:");
        System.out.println(pointList);
    }
}
