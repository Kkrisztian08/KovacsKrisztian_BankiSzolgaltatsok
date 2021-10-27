package hu.petrik;

public class Szamla extends BankiSzolgaltatas{
    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void Befizet(int osszeg){
        this.aktualisEgyenleg+=osszeg;
    }

    public boolean Kivesz(int osszeg){
        aktualisEgyenleg-=osszeg;
        return true;
    }


}
