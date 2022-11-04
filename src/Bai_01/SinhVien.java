package Bai_01;

public class SinhVien {
        public int maSinhVien;
        public String tenSinhVien;
        public String lop;
        public String khoa;


        public SinhVien(int maSinhVien, String tenSinhVien, String lop, String khoa) {
            this.maSinhVien = maSinhVien;
            this.tenSinhVien = tenSinhVien;
            this.lop = lop;
            this.khoa = khoa;

        }
        @Override
        public String toString() {
            return "Bai_01.SinhVien [maSinhVien=" + maSinhVien + ", tenSinhVien=" + tenSinhVien + ", lop=" + lop + ", khoa=" + khoa
                    + "]";
        }


    }


