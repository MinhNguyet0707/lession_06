package Bai_04;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so diem muốn nhập");
        int n = sc.nextInt();

        MyPoint[] arr = new MyPoint[n];

        for (int i = 0; i <= arr.length-1 ; i++) {
            System.out.println("nhap vao hoanh do diem");
            double x1=sc.nextDouble();
            System.out.println("nhap vao tung do diem");
            double y1=sc.nextDouble();
            MyPoint m = new MyPoint(x1, y1);
            arr[i] = m;
        }

        int diemLonNhat=0;
        int diemNhoNhat=0;

        for (int i = 0; i <= arr.length-1 ; i++) {
            double tongXYLonNhat = 0;
            double tongXYNhoNhat = 0;
            double tongXY = arr[i].getX() +  arr[i].getY();

            if( tongXY>=tongXYLonNhat){
                tongXYLonNhat = tongXY;
                diemLonNhat = i;
            }

            if( tongXY<=tongXYNhoNhat){
                tongXYNhoNhat = tongXY;
                diemNhoNhat = i;
            }


        }
        System.out.println(TinhToan.tinhKHoangCachHai(arr[diemLonNhat], arr[diemNhoNhat]));
        System.out.println(arr[diemNhoNhat].toString());
        System.out.println(arr[diemLonNhat].toString());
    }



}
