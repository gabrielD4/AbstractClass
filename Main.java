public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(9.6, 8.7);
        Triangle triangle = new Triangle(6.8, 2.9);

        System.out.println("Width of rectangle is = " + rectangle.getWidth());
        System.out.println("Height of rectangle is = " + rectangle.getHeight());
        rectangle.calculateArea();
        System.out.println();

        System.out.println("Width of triangle is = " + triangle.getWidth());
        System.out.println("Height of triangle is = " + triangle.getHeight());
        triangle.calculateArea();
    }
}
