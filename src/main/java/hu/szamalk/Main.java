package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        Mosoda mosoda = new Mosoda();
        mosoda.hozzaad("Vágási Ferenc");
        mosoda.hozzaad("Szikszai Etus");
        mosoda.hozzaad("Takács Lenke");
        mosoda.kiadas("Takács Lenke");
        System.out.println(mosoda);
    }
}
