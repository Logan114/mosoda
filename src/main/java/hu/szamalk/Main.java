package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        Mosoda mosoda = new Mosoda();
        mosoda.hozzaad("Vágási Ferenc");
        mosoda.hozzaad("Szikszai Etus");
        mosoda.hozzaad("Takács Lenke");
        mosoda.hozzaad("Sümeghy Oszkár", "ing", 69);
        mosoda.mosas("Sümeghy Oszkár");
        mosoda.kiadas("Sümeghy Oszkár");

        System.out.println(mosoda);
    }
}
