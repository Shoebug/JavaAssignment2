/**
 * This Program allows the user to calculate areas and volumes of various shapes
 * 
 * Authors: Nathan Roche, ...
 * 
 * Date: 31/01/2024
 * 
 * Version: 1.0
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
 * Everyone:        Pick and create a user defined function
 * 
 */

// Imports a Java Utility named scanner to facilitate the input from the keyboard
// Imports a Java class named Math to facilitate caclulations using "PI" and "power of"
// Imports a Java Utility for error catching and handling
import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

// Name the program 
class assignment2DreamTeam {

    // Start of Main
    public static void main(String[] args) {

        // Create a new instance of Scanner
        Scanner input = new Scanner(System.in);
        int menu, loop;

        // begining of do/while loop for main program
        do {
            menu = 0;
            System.out.println((char) 12);// ASCII character 12 is Form Feed which clears the page
            System.out.println();

            // begining of print statments directing the user to which option to select
            System.out.println("This program will calculate the areas and volumes of various shapes.");
            System.out.println();
            System.out.println("Press 1 to calculate the area of a rectangle.");
            System.out.println();
            System.out.println("Press 2 to calculate the area of a circle.");
            System.out.println();
            System.out.println("Press 3 to calculate the area of a triangle.");
            System.out.println();
            System.out.println("Press 4 to calculate the volume of a pyramid.");
            System.out.println();
            System.out.println("Press 5 to calculate the volume of a cube.");
            System.out.println();
            System.out.println("Press 6 to calculate the volume of a sphere.");
            System.out.println();

            // begining of try/catch statement to handle any unexpected inputs and allows
            // the user to try again without closing out the whole program
            try {
                menu = input.nextInt();

                switch (menu) { // switch menu for directing to each option/module
                    case 1:
                        rectangle(); // directs to the rectangle module
                        break;
                    case 2:
                        circle();// directs to the circle module
                        break;
                    case 3:
                        triangle();// directs to the triangle module
                        break;
                    case 4:
                        pyramid();// directs to the pyramid module
                        break;
                    case 5:
                        cube();// directs to the cube module
                        break;
                    case 6:
                        sphere();// directs to the sphere module
                        break;

                    default:
                        System.out.println("Selected option unavailable. Please select 1 through 6.");
                }// end of switch

            } catch (InputMismatchException ex) {
            } // end of try/catch, putting the user back to the input of entering the switch
              // menu

            System.out.println();
            System.out.println("Would you like to start the program over?");
            loop = input.next().charAt(0);

            System.out.println((char) 2); // ascii char for start of text

        } while (loop != 'n' && loop != 'N'); // closes loop when "N" or "n" is inputed

        System.out.println("Application ended. Thank you!");

    }// end of main

    // Start of module for processing rectangle calculation, passing it to the
    // function for the actual calculation, and printing the returned results
    private static void rectangle() {

        // begining of try/catch statement to handle any unexpected inputs and allows
        // the user to try again without closing out the whole program
        try {

            Scanner input = new Scanner(System.in);

            // initialises these variables for use later in code
            double width = 0;
            double length = 0;
            double areaRectangle = 0;

            System.out.println((char) 12);// ASCII character 12 is Form Feed which clears the page
            System.out.println();
            System.out.println("Please enter the width:");

            width = input.nextDouble();

            System.out.println();
            System.out.println("Please enter the length:");

            length = input.nextDouble();

            // passes all the inputed values to the respective udf and returns the value
            areaRectangle = rectangleArea(length, width);

            // prints returned calculation
            System.out.println();
            System.out.print("The area of the rectangle or square is ");
            System.out.printf("%.2f", areaRectangle);
            System.out.print("m\u00B2");
            System.out.println();

        } catch (InputMismatchException ex) {
            System.out.println();
            System.out.println("Unexpected Character. Please start over.");
            System.out.println();
        }
    }// end of module for calculation

    // Start of module for processing circle calculation, passing it to the function
    // for the actual calculation, and printing the returned results
    private static void circle() {

        // begining of try/catch statement to handle any unexpected inputs and allows
        // the user to try again without closing out the whole program
        try {

            Scanner input = new Scanner(System.in);

            // initialises these variables for use later in code
            double radius = 0;
            double areacircle = 0;

            System.out.println((char) 12);// ASCII character 12 is Form Feed which clears the page
            System.out.println();
            System.out.println("Please enter the radius");

            radius = input.nextDouble();

            // passes all the inputed values to the respective udf and returns the value
            areacircle = circleArea(radius);

            // prints returned calculation
            System.out.println();
            System.out.print("The area of the circle is ");
            System.out.printf("%.2f", areacircle);
            System.out.print("m\u00B2");
            System.out.println();

        } catch (InputMismatchException ex) {
            System.out.println();
            System.out.println("Unexpected Character. Please start over.");
            System.out.println();
        }
    }// end of module for calculation

