//import java.util.Math;

public class Car {
    public String name;
    private int year;
    private String make;
    private String model;


    public Car(){
        name = "";
        year = 0;
        make = "";
        model = "";

    }

    //default constructor
    public Car (String name, int year, String make, String model){
        this.name = name;
        this.year = year;
        this.make = make;
        this.model = model;

    }

    //getters

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    //setters (they dont return so theyre void)

    public void setName(String name){
        this.name = name;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String toString(){
        return name + " " + year + " " + make + " " + model;
    }
}