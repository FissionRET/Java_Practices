public class HinhChuNhat {
    // props
    private int ChieuDai, ChieuRong;

    // ctor
    public HinhChuNhat() {
        ChieuDai = 0;
        ChieuRong = 0;
    }

    public HinhChuNhat(int ChieuDai, int ChieuRong) {
        this.ChieuDai = ChieuDai;
        this.ChieuRong = ChieuRong;
    }

    //getter
    public int getChieuDai() {
        return ChieuDai;
    }

    public int getChieuRong() {
        return ChieuRong;
    }

    // setter
    public void setChieuDai(int ChieuDai) {
        this.ChieuDai = ChieuDai;
    }

    public void setChieuRong(int ChieuRong) {
        this.ChieuRong = ChieuRong;
    }

    // other methods
    public int getDienTich() {
        return ChieuDai * ChieuRong;
    }
}
