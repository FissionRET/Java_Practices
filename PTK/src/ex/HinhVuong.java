package ex;

public class HinhVuong extends HinhChuNhat {
    private int canh;

    public HinhVuong(int canh) {
        this.canh = canh;
    }

    @Override
    public int getDienTich() {
        return canh * canh;
    }
}
