import java.io.Serializable;

public class SamochodOsobowy extends Samochod implements Serializable //Klasa samochod osobowy dziediczy po samochodzie implementuje interfejs serializable co by mozna zapisac
{
    protected int waga;
    protected int pojemnoscSilnika;
    protected int iloscOsob;

    //pola w klasie

    public int getWaga() // gettery i settery
    {
        return waga;
    }

    public void setWaga(int newWaga)
    {
        if(newWaga<1000 || newWaga >3000)   //setter z ograniczeniem do wartosci narzuconych z gory
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
        if(newPojemnoscSilnika <800 || newPojemnoscSilnika >3000) //jak wyzej
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


//koniec getterow i seterow

    public SamochodOsobowy(String marka, String model, int rokProdukcji, int przebieg, int waga, int pojemnoscSilnika, int iloscOsob) //konstruktor
{
    this.marka=marka;
    this.model=model;
    this.rokProdukcji=rokProdukcji;
    this.przebieg=przebieg;
    this.waga = waga;
    this.pojemnoscSilnika = pojemnoscSilnika;
    this.iloscOsob = iloscOsob;
}

    public SamochodOsobowy() { } //konstruktor bezargumentowy


    public String Informacje() //metoda zapisujaca informacje do stringa
    {
        String informacje;
        informacje=this.marka + " " + this.model + " " + this.rokProdukcji + " " + this.przebieg + " " + this.iloscOsob + " " + this.pojemnoscSilnika + " " + this.waga;
        return informacje;
    }

    public String toString() //metoda tworzaca nowy string ktory bedzie zapisywany do pliku
    {
        return new StringBuffer(" Marka: ").append(this.marka)
                .append(" Model: ").append(this.model).append(" Rok Produkcji: ").append(this.rokProdukcji).append("Przebieg: ")
                .append(this.przebieg).append(" Ilosc Osob: ").append(this.iloscOsob).append(" Pojemnosc Silnika: ").append(this.pojemnoscSilnika)
                .append(" Waga: ").append(this.waga).append("\n").toString();
    }
}
