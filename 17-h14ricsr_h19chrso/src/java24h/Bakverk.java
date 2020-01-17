package java24h;

public class Bakverk {

    //Instansvariabler
    private String produktId;
    private String produktTyp;
    private String marke;
    private int pris;
    private int antal;
    private String bakeOff;
    private String storlek;
    private int vikt;

    //Våran konstruktor
    public Bakverk(String produktTyp, String marke, int pris, int antal, String bakeOff, String storlek, int vikt) {

        this.produktTyp = produktTyp;
        this.marke = marke;
        this.pris = pris;
        this.antal = antal;
        this.bakeOff = bakeOff;
        this.storlek = storlek;
        this.vikt = vikt;

    }

    //set metoder
    public void setProduktId(String produktId) {
        this.produktId = produktId;
    }

    public void setProduktTyp(String produktTyp) {
        this.produktTyp = produktTyp;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public void setBakeOff(String bakeOff) {
        this.bakeOff = bakeOff;
    }

    public void setStorlek(String storlek) {
        this.storlek = storlek;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    //Get metoder
    public String getProduktId() {
        produktId = produktTyp.substring(0, 2).toUpperCase() + marke.substring(0, 2).toUpperCase();
        return produktId;
    }

    public String getProduktTyp() {
        return produktTyp;
    }

    public int getPris() {
        return pris;
    }

    public int getAntal() {
        return antal;
    }

    public String getBakeOff() {
        return bakeOff;
    }

    public String getStorlek() {
        return storlek;
    }

    public int getVikt() {
        return vikt;
    }

    public String getMarke() {
        return marke;
    }

    public String getBakverk() {
        return "\nProdukt ID: " + produktId + "\nProdukttyp: " + produktTyp + "\nMärke: " + marke + "\nPris: " + pris + "kr/st" + "\nAntal: " + antal + "st" + "\nBake off(Ja/Nej): " + bakeOff
                + "\nVikt: " + vikt + " g/st" + "\n***************************************************";
    }

}
