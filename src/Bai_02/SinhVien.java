package Bai_02;

    public class SinhVien implements Comparable<SinhVien> {
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
        public int getMaSinhVien() {
            return maSinhVien;
        }
        public void setMaSinhVien(int maSinhVien) {
            this.maSinhVien = maSinhVien;
        }
        public String getTenSinhVien() {
            return tenSinhVien;
        }

        public void setTenSinhVien(String tenSinhVien) {
            this.tenSinhVien = tenSinhVien;
        }
        public String getLop() {
            return lop;
        }
        public void setLop(String lop) {
            this.lop = lop;
        }
        public String getKhoa() {
            return khoa;
        }
        public void setKhoa(String khoa) {
            this.khoa = khoa;
        }
        @Override
        public String toString() {
            return "Bai_01.SinhVien [maSinhVien=" + maSinhVien + ", tenSinhVien=" + tenSinhVien + ", lop=" + lop + ", khoa=" + khoa
                    + "]";
        }
        @Override
        public int compareTo(SinhVien o) {
            return this.tenSinhVien.compareToIgnoreCase(o.getTenSinhVien());
        }
    }

