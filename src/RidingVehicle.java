import javax.swing.*;

public class RidingVehicle {

    public static void main(String[] args) {

        Car mercedes = new Car(); // to samo musi byc z lewej i prawe czyli Car = Car
        Bike giant = new Bike(); // Bike = Bike

        // Bike bmx = new Car(); // nie mozemy !!! inny typ obiektu


        // W ten sposób opisujemy samochód nadając mu atrybuty z innej klasy (CAR)

        System.out.println("samochód: Mercedes"); //
        System.out.println("ilość biegów: " + mercedes.gears);
        System.out.println("prędkośc maksymalna : " + mercedes.maxspeed);
        System.out.println("waga pojazdu to : " + mercedes.weight);
        mercedes.currentspeed = 15;
        mercedes.currentspeed = 0;


        if (mercedes.currentspeed > 0)
            System.out.println("Jedziemy");
        else {
            System.out.println("stoimy, ruszaj");


            System.out.println("------------------------------");

            mercedes.currentspeed = 250;

            Car Volvo = new Car();
            Volvo.currentspeed = 300;


           // Do kazdego nowego obiektu przypisujemy wlasną wartość z klasy


            System.out.println("Prędkość mercedesa to :" + mercedes.currentspeed );
            System.out.println("Prędkość mercedesa to :" + Volvo.currentspeed );


            // Metoda setcurrent speed - z car : public void setCurrentspeed(int speed) {
            //        currentspeed = speed;

            mercedes.setCurrentspeed(50);
            System.out.println("Prędkość mercedesa to :" + mercedes.currentspeed );



            System.out.println(".......................................");





        }
    }
}

