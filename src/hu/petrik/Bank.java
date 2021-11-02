package hu.petrik;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public List<Szamla> szamlaLista = new ArrayList<>();

    public Bank() {

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
            if (szamlak.getTulajdonos().getNev().equals(tulajdonos.getNev())) {
                ossz += szamlak.getAktualisEgyenleg();
            }
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
            if(szamlak.getClass().getTypeName().contains("HitelSzamla")){
                osszOsszeg += ((HitelSzamla)szamlak).getHitelKeret();
            }
        }
        return osszOsszeg;
    }


}
