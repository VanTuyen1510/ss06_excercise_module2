package ss06_excercise_inheritance.excercise_three;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    private float[] xy = {3.5f, 5.5f};

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(float x, float y, float[] xy) {
        this.x = x;
        this.y = y;
        this.xy = xy;
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
        float[] xy = {x,y};
        return xy;
    }

    public void setXy(float[] xy) {
        this.xy = xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", xy=" + Arrays.toString(xy) +
                '}';
    }
}
