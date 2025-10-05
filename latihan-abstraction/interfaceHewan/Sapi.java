package interfaceHewan;

public class Sapi implements Hewan {
    private String nama;

    public Sapi(String nama) {
        this.nama = nama;
    }

    @Override
    public void makan() {
        System.out.println(this.nama + " sedang memakan rumput");
    }

    @Override
    public void tidur() {
        System.out.println(this.nama + " sedang tidur di kandang");
    }

    @Override
    public void bersuara() {
        System.out.println(this.nama + " Mooo");
    }
}