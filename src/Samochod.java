import java.io.Serializable;

public class Samochod implements Serializable
{
    protected String marka;
    protected String model;
    protected int rokProdukcji;
    protected int przebieg;

    public String getMarka()
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

    public Samochod(String marka, String model, int rokProdukcji, int przebieg)
    {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public Samochod()
    { }

    public String Informacje()
{
    String informacje;
    informacje=this.marka + " " + this.model + " " + this.rokProdukcji + " " + this.przebieg;
    return informacje;
}

    public String toString() {
        return new StringBuffer(" Marka: ").append(this.marka)
                .append(" Model : ").append(this.model).append(" Rok Produkcji : ").append(this.rokProdukcji).append("Przebieg : ").append("\n").toString();
    }

}
