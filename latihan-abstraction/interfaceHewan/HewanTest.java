package interfaceHewan;

public class HewanTest {
        public static void main(String[] args) {
        Hewan sapi = new Sapi("Lembu");
        Hewan ayam = new Ayam("Janggut");

        sapi.makan();
        sapi.tidur();
        sapi.bersuara();

        ayam.makan();
        ayam.tidur();
        ayam.bersuara();
    }
}
