//AUTORZY:
//WIKTORIA BROL
//BARTOSZ URBAŃSKI
//INFORMATYKA NIESTACJONARNE ROK II

import java.io.*;

public class Main {


    private static final String filepath = "C:\\auta_folder\\auta.txt";

    public static void main(String[] args) {
        try {

            Samochod samochod = new Samochod("Toyota", "Rav2", 1995, 7500);
            Samochod samochod1 = new Samochod("Toyota", "Rav3", 1997, 5000);
            SamochodOsobowy samochodOsobowy = new SamochodOsobowy("Toyota", "Rav1", 1992, 10000, 5, 2500, 2500);

            System.out.println(samochod.Informacje());
            System.out.println(samochod1.Informacje());
            System.out.println(samochodOsobowy.Informacje());



            Main objectIO = new Main();

            Thread thread = new Thread(() ->
            {
                System.out.println("Thread start");
                objectIO.WriteObjectToFile(samochod);
                objectIO.WriteObjectToFile(samochod1);
                objectIO.WriteObjectToFile(samochodOsobowy);

            });



            thread.start();
            thread.interrupt();



        } catch (Exception e) {
            System.out.print(e);
        }


    }

    public void WriteObjectToFile(Object serObj) {

        try {

            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
