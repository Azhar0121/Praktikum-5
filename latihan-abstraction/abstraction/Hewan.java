package abstraction;
public abstract class Hewan {
    protected String nama;
    protected int usia;

    public Hewan(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void makan() {
        System.out.println(this.nama + " sedang makan");
    }

    public void tidur() {
        System.out.println(this.nama + " sedang tidur");
    }

    public abstract void bersuara();
}
