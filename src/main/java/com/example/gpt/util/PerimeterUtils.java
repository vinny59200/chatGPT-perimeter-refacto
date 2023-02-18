package com.example.gpt.util;

public class PerimeterUtils {
    public static void main( String[] args ) {

        calculatePerimetersWithRedundancies();

        calculationsByChatGPT();

    }

    private static void calculatePerimetersWithRedundancies() {

        double circle1 = 2 * Math.PI * 5;

        double square1 = 4 * 5;

        double rectangle1 = 2 * 5 + 2 * 10;

        double cricle2 = 2 * Math.PI * 10;

        double circle3 = 2 * Math.PI * 30;

        double square2 = 4 * 10;

        System.out.println( circle1 + square1 + rectangle1 + cricle2 + circle3 + square2 );

    }


    private static void calculationsByChatGPT() {
        double[] radii = {5, 10, 30};
        double[] sides = {5, 10};

        double circle1 = calculateCirclePerimeter(radii[0]);
        double square1 = calculateSquarePerimeter(sides[0]);
        double rectangle1 = calculateRectanglePerimeter(sides[0], sides[1]);
        double circle2 = calculateCirclePerimeter(radii[1]);
        double circle3 = calculateCirclePerimeter(radii[2]);
        double square2 = calculateSquarePerimeter(sides[1]);

        System.out.println(circle1 + square1 + rectangle1 + circle2 + circle3 + square2);
    }

    private static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    private static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    private static double calculateRectanglePerimeter(double side1, double side2) {
        return 2 * side1 + 2 * side2;
    }

}
