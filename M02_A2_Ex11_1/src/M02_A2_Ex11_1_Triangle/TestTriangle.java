/**
* Assignment: SDEV200_M02_Assignment2_Ex11_1
* File: TestTriangle.java
* Version: 1.0
* Date: 1/25/2024
* Author: Tomomi Hobara
* Description: This program creates an instance of the Triangle class based on a user input. 
* Variables:
    - side1-3: double, the lengths of a triangle's three sides
    - color: String, data field of GeometricObject
    - filled: boolean, data field of GeometricObject  
*Steps:
    1. Ask the user to input three sides, color, and fill.
    2. Create an instance.
    3. Print the result on the console.
*/

package M02_A2_Ex11_1_Triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Ask the user to enter three sides, color, and fill (true/false)
        System.out.println("Enter side1, for example 1.0: ");
        double side1 = input.nextDouble();

        System.out.println("Enter side2, for example 1.0: ");
        double side2 = input.nextDouble();

        System.out.println("Enter side3, for example 1.0: ");
        double side3 = input.nextDouble();

        System.out.println("Enter the color, for example 'blue': ");
        String color = input.next();

        System.out.println("Enter the fill, for example true or false: ");
        boolean filled = input.nextBoolean();

        input.close(); //Close the scanner

        //Create a triangle object
        Triangle triangle1 = new Triangle(side1, side2, side3, color, filled);

        //Print the object
        System.out.println(triangle1.toString());      
        
    }
}