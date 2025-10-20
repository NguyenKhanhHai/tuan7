public class Test {
    public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();

        // Tạo sách giáo trình
        SachGiaoTrinh sgk1 = new SachGiaoTrinh("GT001", "Giải tích 1", "TS. Lê Văn A", 2023, 10, 50000, "Toán", "Đại học");
        SachGiaoTrinh sgk2 = new SachGiaoTrinh("GT002", "Vật lý đại cương", "PGS. Nguyễn B", 2022, 5, 40000, "Vật lý", "Đại học");

        // Tạo sách tiểu thuyết
        SachTieuThuyet stt1 = new SachTieuThuyet("TT001", "Doraemon", "Fujiko F Fujio", 1995, 20, 30000, "Hài hước", true);
        SachTieuThuyet stt2 = new SachTieuThuyet("TT002", "Tuổi thơ dữ dội", "Phùng Quán", 1988, 7, 25000, "Chiến tranh", false);

        // Thêm vào danh sách
        qls.themSach(sgk1);
        qls.themSach(sgk2);
        qls.themSach(stt1);
        qls.themSach(stt2);

        // Hiển thị danh sách (có giá bán)
        qls.hienThiDanhSach();

        // Kiểm tra giao diện IKiemKe
        IKiemKe kiemKe = sgk1; // dùng tham chiếu interface
        System.out.println("\nKiểm tra tồn kho >= 100: " + (kiemKe.kiemTraTonKho(100) ? "Đủ hàng" : "Không đủ hàng"));
        kiemKe.capNhatViTri("Kho A1-Kệ 5");

        IKiemKe kiemKe2 = stt1;
        System.out.println("\nKiểm tra tồn kho >= 15: " + (kiemKe2.kiemTraTonKho(15) ? "Đủ hàng" : "Không đủ hàng"));
        kiemKe2.capNhatViTri("Kho B2-Kệ 3");
    }
}
