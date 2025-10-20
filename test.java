public class Test {
    public static void main(String[] args) {
        QuanLySach qlSach = new QuanLySach();
        System.out.println("Tạo và thêm sách giáo trình...");
        SachGiaoTrinh sgt = new SachGiaoTrinh("GT01", "Giải tích 1", "Nguyễn Văn A", 
                                            2020, 150, "Toán", "Đại cương", 80000);
        System.out.println("Tạo và thêm sách tiểu thuyết...");
        SachTieuThuyet stt1 = new SachTieuThuyet("TT01", "Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 
                                            2019, 200, 50000, "Thiếu nhi", true);
        SachTieuThuyet stt2 = new SachTieuThuyet("TT02", "Lão Hạc", "Nam Cao", 
                                            2021, 100, 30000, "Văn học hiện thực", false);
        qlSach.themSach(sgt);
        qlSach.themSach(stt1);
        qlSach.themSach(stt2);
        System.out.println("\n==============================\n");
        System.out.println("Hiển thị danh sách sách để kiểm tra giá bán:");
        qlSach.hienThiDanhSach();
        System.out.println("\n==============================\n");
        System.out.println("Thực hiện kiểm tra giao diện IKiemKe:");
        IKiemKe kiemKe = sgt; 
        int soLuongCanKiemTra = 100;
        System.out.println("Kiểm tra sách '" + sgt.getTieuDe() + "' có tồn kho >= " + soLuongCanKiemTra + " không?");
        boolean ketQuaKiemKho = kiemKe.kiemTraTonKho(soLuongCanKiemTra);
        System.out.println("Kết quả: " + (ketQuaKiemKho ? "Đủ hàng" : "Không đủ hàng"));
        System.out.println("\nKiểm tra với số lượng 200:");
        System.out.println("Kết quả: " + (KiemKe.kiemTraTonKho(200) ? "Đủ hàng" : "Không đủ hàng"));
        System.out.println("\nCập nhật vị trí:");
        kiemKe.capNhatViTri("Kho A1-Kệ 5");
    }
}