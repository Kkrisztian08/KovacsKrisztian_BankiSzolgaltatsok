package hu.petrik;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    private static double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public void Kamatjóváírás(){
        super.aktualisEgyenleg = (int) (super.aktualisEgyenleg * (100 + this.kamat) / 100);
    }

    @Override
    public boolean Kivesz(int osszeg) {
        if (super.aktualisEgyenleg-osszeg>0) {
            super.aktualisEgyenleg-=osszeg;
            return true;
        }else{
            return false;
        }
    }
}
