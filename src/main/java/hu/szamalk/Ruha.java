package hu.szamalk;

public class Ruha {
    private String tulaj, tipus;
    private boolean tiszta;
    private double szinintenzitas = 100.0; // Default value set to 100%

    public Ruha(String tulaj) {
        this.tulaj = tulaj;
    }

    public Ruha(String tulaj, String tipus) {
        this.tulaj = tulaj;
        this.tipus = tipus;
    }

    public Ruha(String tulaj, String tipus, double szinintenzitas) {
        this.tulaj = tulaj;
        this.tipus = tipus;
        this.szinintenzitas = szinintenzitas;
    }
    public String getTulaj() {
        return tulaj;
    }

    public String getTipus() {
        return tipus;
    }
    public void setSzinintenzitas(double szinintenzitas) {
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
