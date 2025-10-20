public class SachGiaoTrinh extends Sach implements IKiemKe {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        int soNamDaXuatBan = 2025 - getNamXuatBan();
        return getGiaCoBan() + soNamDaXuatBan * 5000;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Môn học: " + monHoc + "\n" +
               "Cấp độ: " + capDo + "\n" +
               "Giá bán ước tính: " + tinhGiaBan() + " VNĐ";
    }

    // Implement IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách [" + getTieuDe() + "] đến khu vực: " + viTriMoi);
    }
}
