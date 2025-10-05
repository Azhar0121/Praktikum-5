package abstraction;
public class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int usia, String ras) {
        super(nama, usia);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }
    public void setRas(String ras) {
        this.ras = ras;
    }

    @Override
    public void bersuara() {
        System.out.println(this.nama + " Meeoonnggg");
    }

    public void showKucing() {
        System.out.println(this.nama + " berusia " + this.usia + " tahun dan rasnya " + this.ras);
    }
}
