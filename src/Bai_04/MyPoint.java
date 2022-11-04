package Bai_04;


public class MyPoint {
    public double x;
    public double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;

    }
    public MyPoint(double p) {

    }
    public double getX() {

        return x;
    }
    public void setX(double x) {

        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
