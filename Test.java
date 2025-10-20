public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        // Tạo đối tượng sách giáo trình
        SachGiaoTrinh gt = new SachGiaoTrinh("GT01", "Lập trình Java", "Nguyễn Văn A",
                2020, 50, 100000, "Công nghệ thông tin", "Đại học");

        // Tạo đối tượng sách tiểu thuyết
        SachTieuThuyet tt = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling",
                2018, 30, 150000, "Phiêu lưu", true);

        // Thêm vào danh sách
        ql.themSach(gt);
        ql.themSach(tt);

        // Hiển thị toàn bộ sách
        ql.hienThiTatCa();

        // Kiểm tra Interface IKiemKe
        IKiemKe kiemKe = gt;
        System.out.println("\nKiểm tra tồn kho >= 40: " + kiemKe.kiemTraTonKho(40));
        kiemKe.capNhatViTri("Kho A1 - Kệ 5");
    }
}
