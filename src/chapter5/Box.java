package chapter5;

public class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println(" конструирование объекта Box ");
        width = 10;
        depth = 10;
        height = 10;

    }

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}