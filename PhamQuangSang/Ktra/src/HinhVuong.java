public class HinhVuong extends HinhChuNhat {

    // ctor
    public HinhVuong() {
        super();
    }

    public HinhVuong(int Canh) {
        super(Canh, Canh);
    }

    
    @Override
    public int getDienTich() {
        return getChieuDai() * getChieuDai();
    }

}
