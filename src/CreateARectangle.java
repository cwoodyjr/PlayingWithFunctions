import java.util.Scanner;

public class CreateARectangle {
    public static void main(String[] args) {
        System.out.println("Let's calculate the area of a rectangle");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the width of the rectangle (in inches).");
        double width = input.nextDouble();

        while (width <= 0) {
            System.out.println("That's invalid. Please input the width of the rectangle (in inches).");
            width = input.nextDouble();
        }

        System.out.println("Please input the height of the rectangle (in inches).");
        double height = input.nextDouble();
        while (height <= 0) {
            System.out.println("That's invalid. Please input the height of the rectangle (in inches).");
            height = input.nextDouble();
        }


        double area = (width * height);
        System.out.println("The area of the rectangle is " + area+"ins");
    }
}
