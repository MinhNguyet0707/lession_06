package Bai_01;

import java.util.Scanner;

public class Main_01{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("mời bạn nhập mã sinh viên");
            int maSinhVien = sc.nextInt();
            sc.nextLine();
            System.out.println("nhập tên sinh viên");
            String tenSinhVien = sc.nextLine();
            System.out.println("nhập tên lớp");

            String lop= sc.nextLine();

            System.out.println("nhập tên khoa");

            String khoa = sc.nextLine();

            SinhVien sv = new SinhVien(maSinhVien, tenSinhVien, lop, khoa);

            System.out.println(sv.toString());
        }


    }


