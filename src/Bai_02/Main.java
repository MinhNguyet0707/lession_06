package Bai_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static class Main_02 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("nhập số sinh viên");
                int soLuongSV = sc.nextInt();
                SinhVien[] danhSachSV = new SinhVien[soLuongSV];
                for (int i = 0; i < soLuongSV; i++) {
                    System.out.println("mời bạn nhập mã sinh viên");
                    int maSinhVien = sc.nextInt();
                    sc.nextLine();
                    System.out.println("nhập tên sinh viên");
                    String tenSinhVien = sc.nextLine();
                    System.out.println("nhập tên lớp");
                    String lop = sc.nextLine();
                    System.out.println("nhập tên khoa");
                    String khoa = sc.nextLine();
                    SinhVien sv = new SinhVien(maSinhVien, tenSinhVien, lop, khoa);
                    danhSachSV[i] = sv;
                }
                Arrays.sort(danhSachSV);
                System.out.println("Nhập lớp bạn muốn lấy danh sách: ");
                String tenLop = sc.nextLine();
                for(int i = 0; i < soLuongSV; i++) {
                    if(danhSachSV[i].getLop().equals(tenLop)) {
                        System.out.println(danhSachSV[i].toString());
                    }

                }

            }

        }
}
