package com.ead.application.domain;

/**
 * Created by anoukh on 11/20/15.
 */
public class Engine {

    private int engineID;
    private String engine_name;
    private String fuel_type;
    private String mounting_type;
    private int cc;
    private int no_of_cylinders;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

/*      Getters and Setters       */

    public int getEngineID() { return engineID; }

    public void setEngineID(int engineID) { this.engineID = engineID; }

    public String getEngine_name() { return engine_name; }

    public void setEngine_name(String engine_name) { this.engine_name = engine_name; }

    public String getFuel_type() { return fuel_type; }

    public void setFuel_type(String fuel_type) { this.fuel_type = fuel_type; }

    public String getMounting_type() { return mounting_type; }

    public void setMounting_type(String mounting_type) { this.mounting_type = mounting_type; }

    public int getCc() { return cc; }

    public void setCc(int cc) { this.cc = cc; }

    public int getNo_of_cylinders() { return no_of_cylinders; }

    public void setNo_of_cylinders(int no_of_cylinders) { this.no_of_cylinders = no_of_cylinders; }


    /*  Constructors    */

    public Engine() {
        super();
    }

    public Engine(int engineID, String engine_name, String fuel_type, String mounting_type, int cc, int no_of_cylinders, double price) {
        this.engineID = engineID;
        this.engine_name = engine_name;
        this.fuel_type = fuel_type;
        this.mounting_type = mounting_type;
        this.cc = cc;
        this.no_of_cylinders = no_of_cylinders;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Engine [name=" + engine_name + ", cc=" + cc +
                "]";
    }
}
