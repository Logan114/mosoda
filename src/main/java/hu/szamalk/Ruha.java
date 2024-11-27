package hu.szamalk;

public class Ruha {
    private String tulaj;
    private boolean tiszta;

    public Ruha(String tulaj) {
        this.tulaj = tulaj;
    }

    public Ruha(String tulaj, boolean tiszta) {
        this.tulaj = tulaj;
        this.tiszta = tiszta;
    }

    public String getTulaj() {
        return tulaj;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }

    public boolean isTiszta() {
        return tiszta;
    }
}
