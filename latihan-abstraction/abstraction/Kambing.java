package abstraction;
public class Kambing extends Hewan {
    private double berat;

    public Kambing(String nama, int usia, double berat) {
        super(nama, usia);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }
    public void setBerat(double berat) {
        this.berat = berat;
    }

    @Override
    public void bersuara() {
        System.out.println(this.nama + " Mbbeee");
    }

    public void showKambing() {
        System.out.println(this.nama + " berusia " + this.usia + " tahun dan beratnya " + this.berat + " kg");
    }
}
