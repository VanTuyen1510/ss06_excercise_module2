package ss06_excercise_inheritance.excercise_one;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3.5);
        circle.setColor("Blue");
        System.out.println("Diện tích hình tròn là " + circle.getArea());

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5.5);
        cylinder.setHeight(3.5);
        System.out.println("Diện tích hình trụ là " + cylinder.getVolume());
    }
}
