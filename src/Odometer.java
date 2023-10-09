public class Odometer {
    //Define a class called Odometer that will be used to track fuel and mileage for an automobile. The
    //class should have instance variables to track the miles driven and the fuel efficiency of the vehicle
    //in miles per gallon.
    private double milesDriven;
    private double fuelEfficiency; // miles per gallon

    // constructor
    public Odometer() {
        milesDriven = 0;
        fuelEfficiency = 0;
    }

    // mutator method to reset the odometer to zero miles
    public void resetOdometer() {
        milesDriven = 0;
    }

    // mutator method to set the fuel efficiency
    public void setFuelEfficiency(double efficiency) {
        if (efficiency > 0) {
            fuelEfficiency = efficiency;
        } else {
            System.out.println("Error: Fuel efficiency must be greater than zero.");
        }
    }

    // mutator method that accepts miles driven for a trip and adds it to the odometer’s total
    public void addMiles(double miles) {
        if (miles > 0) {
            milesDriven += miles;
        } else {
            System.out.println("Sorry! Miles driven must be greater than zero.");
        }
    }

    // accessor method that returns the number of gallons of gasoline consumed
    public double getGallonsConsumed() {
        return milesDriven / fuelEfficiency;
    }

    public static void main(String[] args) {
        // run example
        Odometer myOdometer = new Odometer();

        myOdometer.setFuelEfficiency(25); // set fuel efficiency to 25 miles per gallon
        myOdometer.addMiles(100);          // drive 100 miles
        System.out.println("Gallons consumed: " + myOdometer.getGallonsConsumed()); // output: 4.0

        myOdometer.resetOdometer();        // reset the odometer
        myOdometer.setFuelEfficiency(30); // set a different fuel efficiency
        myOdometer.addMiles(150);         // drive 150 miles
        System.out.println("Gallons consumed: " + myOdometer.getGallonsConsumed()); // output: 5.0

        myOdometer.resetOdometer();        // reset the odometer
        myOdometer.setFuelEfficiency(40); // set a different fuel efficiency
        myOdometer.addMiles(250);         // drive 250 miles
        System.out.println("Gallons consumed: " + myOdometer.getGallonsConsumed()); // output: 6.5

        myOdometer.resetOdometer();        // reset the odometer
        myOdometer.setFuelEfficiency(80); // set a different fuel efficiency
        myOdometer.addMiles(400);         // drive 400 miles
        System.out.println("Gallons consumed: " + myOdometer.getGallonsConsumed()); // output: 5.0
    }
}

//Output
//Gallons consumed: 4.0
//Gallons consumed: 5.0
//Gallons consumed: 6.25
//Gallons consumed: 5.0


