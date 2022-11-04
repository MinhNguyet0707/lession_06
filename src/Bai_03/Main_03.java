package Bai_03;

import Bai_03.Rectange;

import java.util.Scanner;

public class Main_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai");
        double width=sc.nextDouble();
        System.out.println("nhap mau");
        String color = sc.nextLine();
        sc.nextLine();
        System.out.println("nhap chieu cao");
        double height=sc.nextDouble();
        Rectange rectange = new Rectange(width, height, color);
        System.out.println("chieu dai hcn la :"+rectange.getWidth());
        System.out.println("chieu rong hcn la :"+rectange.getHeight());
        System.out.println("mau hcn la: "+ rectange.getColor());
        System.out.println("dien tich hcn la:"+rectange.findArea());
        System.out.println("chu vi hcn la :"+rectange.findPerimeter());


    }

}
