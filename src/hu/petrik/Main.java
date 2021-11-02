package hu.petrik;

public class Main {

    public static void main(String[] args) {
        //kettő tulajdonos
        Tulajdonos t1 = new Tulajdonos("Kovács Béla");
        Tulajdonos t2 = new Tulajdonos("Kiss Pál");
        System.out.println();
        HitelSzamla h1 = new HitelSzamla(t1, 20000);
        System.out.println(h1.Kivesz(5000));

        Kartya k1 = h1.UjKartya("129834765");
        System.out.println(k1.getKartyaSzam());
        System.out.println(k1.getTulajdonos().getNev());
        k1.getSzamla().Befizet(35000);

        System.out.println("15000 Ft értékű vásárlás : " + (k1.Vasarlas(15000) ? "Sikeres tranzakció":"Sikertelen tranzakció"));
        System.out.println("Számla aktuális egyenlege: "+k1.getSzamla().getAktualisEgyenleg());
        System.out.println("18000 Ft-os befizetés");
        k1.getSzamla().Befizet(18000);
        System.out.println("Számla aktuális egyenlege: "+k1.getSzamla().getAktualisEgyenleg());
        System.out.println("62000 Ft vásárlás : " + (k1.Vasarlas(62000) ? "Sikeres tranzakció" : "Sikertelen tranzakció"));
        System.out.println("Számla aktuális egyenlege: "+k1.getSzamla().getAktualisEgyenleg());
        System.out.println("500 Ft vásárlás : " + (k1.Vasarlas(500) ? "Sikeres tranzakció" : "Sikertelen tranzakció"));

        System.out.println("10000 Ft vásárlás : " + (k1.getSzamla().Kivesz(10000)? "Sikeres tranzakció" : "Sikertelen tranzakció"));
        System.out.println("Számla aktuális egyenlege: "+k1.getSzamla().getAktualisEgyenleg());

        System.out.println();
        MegtakaritasiSzamla m1 = new MegtakaritasiSzamla(t1);
        System.out.println("A kamat mértéke: "+m1.getKamat());
        System.out.println("One Moment Later...");
        m1.setKamat(1.6);
        System.out.println("A kamat mértéke: "+m1.getKamat()+"-ra változott");
        m1.Befizet(15000);
        System.out.println("Aktuáli egyenleg: "+m1.getAktualisEgyenleg());
        System.out.println("kivesz 7000 Ft-ot: " + (m1.Kivesz(7000) ? "Sikeres tranzakció" : "Sikertelen tranzakció"));
        System.out.println("Aktuáli egyenleg: "+m1.getAktualisEgyenleg());
        System.out.println("kivesz 25000 Ft-ot: " + (m1.Kivesz(25000) ? "Sikeres tranzakció" : "Sikertelen tranzakció"));
        System.out.println("Aktuáli egyenleg: "+m1.getAktualisEgyenleg());
        m1.Kamatjovairas();
        System.out.println("Aktuáli egyenleg a kamat jóváírása után: "+m1.getAktualisEgyenleg());

        System.out.println();

        Bank b1 = new Bank();

        b1.szamlanyitas(t2, 0);
        b1.szamlanyitas(t1, 0);
        b1.szamlanyitas(t2, 0);
        b1.szamlanyitas(t1, 10000);
        b1.szamlanyitas(t1, 10000);
        b1.szamlanyitas(t2, 20000);

        b1.szamlaLista.get(0).Befizet(20000);
        b1.szamlaLista.get(1).Befizet(400000);
        b1.szamlaLista.get(2).Befizet(900000);
        b1.szamlaLista.get(3).Befizet(210000);
        b1.szamlaLista.get(4).Befizet(330000);
        b1.szamlaLista.get(5).Befizet(350000);

        System.out.println("számla típusa:");
        System.out.println(b1.szamlaLista.get(2).getClass());
        System.out.println(b1.szamlaLista.get(4).getClass());

        System.out.println(t1.getNev()+" legnagyobb egyenlegő számlája: "+b1.getLegnagyobbEgyenleguSzamla(t1).getAktualisEgyenleg());
        System.out.println(t1.getNev() + " összes egyenlege: "+ b1.getOszzegyenleg(t1));
        System.out.println("Össz hitelkeret: " + b1.getOsszhitelkeret());





    }
}
