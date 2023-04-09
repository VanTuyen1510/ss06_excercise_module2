package ss06_excercise_inheritance.excercise_one;

public class Cylinder extends Circle {
    private double height;
    private double volume;

    public Cylinder() {
    }

    public Cylinder(double height, double volume) {
        this.height = height;
        this.volume = volume;
    }

    public Cylinder(double radius, String color, double height, double volume) {
        super(radius, color);
        this.height = height;
        this.volume = volume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        volume = super.getArea() * height * 3.14;
        return volume;
    }



    public void setVolume(double volume) {
        this.volume = volume;
    }



    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + volume +
                '}';
    }
}
