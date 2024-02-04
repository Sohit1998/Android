package com.example.androidbasics;

public class CoreJavaSecAssign {


    public static void main(String[] args) {
        GetShape get = new GetShape();
        get.displayShapeName();

        Circle twoD = new Circle();
        twoD.calculatePerimeter();

        Cone cone = new Cone(3.0, 4.0);
        cone.calculateVolume();
        cone.calculateSurfaceArea();
    }
    //Write a Java program to create an abstract class Shape which has the following methods
    //void calculateArea()
    //void displayShapeName()
    abstract static class Shape {
        abstract double calculateArea();
        abstract void displayShapeName();
    }

    static class GetShape extends Shape {

        @Override
        double calculateArea() {
            return 0;
        }

        @Override
        void displayShapeName() {
            System.out.println("circle");
        }
    }

//    Write a java program to create interface TwoDShape with following methods
//    void calculatePerimeter()
//    void numberOfSides()


    public interface TwoDShape {
        void calculatePerimeter();
        void numberOfSides();
    }

    static class Circle implements TwoDShape {

        @Override
        public void calculatePerimeter() {
                double perimeter = 2 * Math.PI * 35;
                System.out.println("Perimeter of the Circle: " + perimeter);
        }

        @Override
        public void numberOfSides() {

        }
    }



    //Write a java program to create an interface ThreeDShape with following methods
    //void calculateVolume()
    //calculateSurfaceArea()



    public interface ThreeDShape {
        void calculateVolume();
        void calculateSurfaceArea();
    }

    static class Cone implements ThreeDShape {
        double radius;
        double height;

        public Cone(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }
        @Override
        public void calculateVolume() {
            double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
            System.out.println("Volume of the Cone: " + volume);
        }

        @Override
        public void calculateSurfaceArea() {
            double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
            double surfaceArea = Math.PI * radius * (radius + slantHeight);
            System.out.println("Surface Area of the Cone: " + surfaceArea);
        }
    }

}
