package hu.petrik;

public class HitelSzamla extends Szamla{
    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    @Override
    public boolean Kivesz(int osszeg) {
        boolean sikeres=true;

        if ((super.aktualisEgyenleg-osszeg)>this.hitelKeret) {
            super.aktualisEgyenleg-=osszeg;
            return sikeres;
        }else{
            return !sikeres;
        }
    }
}
