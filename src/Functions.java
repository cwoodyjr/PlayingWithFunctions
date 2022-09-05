import java.util.Scanner;

public class Functions {
    public static void calculateAnArea(){
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
    public static void newFunctionTest(){
        System.out.println("this will be our 2nd function");
    }

    public static void main(String[] args) {

        calculateAnArea();
        newFunctionTest();
        System.out.println("our program will end here");
        //System.out.println("Now lets turn this into a cuboid. Tell us the depth");
        //double depth = input.nextDouble();
        //while (depth <= 0){
        //   System.out.println("THAT WOULD MAKE A RECTANGLE! WE ALREADY HAVE ONE OF THOSE!!");
        // System.out.println("Please input the depth");
        //depth = input.nextDouble();

        //}
        //double cubeArea = (width * height * depth);
        //System.out.println("The volume is of the cuboid is " + cubeArea+"ins");
    }
}
