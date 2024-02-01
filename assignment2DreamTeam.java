/**
 * This Program allows the user to calculate areas and volumes of various shapes
 * 
 * Authors: Nathan Roche, ...
 * 
 * Date: 31/01/2024
 * 
 * Malachy duties:  go through the code and look for all the commented "system print" lines. Remove the comments and fill in the quotes with the appropriate text
 * 
 * Dovydas duties:  Implement the switch menu around line 50 in the code, theres a comment you should see. 
 *                  Use "menu" int variable for the switch and the function names "sphere, cube, etc" further down the code for each case, 1 through 6
 * 
 * Ian duties:      Use this code base to create a flowchart
 * 
 * Matthew duties:  Look through the code for every variable mention "int, double, etc" gather all the names and put them in the dictionary table.
 * 
 * 
 */

// Imports a Java Utility named scanner to facilitate the input from the keyboard
// Imports a Java class named Math to facilitate caclulations using "PI" and "power of"
import java.util.Scanner;
import java.lang.Math;

// Name the program 
class assignment2DreamTeam {

    // Start of Main
    public static void main(String[] args) {

        // Create a new instance of Scanner
        Scanner input = new Scanner(System.in);
        int menu, loop;

        do {
            menu = 0;
            System.out.println((char) 12);// ASCII character 12 is Form Feed which clears the page
            System.out.println();
            /**
             * System.out.println("description of the program, what it will do. and then a list line by line presenting options to the user");
             * System.out.println(" ");
             * System.out.println();
             * System.out.println("Cal rect ");
             * System.out.println();
             * System.out.println("Calc circle ");
             * System.out.println();
             * System.out.println("Calc cube ");
             * System.out.println();
             * System.out.println("calc pyramid");
             * System.out.println();
             * System.out.println("calc tri");
             * System.out.println();
             * System.out.println("calc sphere");
             **/
            menu = input.nextInt();

            // switch menu goes here.

            // System.out.println("loop question ");
            loop = input.next().charAt(0);

            System.out.println((char) 2);

        } while (loop != 'n' && loop != 'N');
        // System.out.println("Application ended");

    }// end of main

    private static void rectangle() {
        Scanner input = new Scanner(System.in);
        double width = 0;
        double length = 0;
        double areaRectangle = 0;

        // System.out.println("enter width");
        width = input.nextDouble();
        // System.out.println();
        // System.out.println("enter length");
        length = input.nextDouble();
        // System.out.println();
        areaRectangle = rectangleArea(length, width);
        // System.out.println(" area is " + areaRectangle);
    }

    private static void circle() {
        Scanner input = new Scanner(System.in);
        double radius = 0;
        double areacircle = 0;

        // System.out.println("enter radis");
        radius = input.nextDouble();
        // System.out.println();
        areacircle = circleArea(radius);
        // System.out.println(" area is " + areacircle);
    }

    private static void triangle() {
        Scanner input = new Scanner(System.in);
        double base = 0;
        double height = 0;
        double areaTriangle = 0;

        // System.out.println("enter base");
        base = input.nextDouble();
        // System.out.println();
        // System.out.println("enter height");
        height = input.nextDouble();
        System.out.println();
        areaTriangle = triangleArea(base, height);
        // System.out.println(" area is " + areaTriangle);
    }

    private static void cube() {
        Scanner input = new Scanner(System.in);
        double width = 0;
        double length = 0;
        double height = 0;
        double volCube = 0;

        // System.out.println("enter width");
        width = input.nextDouble();
        // System.out.println();
        // System.out.println("enter length");
        length = input.nextDouble();
        // System.out.println();
        // System.out.println("enter height");
        height = input.nextDouble();
        // System.out.println();
        volCube = cubeVolume(length, width, height);
        // System.out.println(" vol is " + volCube);
    }

    private static void sphere() {
        Scanner input = new Scanner(System.in);
        double radius = 0;
        double volSphere = 0;

        // System.out.println("enter radius");
        radius = input.nextDouble();
        // System.out.println();
        volSphere = sphereVolume(radius);
        // System.out.println(" area is " + volSphere);
    }

    private static void pyramid() {
        Scanner input = new Scanner(System.in);
        double height = 0;
        double length = 0;
        double width = 0;
        double volPyramid = 0;

        // System.out.println("height of it");
        height = input.nextDouble();
        // System.out.println();
        // System.out.println(" length of base");
        length = input.nextDouble();
        // System.out.println();
        // System.out.println("width of base");
        width = input.nextDouble();
        // System.out.println();
        volPyramid = pyramidVolume(height, length, width);
        // System.out.println(" answer is " + volPyramid);
    }

    private static double rectangleArea(final double length, final double width) {
        return ((width) * (length));
    }// end of square/rectangle area calculation udf

    private static double circleArea(final double radius) {
        return ((Math.PI) * ((radius) * (radius)));
    }// end of circle area calculation udf

    private static double triangleArea(final double height, final double base) {
        return ((height) * (base) * (0.5));
    }// end of triangle area calculation udf

    private static double cubeVolume(final double width, final double length, final double height) {
        return ((width) * (length) * (height));
    }// end of cube/cuboid volume calculation udf

    private static double pyramidVolume(final double height, final double width, final double length) {
        return ((length) * (width) * (height) / 3);
    }// end of pyramid volume calculation udf

    private static double sphereVolume(final double radius) {
        return ((4.0 / 3.0) * (Math.PI) * (Math.pow(radius, 3)));
    }// end of sphere volume calculation udf

}// end of program
