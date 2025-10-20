import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private List<Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Đã thêm sách có mã: " + sach.getMaSach());
    }
    public Sach timKiemSach(String maSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }
    public void xoaSach(String maSach) {
        Sach sachCanXoa = timKiemSach(maSach);
        if (sachCanXoa != null) {
            danhSachSach.remove(sachCanXoa);
            System.out.println("Đã xóa sách có mã: " + maSach);
        } else {
            System.out.println("Không tìm thấy sách có mã: " + maSach + " để xóa.");
        }
    }
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
         Sach sachCanUpdate = timKiemSach(maSach);
         if(sachCanUpdate != null) {
             sachCanUpdate.setSoLuong(soLuongMoi);
             System.out.println("Đã cập nhật số lượng cho sách có mã: " + maSach);
         } else {
             System.out.println("Không tìm thấy sách có mã: " + maSach + " để cập nhật.");
         }
    }
    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách trống.");
            return;
        }
        System.out.println("======= DANH SÁCH TẤT CẢ SÁCH =======");
        for (Sach sach : danhSachSach) {
            System.out.println("--------------------");
            System.out.println(sach.toString());
        }
        System.out.println("======================================");
    }
}