package hu.petrik;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista = new ArrayList<>();

    //nem biztos hogy jó
    /*public Bank(int szamlakSzama) {
        for (int i = 0; i < szamlakSzama; i++) {
            this.szamlaLista=new ArrayList<>();
        }
    }*/
    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret){
        Szamla newSzamla;
        if(hitelKeret > 0){
            newSzamla = new HitelSzamla(tulajdonos, hitelKeret);
            szamlaLista.add(newSzamla);
        } else{
            newSzamla = new MegtakaritasiSzamla(tulajdonos);
            szamlaLista.add(newSzamla);
        }
        return newSzamla;
    }

    public int getOszzegyenleg(Tulajdonos tulajdonos){
        int ossz = 0;
        for (Szamla szamlak: szamlaLista ){
            ossz+= szamlak.getAktualisEgyenleg();
        }
        return ossz;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){
        Szamla legnagyobb = szamlaLista.get(0);
        for (Szamla szamlak: szamlaLista) {
            if(szamlak.getAktualisEgyenleg() > legnagyobb.getAktualisEgyenleg()){
                legnagyobb = szamlak;
            }
        }
        return legnagyobb;
    }

    public long getOsszhitelkeret(){
        long osszOsszeg=0;
        for (Szamla szamlak: szamlaLista) {
            /*TODO:
            ki kell válsztani a hiteleszamlákat valahogy...
            maybe a kivesz metodus segitségével...
             */
        }
        return osszOsszeg;
    }


}
