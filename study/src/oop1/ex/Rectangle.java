package oop1.ex;

public class Rectangle {
    int width = 5;
    int height = 8;

    int calculateArea(int width, int height) {
        this.width = width;
        this.height = height;
        return width * height;
    }
    int calculateArea() {

        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
