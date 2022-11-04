package Bai_04;


public class TinhToan {
    public static double tinhKHoangCachHai(MyPoint m1, MyPoint m2) {
        double x1=m1.getX();
        double y1=m1.getY();
        double x2=m2.getX();
        double y2=m2.getY();
        double khoangCach = Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1- y2),2));
        return khoangCach;
    }

}

