package ss06_excercise_inheritance.excercise_three;

public class MovablePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;
    float speed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float[] xy, float xSpeed, float ySpeed) {
        super(x, y, xy);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] speed = {xSpeed,ySpeed};
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + super.getX() +
                ", y=" + super.getY() +
                ", speed=" + speed +
                '}';
    }

    public float move(){
       super.setX(getX() + xSpeed);
       super.setY(getY() + ySpeed);
       return getX() + getY();
    }
}
