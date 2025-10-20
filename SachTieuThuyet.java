public class SachTieuThuyet extends Sach implements IKiemKe {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        double phuThu = laSachSeries ? 15000 : 0;
        return getGiaCoBan() + phuThu;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Thể loại: " + theLoai + "\n" +
               "Là sách series: " + (laSachSeries ? "Có" : "Không") + "\n" +
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
