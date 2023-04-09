package ss06_excercise_inheritance.excercise_two;

import java.util.Arrays;

public class Point3d extends Point2d {
    private float z;
    private float[] xyz = {5,6,7};

    public Point3d() {
    }

    public Point3d(float z) {
        this.z = z;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXyz() {
        float[] xyz = {super.getX(),super.getY(),this.z};
        return xyz;
    }

    public void setXyz(float[] xyz) {
        this.xyz = xyz;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + super.getX() +
                ", y=" + super.getY()+
                ", z=" + z +
                ", xyz=" + Arrays.toString(xyz) +
                '}';
    }
}
