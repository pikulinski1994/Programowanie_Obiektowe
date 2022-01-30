public class Car {

    public int gears = 6;
    public double weight = 2145.5; // kg
    public int maxspeed = 220; // km/h

    public int currentspeed = 0; // km/h

    public void setCurrentspeed(int speed) {
        currentspeed = speed;


        // W ten sposob sprawdzamy czy paramtery ktore sa podawane sa prawdziwe zgodnie z oczekiwaniami podanymi
        // w opisie Car

        if(speed<0) {
            currentspeed = 0;
        } else if(speed>maxspeed) {
            currentspeed = maxspeed;
        } else {
            currentspeed = speed;

        }

    }


}
