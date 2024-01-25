/**
* Assignment: SDEV200_M02_Assignment2_Ex11_1
* File: Triangle.java
* Version: 1.0
* Date: 1/25/2024
* Author: Tomomi Hobara
* Description: This program inherits the GeometricObject class and defines the Triangle class. 
* Variables:
    - side1-3: double, the lengths of a triangle's three sides
    - color: String, data field of GeometricObject
    - filled: boolean, data field of GeometricObject  
*Steps:
    1. Define data fields.
    2. Define constructors.
    3. Define accessor methods.
    4. Define methods for calculating the area and parameter of a triangle.
    5. Define a method for printing the instance of the triangle class. 
*Computation:
    - Area of triangle
        s = (side1 + side2 + side3) / 2
        area = sqrt(s(s-side1)(s-side3)(s-side3))  
*Related files:
    - GeometricObject.java: Defines the superclass
    - TestTriangle.java: Creates an instance of the Triangle class based on a user input.
    - TriangleUML.pdf: A class diagram describing the two classes.
*/
package M02_A2_Ex11_1_Triangle;
public class Triangle extends GeometricObject{
        private double side1 = 1.0;
        private double side2 = 1.0;
        private double side3 = 1.0;
        
        //Default no-arg constructor
        public Triangle() {
        }

        //Constructor with specified sides
        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;            
        }


        //Constructor with specified sides, color, and filling
        public Triangle(double side1, double side2, double side3, String color, Boolean filled) {
            setColor(color);
            setFilled(filled);  
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;  
        
        }


        //Accessor methods for the three sides
        public double getSide1() {
            return side1;
        }


        public double getSide2() {
            return side2;
        }


        public double getSide3() {
            return side3;
        }


        //Method to get the area of a triangle. Ex2.19, p74
        @Override
        public double getArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));
        }


        //Method to get the perimeter of a triangle
        @Override
        public double getPerimeter() {
            return side1 + side2 + side3;
        }


        //Returns the string description of a triangle
        public String toString() {
            return "\nTriangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 
                 + "\nColor: " + getColor() 
                 + "\nFilled: " + isFilled()
                 + String.format("\nArea: %.2f", getArea())
                 + String.format("\nPerimeter: %.2f\n", getPerimeter());

        }
}

