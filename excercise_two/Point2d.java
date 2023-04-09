package ss06_excercise_inheritance.excercise_two;

import java.util.Arrays;

public class Point2d {
    private float x;
    private float y;
    private float[] xy = {5,6};

    public Point2d() {
    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXy() {
        float[] xy = {this.x,this.y};
        return xy;
    }

    public void setXy(float[] xy) {
        this.xy = xy;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                ", xy=" + Arrays.toString(xy) +
                '}';
    }


}
