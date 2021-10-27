package hu.petrik;

public class Szamla extends BankiSzolgaltatas{
    private int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos, int aktualisEgyenleg) {
        super(tulajdonos);
        this.aktualisEgyenleg = aktualisEgyenleg;
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void Befizet(int osszeg){
        aktualisEgyenleg+=osszeg;
    }

    public final boolean Kivesz(int osszeg){
        aktualisEgyenleg-=osszeg;
        return true;
    }


}
