package hu.petrik;

public class HitelSzamla extends Szamla{
    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int aktualisEgyenleg, int hitelKeret) {
        super(tulajdonos, aktualisEgyenleg);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }


}
