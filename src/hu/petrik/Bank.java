package hu.petrik;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista = new ArrayList<>();

    public Bank(int szamlakSzama) {
        //szamlakSzama=szamlaLista.size();
        for (int i = 0; i < szamlakSzama; i++) {

        }
    }
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
            osszOsszeg += ((HitelSzamla) szamlak).getHitelKeret();
        }
        return osszOsszeg;
    }


}
