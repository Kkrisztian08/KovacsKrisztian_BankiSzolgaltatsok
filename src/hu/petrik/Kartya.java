package hu.petrik;

public class Kartya extends BankiSzolgaltatas {
    private Szamla szamla;
    private final String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean Vasarlas(int osszeg){
        return szamla.Kivesz(osszeg);
    }
}
