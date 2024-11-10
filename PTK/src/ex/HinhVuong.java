package ex;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        super();
    }

    @Override
    public int getDienTich() {
        return getChieuDai() * getChieuDai();
    }
}