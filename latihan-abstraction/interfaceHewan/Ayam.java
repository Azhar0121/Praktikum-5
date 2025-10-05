package interfaceHewan;

public class Ayam implements Hewan {
    private String nama;

    public Ayam(String nama) {
        this.nama = nama;
    }

    @Override
    public void makan() {
        System.out.println(this.nama + " sedang memakan cacing");
    }

    @Override
    public void tidur() {
        System.out.println(this.nama + " tidur di atas tenggeran");
    }

    @Override
    public void bersuara() {
        System.out.println(this.nama + " Kukuruyukk");
    }
}