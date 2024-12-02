package hu.szamalk;

public class Ruha {
    private String tulaj, tipus;
    private boolean tiszta;
    private double szinintenzitas = 100.0;

    public Ruha(String tulaj) {
        if (tulaj == null || tulaj.isEmpty()) {
            throw new IllegalArgumentException("Tulaj name cannot be null or empty");
        }
        this.tulaj = tulaj;
    }

    public Ruha(String tulaj, String tipus) {
        if (tulaj == null || tulaj.isEmpty()) {
            throw new IllegalArgumentException("Tulaj name cannot be null or empty");
        }
        this.tulaj = tulaj;
        this.tipus = tipus;
    }

    public Ruha(String tulaj, String tipus, double szinintenzitas) {
        if (tulaj == null || tulaj.isEmpty()) {
            throw new IllegalArgumentException("Tulaj name cannot be null or empty");
        }
        this.tulaj = tulaj;
        this.tipus = tipus;
        this.szinintenzitas = szinintenzitas < 0 ? 100.0 : szinintenzitas;
    }

    public String getTulaj() {
        return tulaj;
    }

    public String getTipus() {
        return tipus;
    }

    public void setSzinintenzitas(double szinintenzitas) {
        if (szinintenzitas < 0 || szinintenzitas > 100) {
            throw new IllegalArgumentException("Szinintenzitas must be between 0 and 100");
        }
        this.szinintenzitas = szinintenzitas;
    }

    public double getSzinintenzitas() {
        return szinintenzitas;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }

    public boolean isTiszta() {
        return tiszta;
    }
}
