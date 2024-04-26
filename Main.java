import java.util.*;

public class Main {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Original radius: " + circle.getRadius());

        circle.resize(2);
        System.out.println("Radius after resizing by 2: " + circle.getRadius());

        circle.resize(3);
        System.out.println("Radius after resizing by 3: " + circle.getRadius());

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Original width: " + rectangle.getWidth());
        System.out.println("Original height: " + rectangle.getHeight());

        rectangle.resize(2);
        System.out.println("Width after resizing by 2: " + rectangle.getWidth());
        System.out.println("Height after resizing by 2: " + rectangle.getHeight());

        cin.close();
    }
}