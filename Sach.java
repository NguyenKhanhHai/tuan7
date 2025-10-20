public abstract class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // Getter & Setter
    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public String getTacGia() { return tacGia; }
    public int getNamXuatBan() { return namXuatBan; }
    public int getSoLuong() { return soLuong; }
    public double getGiaCoBan() { return giaCoBan; }

    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    //  Phương thức trừu tượng
    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Mã sách: " + maSach +
               "\nTiêu đề: " + tieuDe +
               "\nTác giả: " + tacGia +
               "\nNăm xuất bản: " + namXuatBan +
               "\nSố lượng: " + soLuong +
               "\nGiá cơ bản: " + giaCoBan;
    }
}
