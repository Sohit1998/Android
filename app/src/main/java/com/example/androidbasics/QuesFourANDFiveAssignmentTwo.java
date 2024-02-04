package com.example.androidbasics;

import java.util.ArrayList;

public class QuesFourANDFiveAssignmentTwo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 8.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Square square = new Square(4.0);
        System.out.println("\nSquare Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        Cube cube = new Cube(3.0);
        System.out.println("\nCube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateArea());

        Cone cone = new Cone(2.0, 5.0);
        System.out.println("\nCone Volume: " + cone.calculateVolume());
        System.out.println("Cone Surface Area: " + cone.calculateArea());
    }
    static abstract class Shape {
        abstract double calculateArea();
        abstract double calculatePerimeter();
        abstract String getShapeName();

        abstract double calculateVolume();
    }

    interface TwoDShape {
        static double calculateArea(double length, double breadth) {
            return length * breadth;
        }

        static double calculatePerimeter(double length, double breadth) {
            return 2 * (length + breadth);
        }
    }

    interface ThreeDShape {
        static double calculateVolume(double length, double breadth, double height) {
            return length * breadth * height;
        }
    }

    static class Rectangle extends Shape implements TwoDShape {
        private double length;
        private double breadth;
        private double area;
        private double perimeter;

        public Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        double calculateArea() {
            area = TwoDShape.calculateArea(length, breadth);
            return area;
        }

        @Override
        double calculatePerimeter() {
            perimeter = TwoDShape.calculatePerimeter(length, breadth);
            return perimeter;
        }

        @Override
        double calculateVolume() {
            return 0;
        }
        String getShapeName() {
            return "Rectangle";
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getBreadth() {
            return breadth;
        }

        public void setBreadth(double breadth) {
            this.breadth = breadth;
        }

        public double getArea() {
            return area;
        }

        public double getPerimeter() {
            return perimeter;
        }
    }

    static class Square extends Shape implements TwoDShape {
        private double side;
        private double area;
        private double perimeter;

        public Square(double side) {
            this.side = side;
        }

        @Override
        double calculateArea() {
            area = TwoDShape.calculateArea(side, side);
            return area;
        }

        @Override
        double calculatePerimeter() {
            perimeter = TwoDShape.calculatePerimeter(side, side);
            return perimeter;
        }

        @Override
        double calculateVolume() {
            return 0;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        public double getArea() {
            return area;
        }
        String getShapeName() {
            return "Square";
        }

        public double getPerimeter() {
            return perimeter;
        }
    }

    static class Cube extends Shape implements ThreeDShape {
        private double side;
        private double volume;
        private double surfaceArea;

        public Cube(double side) {
            this.side = side;
        }

        @Override
        double calculateArea() {
            return 0;
        }

        @Override
        double calculatePerimeter() {
            return 0;
        }

        @Override
        double calculateVolume() {
            volume = ThreeDShape.calculateVolume(side, side, side);
            return volume;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        public double getVolume() {
            return volume;
        }
        String getShapeName() {
            return "cube";
        }

        public double getSurfaceArea() {
            return surfaceArea;
        }
    }

    static class Cone extends Shape implements ThreeDShape {
        private double radius;
        private double height;
        private double volume;
        private double surfaceArea;

        public Cone(double radius, double height) {
            this.radius = radius;
            this.height = height;
        }

        @Override
        double calculateArea() {
            return 0;
        }
        String getShapeName() {
            return "cone";
        }

        @Override
        double calculatePerimeter() {
            return 0;
        }

        @Override
        double calculateVolume() {
            volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
            return volume;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getVolume() {
            return volume;
        }

        public double getSurfaceArea() {
            return surfaceArea;
        }
    }



    static class Geometry  {
        public static void main(String[] args) {
            ArrayList<Shape> shapeList = new ArrayList<Shape>();
            shapeList.add(new Rectangle(10,20));
            shapeList.add(new Cube(2));
            shapeList.add(new Square(4.0));
            shapeList.add(new Cone(2.0, 5.0));
            for (Shape shape : shapeList) {
                System.out.println("Shape : " + shape.getShapeName());
            }
        }
    }
}
