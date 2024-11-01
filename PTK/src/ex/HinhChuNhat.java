package ex;

public class HinhChuNhat {
    // Props

    private int chieuRong;
    private int chieuDai;

    // Constructors

    public HinhChuNhat() {
        chieuRong = 0;
        chieuDai = 0;
    }

    // Methods

    public int getChieuRong() {
        return chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuRong(int inputChieuRong) {
        chieuRong = inputChieuRong;
    }

    public void setChieuDai(int inputChieuDai) {
        chieuDai = inputChieuDai;
    }

    public int getDienTich() {
        return chieuDai * chieuRong;
    }
}
