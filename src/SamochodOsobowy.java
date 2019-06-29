import java.io.Serializable;

public class SamochodOsobowy extends Samochod implements Serializable
{
    protected int waga;
    protected int pojemnoscSilnika;
    protected int iloscOsob;


    public int getWaga()
    {
        return waga;
    }

    public void setWaga(int newWaga)
    {
        if(newWaga<1000 || newWaga >3000)
        {
            System.out.println("Waga samochodu musi być z zakresu od jednej do trzech ton");
        }
        else
            waga=newWaga;
    }

    public int getPojemnoscSilnika()
    {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(int newPojemnoscSilnika)
    {
        if(newPojemnoscSilnika <800 || newPojemnoscSilnika >3000)
        {
            System.out.println("Pojemnosc silnika musi byc z zakresu 800 cm3 - 3000cm3.");
        }
        else
            pojemnoscSilnika=newPojemnoscSilnika;
    }

    public int getIloscOsob()
    {
        return iloscOsob;
    }

    public void setIloscOsob(int newiloscOsob)
    {
        iloscOsob=newiloscOsob;
    }



    public SamochodOsobowy(String marka, String model, int rokProdukcji, int przebieg, int waga, int pojemnoscSilnika, int iloscOsob)
{
    this.marka=marka;
    this.model=model;
    this.rokProdukcji=rokProdukcji;
    this.przebieg=przebieg;
    this.waga = waga;
    this.pojemnoscSilnika = pojemnoscSilnika;
    this.iloscOsob = iloscOsob;
}

    public SamochodOsobowy() { }


    public String Informacje()
    {
        String informacje;
        informacje=this.marka + " " + this.model + " " + this.rokProdukcji + " " + this.przebieg + " " + this.iloscOsob + " " + this.pojemnoscSilnika + " " + this.waga;
        return informacje;
    }

    public String toString()
    {
        return new StringBuffer(" Marka: ").append(this.marka)
                .append(" Model : ").append(this.model).append(" Rok Produkcji : ").append(this.rokProdukcji).append("Przebieg : ")
                .append(this.przebieg).append(" Ilosc Osob : : ").append(this.iloscOsob).append(" Pojemnosc Silnika : ").append(this.pojemnoscSilnika)
                .append(" Waga : ").append(this.waga).append("\n").toString();
    }
}
