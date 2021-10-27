package hu.petrik;

public class Main {

    public static void main(String[] args) {
	Tulajdonos t1=new Tulajdonos("Pisti");
    HitelSzamla h1=new HitelSzamla(t1, 10000);
    MegtakaritasiSzamla m1=new MegtakaritasiSzamla(t1);
    h1.Befizet(40000);
    m1.Befizet(150000);

    System.out.println(h1.Kivesz(4000));
    System.out.println(m1.Kivesz(150005));

    System.out.println(m1.getAktualisEgyenleg());
    m1.Kamatjovairas();





    }
}
