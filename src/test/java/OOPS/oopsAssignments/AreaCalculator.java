package OOPS.oopsAssignments;

public class AreaCalculator {


    //Method to calculate the area of square
    public int calculateArea(int side) {
        return side * side;
    }

    //Method to calculate the area of rectangle
    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    //Method to calculate the area of circle
    public double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    //Method to calculate the area of triangle
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }


    public static void main(String[] args) {
        //Created object for class AreaCalculator
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Area of square: " + areaCalculator.calculateArea(5));
        System.out.println("Area of rectangle: " + areaCalculator.calculateArea(10, 4));
        System.out.println("Area of circle: " + areaCalculator.calculateArea(5.0));
        System.out.println("Area of triangle: " + areaCalculator.calculateArea(6.0, 8.0));
    }
}
