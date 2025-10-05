package abstraction;
public class HewanTest {
     public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Katty", 2, "Persia");
        Kambing kambing1 = new Kambing("Kambingku", 3, 45.5);

        kucing1.showKucing();
        kucing1.makan();
        kucing1.bersuara();

        kambing1.showKambing();
        kambing1.tidur();
        kambing1.bersuara();
    }
}
