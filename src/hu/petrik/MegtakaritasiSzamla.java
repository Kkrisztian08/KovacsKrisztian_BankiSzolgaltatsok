package hu.petrik;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    public static double alapKamat=1.5;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public void Kamatjovairas(){
        super.aktualisEgyenleg= (int) (getAktualisEgyenleg()*kamat);
    }

    @Override
    public boolean Kivesz(int osszeg) {
        boolean sikeres=true;

        if (super.aktualisEgyenleg-osszeg>0) {
            super.aktualisEgyenleg-=osszeg;
            return sikeres;
        }else{
            return !sikeres;
        }
    }
}
