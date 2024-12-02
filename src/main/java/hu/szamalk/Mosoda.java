package hu.szamalk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mosoda {
    private final List<Ruha> ruhak;
    private final List<Ruha> kiadottRuhak;

    public Mosoda() {
        this.ruhak = new ArrayList<>();
        this.kiadottRuhak = new ArrayList<>();
    }

    public void hozzaad(String tulaj) {
        if (tulaj == null || tulaj.isEmpty()) {
            throw new IllegalArgumentException("Tulaj name cannot be null or empty");
        }
        ruhak.add(new Ruha(tulaj));
    }

    public void hozzaad(String tulaj, String tipus) {
        ruhak.add(new Ruha(tulaj, tipus));
    }

    public void hozzaad(String tulaj, String tipus, int szinintenzitas) {
        if (tulaj == null || tulaj.isEmpty()) {
            throw new IllegalArgumentException("Tulaj name cannot be null or empty");
        }
        ruhak.add(new Ruha(tulaj, tipus, szinintenzitas));
    }

    public void kiadas(String nev) {
        ruhak.removeIf(ruha -> {
            if (ruha.getTulaj().equals(nev) && ruha.isTiszta()) {
                kiadottRuhak.add(ruha);
                return true;
            }
            return false;
        });
    }

    public void mosas(String nev) {
        for (Ruha ruha : ruhak) {
            if (ruha.getTulaj().equals(nev)) {
                ruha.setTiszta(true);
            }
            if ("ing".equals(ruha.getTipus()) && ruha.getTulaj().equals(nev)) {
                double newSzinintenzitas = ruha.getSzinintenzitas() * 0.97;
                ruha.setSzinintenzitas(Math.max(newSzinintenzitas, 0));
            }
        }
    }

    @Override
    public String toString() {
        return "Benn lévő Ruhák: " + ruhak.stream()
                .map(ruha -> ruha.getTipus() != null && "ing".equals(ruha.getTipus())
                        ? ruha.getTulaj() + " (ingjének a színintenzitása a mosás után: " +
                        String.format("%.1f", ruha.getSzinintenzitas()) + "%)"
                        : ruha.getTulaj())
                .collect(Collectors.joining(", ")) +
                "\nKiadott Ruhák: " + kiadottRuhak.stream()
                .map(ruha -> ruha.getTipus() != null && "ing".equals(ruha.getTipus())
                        ? ruha.getTulaj() + " (ingjének a színintenzitása: " +
                        String.format("%.1f", ruha.getSzinintenzitas()) + "%)"
                        : ruha.getTulaj())
                .collect(Collectors.joining(", "));
    }

}