    // Start of module for processing triangle calculation, passing it to the
    // function for the actual calculation, and printing the returned results
    private static void triangle() {

        // begining of try/catch statement to handle any unexpected inputs and allows
        // the user to try again without closing out the whole program
        try {

            Scanner input = new Scanner(System.in);

            // initialises these variables for use later in code
            double base = 0;
            double height = 0;
            double areaTriangle = 0;

            System.out.println((char) 12);// ASCII character 12 is Form Feed which clears the page
            System.out.println();
            System.out.println("Please enter the base");

            base = input.nextDouble();

            System.out.println();
            System.out.println("Please enter the height");

            height = input.nextDouble();

            // passes all the inputed values to the respective udf and returns the value
            areaTriangle = triangleArea(base, height);

            // prints returned calculation
            System.out.println();
            System.out.print("The area of the triangle is ");
            System.out.printf("%.2f", areaTriangle);
            System.out.print("m\u00B2");
            System.out.println();

        } catch (InputMismatchException ex) {
            System.out.println();
            System.out.println("Unexpected Character. Please start over.");
            System.out.println();
        }
    }// end of module for calculation

    // Start of module for processing cube calculation, passing it to the function
    // for the actual calculation, and printing the returned results
    private static void cube() {

        // begining of try/catch statement to handle any unexpected inputs and allows
        // the user to try again without closing out the whole program
        try {

            Scanner input = new Scanner(System.in);

            // initialises these variables for use later in code
            double width = 0;
            double length = 0;
            double height = 0;
            double volCube = 0;

            System.out.println((char) 12);// ASCII character 12 is Form Feed which clears the page
            System.out.println();
            System.out.println("Please enter the width");

            width = input.nextDouble();

            System.out.println();
            System.out.println("Please enter the length");

            length = input.nextDouble();

            System.out.println();
            System.out.println("Please enter the height");

            height = input.nextDouble();

            // passes all the inputed values to the respective udf and returns the value
            volCube = cubeVolume(length, width, height);

            // prints returned calculation
            System.out.println();
            System.out.print("The volume of the cuboid is ");
            System.out.printf("%.2f", volCube);
            System.out.print("m\u00B2");
            System.out.println();

        } catch (InputMismatchException ex) {
            System.out.println();
            System.out.println("Unexpected Character. Please start over.");
            System.out.println();
        }
    }// end of module for calculation

    // Start of module for processing sphere calculation, passing it to the function
    // for the actual calculation, and printing the returned results
    private static void sphere() {

        // begining of try/catch statement to handle any unexpected inputs and allows
        // the user to try again without closing out the whole program
        try {

            Scanner input = new Scanner(System.in);

            // initialises these variables for use later in code
            double radius = 0;
            double volSphere = 0;

            System.out.println((char) 12);// ASCII character 12 is Form Feed which clears the page
            System.out.println();
            System.out.println("Please enter the radius");

            radius = input.nextDouble();

            // passes all the inputed values to the respective udf and returns the value
            volSphere = sphereVolume(radius);

            // prints returned calculation
            System.out.println();
            System.out.print("The volume of the sphere is ");
            System.out.printf("%.2f", volSphere);
            System.out.print("m\u00B3");
            System.out.println();

        } catch (InputMismatchException ex) {
            System.out.println();
            System.out.println("Unexpected Character. Please start over.");
            System.out.println();
        }
    } // end of module for calculation

    // Start of module for processing pyramid calculation, passing it to the
    // function for the actual calculation, and printing the returned results
    private static void pyramid() {

        // begining of try/catch statement to handle any unexpected inputs and allows
        // the user to try again without closing out the whole program
        try {

            Scanner input = new Scanner(System.in);

            // initialises these variables for use later in code
            double height = 0;
            double length = 0;
            double width = 0;
            double volPyramid = 0;

            System.out.println((char) 12);// ASCII character 12 is Form Feed which clears the page
            System.out.println();
            System.out.println("Please enter the height");

            height = input.nextDouble();

            System.out.println();
            System.out.println("Please enter the length of the base");

            length = input.nextDouble();

            System.out.println();
            System.out.println("Please enter the width of the base");

            width = input.nextDouble();

            // passes all the inputed values to the respective udf and returns the value
            volPyramid = pyramidVolume(height, length, width);

            // prints returned calculation
            System.out.println();
            System.out.print("The volume of the pyramid is ");
            System.out.printf("%.2f", volPyramid);
            System.out.print("m\u00B3");
            System.out.println();

        } catch (InputMismatchException ex) {
            System.out.println();
            System.out.println("Unexpected Character. Please start over.");
            System.out.println();
        }
    } // end of module

    // start of square/rectangle area calculation udf
    private static double rectangleArea(final double length, final double width) {
        return ((width) * (length));
    }// end of square/rectangle area calculation udf

    // start of circle area calculation udf
    private static double circleArea(final double radius) {
        return ((Math.PI) * ((radius) * (radius)));
    }// end of circle area calculation udf

    // start of triangle area calculation udf
    private static double triangleArea(final double height, final double base) {
        return ((height) * (base) * (0.5));
    }// end of triangle area calculation udf

    // start of cube/cuboid volume calculation udf
    private static double cubeVolume(final double width, final double length, final double height) {
        return ((width) * (length) * (height));
    }// end of cube/cuboid volume calculation udf

    // start of pyramid volume calculation udf
    private static double pyramidVolume(final double height, final double width, final double length) {
        return ((length) * (width) * (height) / 3);
    }// end of pyramid volume calculation udf

    // start of sphere volume calculation udf
    private static double sphereVolume(final double radius) {
        return ((4.0 / 3.0) * (Math.PI) * (Math.pow(radius, 3)));
    }// end of sphere volume calculation udf

}// end of program