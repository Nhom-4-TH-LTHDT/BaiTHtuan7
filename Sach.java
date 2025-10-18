public abstract class Sach {
    // Thuộc tính đã có
    private String maSach;
    private String tieuDe;
    private int namXuatBan;
    private int soLuong;

    // Thuộc tính mới
    private double giaCoBan;

    // Constructor cập nhật để bao gồm giaCoBan
    public Sach(String maSach, String tieuDe, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // Getter và Setter đã có
    public String getTieuDe() {
        return tieuDe;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }

    // Getter và Setter cho giaCoBan
    public double getGiaCoBan() {
        return giaCoBan;
    }
    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    // Phương thức trừu tượng (bắt buộc các lớp con phải triển khai)
    public abstract double tinhGiaBan();

    // Phương thức toString cơ bản
    @Override
    public String toString() {
        return "Mã: " + maSach + ", Tiêu đề: " + tieuDe + ", Năm XB: " + namXuatBan + ", SL: " + soLuong;
    }
}