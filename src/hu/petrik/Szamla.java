package hu.petrik;

public abstract class Szamla extends BankiSzolgaltatas{
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

    public abstract boolean Kivesz(int osszeg);

    public Kartya UjKartya(String kartyaszam) {
        return new Kartya(this.getTulajdonos(), this, kartyaszam);
    }


}
