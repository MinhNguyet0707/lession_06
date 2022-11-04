package Bai_04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao x1");
        double x1=sc.nextDouble();
        System.out.println("nhap vao y1");
        double y1=sc.nextDouble();
        System.out.println("nhap vao x2");
        double x2=sc.nextDouble();
        System.out.println("nhap vao y2");
        double y2=sc.nextDouble();
        MyPoint m1= new MyPoint(x1,y1);
        MyPoint m2= new MyPoint(x2,y2);
        double ketQua =  TinhToan.tinhKHoangCachHai(m1,m2);

        System.out.println("Khoang cach hai diem la:"+ketQua);


    }

}
