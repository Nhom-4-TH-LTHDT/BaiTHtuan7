/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package NVQ_BTHTuan7;

/**
 *
 * @author ADMIN
 */
public interface IKiemKe {
    /**
     * Kiểm tra sách có đủ số lượng tối thiểu hay không.
     * @param soLuongToiThieu Số lượng tối thiểu cần có.
     * @return true nếu số lượng hiện tại >= số lượng tối thiểu, ngược lại false.
     */
    boolean kiemTraTonKho(int soLuongToiThieu);

    /**
     * Cập nhật vị trí lưu trữ mới của cuốn sách.
     * @param viTriMoi Vị trí mới cần cập nhật.
     */
    void capNhatViTri(String viTriMoi);
}
