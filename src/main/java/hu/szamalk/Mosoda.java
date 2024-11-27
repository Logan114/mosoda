package hu.szamalk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mosoda {
    private List<Ruha> ruhak;
    private List<Ruha> kiadottRuhak;

    public Mosoda() {
        this.ruhak = new ArrayList<>();
        this.kiadottRuhak = new ArrayList<>();
    }

    public void hozzaad(String nev) {
        ruhak.add(new Ruha(nev));
    }

    public void kiadas(String nev) {
        ruhak.removeIf(ruha -> {
            if (ruha.getTulaj().equals(nev)) {
                kiadottRuhak.add(ruha);
                return true;
            }
            return false;
        });
    }

    public List<Ruha> getRuhak() {
        return ruhak;
    }

    public List<Ruha> getKiadottRuhak() {
        return kiadottRuhak;
    }

    @Override
    public String toString() {
        return
                "Benn lévő Ruhák= " + ruhak.stream().map(Ruha::getTulaj).collect(Collectors.joining(", ")) +
                "\nkiadott ruhák= " + kiadottRuhak.stream().map(Ruha::getTulaj).collect(Collectors.joining(", "));
    }
}
