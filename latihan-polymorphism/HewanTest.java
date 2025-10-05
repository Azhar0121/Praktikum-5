public class HewanTest {
    public static void main(String[] args) {
        //instansiasi class Kucing kucing1
        Kucing kucing1 = new Kucing(3);
        kucing1.berkomunikasi();

        Hewan hewan1 = new Hewan("Hewan 1", 2);
        hewan1.berkomunikasi();

        Hewan hewan2 = new Kambing(4);
        hewan2.berkomunikasi();
    }
}
