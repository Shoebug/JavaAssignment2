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
            
            System.out.println("This program will calculate the areas and volumes");
            System.out.println("of various shapes.");
            System.out.println();
            System.out.println("Calculate the area of a rectangle ");
            System.out.println();
            System.out.println("Calculate the area of a circle");
            System.out.println();
            System.out.println("Calculate the area of a triangle");
            System.out.println();
            System.out.println("Calculate the volume of a pyramid");
            System.out.println();
            System.out.println("Calculate the volume of a cube");
            System.out.println();
            System.out.println("Calculate the volume of a sphere");
            
            menu = input.nextInt();

            // switch menu goes here.

            System.out.println("Would you like to loop Y/N?");
            loop = input.next().charAt(0);

            System.out.println((char) 2);

        } while (loop != 'n' && loop != 'N');
        System.out.println("Application ended");

    }// end of main

    private static void rectangle() {
        Scanner input = new Scanner(System.in);
        double width = 0;
        double length = 0;
        double areaRectangle = 0;

        System.out.println("Please enter width");
        width = input.nextDouble();
        System.out.println();
        System.out.println("Please enter length");
        length = input.nextDouble();
        System.out.println();
        areaRectangle = rectangleArea(length, width);
        System.out.println("The area is " + areaRectangle);
    }

    private static void circle() {
        Scanner input = new Scanner(System.in);
        double radius = 0;
        double areacircle = 0;

        System.out.println("Please enter radius");
        radius = input.nextDouble();
        System.out.println();
        areacircle = circleArea(radius);
        System.out.println("The area is " + areacircle);
    }

    private static void triangle() {
        Scanner input = new Scanner(System.in);
        double base = 0;
        double height = 0;
        double areaTriangle = 0;

        System.out.println("Please enter base");
        base = input.nextDouble();
        System.out.println();
        System.out.println("Please enter height");
        height = input.nextDouble();
        System.out.println();
        areaTriangle = triangleArea(base, height);
        System.out.println("The area is " + areaTriangle);
    }

    private static void cube() {
        Scanner input = new Scanner(System.in);
        double width = 0;
        double length = 0;
        double height = 0;
        double volCube = 0;

        System.out.println("Please enter width");
        width = input.nextDouble();
        System.out.println();
        System.out.println("Please enter length");
        length = input.nextDouble();
        System.out.println();
        System.out.println("Please enter height");
        height = input.nextDouble();
        System.out.println();
        volCube = cubeVolume(length, width, height);
        System.out.println("The volume is " + volCube);
    }

    private static void sphere() {
        Scanner input = new Scanner(System.in);
        double radius = 0;
        double volSphere = 0;

        System.out.println("Please enter radius");
        radius = input.nextDouble();
        System.out.println();
        volSphere = sphereVolume(radius);
        System.out.println("The volume is " + volSphere);
    }

    private static void pyramid() {
        Scanner input = new Scanner(System.in);
        double height = 0;
        double length = 0;
        double width = 0;
        double volPyramid = 0;

        System.out.println("Please enter height");
        height = input.nextDouble();
        System.out.println();
        System.out.println("Please enter length of base");
        length = input.nextDouble();
        System.out.println();
        System.out.println("Please enter width of base");
        width = input.nextDouble();
        System.out.println();
        volPyramid = pyramidVolume(height, length, width);
        System.out.println("The volume is " + volPyramid);
    }

    private static double rectangleArea(final double length, final double width) {
        return ((width) * (length));
    }// end of square/rectangle area Calculateulation udf

    private static double circleArea(final double radius) {
        return ((Math.PI) * ((radius) * (radius)));
    }// end of circle area Calculateulation udf

    private static double triangleArea(final double height, final double base) {
        return ((height) * (base) * (0.5));
    }// end of triangle area Calculateulation udf

    private static double cubeVolume(final double width, final double length, final double height) {
        return ((width) * (length) * (height));
    }// end of cube/cuboid volume Calculateulation udf

    private static double pyramidVolume(final double height, final double width, final double length) {
        return ((length) * (width) * (height) / 3);
    }// end of pyramid volume Calculateulation udf

    private static double sphereVolume(final double radius) {
        return ((4.0 / 3.0) * (Math.PI) * (Math.pow(radius, 3)));
    }// end of sphere volume Calculateulation udf

}// end of program
