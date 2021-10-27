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
        if ((super.getAktualisEgyenleg()-osszeg)>-1*this.hitelKeret) {
            super.aktualisEgyenleg-=osszeg;
            return true;
        }else{
            return false;
        }
    }
}
