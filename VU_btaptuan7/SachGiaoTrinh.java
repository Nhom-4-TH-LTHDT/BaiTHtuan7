public class SachGiaoTrinh extends Sach implements IKiemKe {

    public SachGiaoTrinh(String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        super(tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + (soNam * 5000);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách " + tieuDe + " đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "SachGiaoTrinh{" +
                "tieuDe='" + tieuDe + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", soLuong=" + soLuong +
                ", giaCoBan=" + giaCoBan +
                ", giaBan=" + tinhGiaBan() +
                '}';
    }
}
