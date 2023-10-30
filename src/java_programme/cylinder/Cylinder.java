package java_programme.cylinder;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);//Call the parent constructor in the circle class
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
