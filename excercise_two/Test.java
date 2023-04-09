package ss06_excercise_inheritance.excercise_two;

public class Test {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(2,3);
        point2d.getXy();
        System.out.println(point2d);
        Point3d point3d = new Point3d(5,6,7);
        point3d.getXyz();
        System.out.println(point3d);
    }
}
