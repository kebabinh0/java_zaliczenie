import java.io.Serializable;

public class Samochod implements Serializable //Klasa Samochod implementuje interfejs Serializable aby mozna bylo serializowac i zapisywac do pliku
{
    protected String marka;   //zmienne
    protected String model;
    protected int rokProdukcji;
    protected int przebieg;

    public String getMarka() //gettery i settery dla poszczegolnych pol aby mozna bylo edytowac i wyciagac wartosci poszczegolnych pol klasy
    {
        return marka;
    }

    public void setMarka(String newMarka)
    {
        this.marka=newMarka;
    }


    public String getModel()
    {
        return model;
    }

    public void setModel(String newModel)
    {
        this.model=newModel;
    }

    public int getRokProdukcji()
    {
       return rokProdukcji;
    }

    public void setRokProdukcji(int newRokProdukcji)
    {
        this.rokProdukcji=newRokProdukcji;
    }

    public int getPrzebieg()
    {
        return przebieg;
    }

    public void setPrzebieg(int newPrzebieg)
    {
        this.przebieg=newPrzebieg;
    }

    //koniec getterow i setterow

    public Samochod(String marka, String model, int rokProdukcji, int przebieg)
    {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public Samochod()
    { }

    public String Informacje() // metoda zwracajaca informacje o obiekcie zapisane w stringu
{
    String informacje;
    informacje=this.marka + " " + this.model + " " + this.rokProdukcji + " " + this.przebieg;
    return informacje;
}

    public String toString()  //metoda zwracajaca nowy string ktory bedzie zapisany do pliku
    {
        return new StringBuffer(" Marka: ").append(this.marka)
                .append(" Model : ").append(this.model).append(" Rok Produkcji: ").append(this.rokProdukcji).append("Przebieg: ").append("\n").toString();
    }

}
