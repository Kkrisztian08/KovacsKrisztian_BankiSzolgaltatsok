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
        boolean sikeresVasarlas=true;
        if (szamla.getAktualisEgyenleg()-osszeg>0) {
            szamla.aktualisEgyenleg-=osszeg;
            return sikeresVasarlas;
        }else {
            return !sikeresVasarlas;
        }
    }
}
