package ss06_excercise_inheritance.excercise_three;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setxSpeed(3);
        movablePoint.setySpeed(5);
        System.out.println("Speed là " + movablePoint.move());

    }
}
