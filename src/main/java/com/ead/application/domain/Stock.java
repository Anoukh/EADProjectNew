package com.ead.application.domain;

import java.sql.Timestamp;

/**
 * Created by prabash on 12/1/2015.
 */
public class Stock {

    private int stock_number;
    private int engine_id;
    private int no_of_units;
    private float cost;
    private String status;
    private java.sql.Timestamp date_manufactured;
    private String engineName;


    public int getengine_id() {
        return engine_id;
    }

    public void setengine_id(int engine_id) {
        this.engine_id = engine_id;
    }

    public int getStock_number() {
        return stock_number;
    }

    public void setStock_number(int stock_number) {
        this.stock_number = stock_number;
    }

    public int getNo_of_units() {
        return no_of_units;
    }

    public void setengineName(String engineName) {
        this.engineName = engineName;
    }

    public String getengineName() {
        return engineName;

    }

    public void setNo_of_units(int no_of_units) {
        this.no_of_units = no_of_units;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getDate_manufactured() {
        return date_manufactured;
    }

    public void setDate_manufactured(Timestamp date_manufactured) {
        this.date_manufactured = date_manufactured;
    }

    public Stock() {

        super();
    }

    public Stock(int stock_number,int engine_id,int no_of_units,float cost,String status,java.sql.Timestamp date_manufactured,String engineName)
    {
        this.stock_number = stock_number;
        this.engine_id    = engine_id;
        this.no_of_units  = no_of_units;
        this.cost         = cost;
        this.status       = status;
        this.date_manufactured = date_manufactured;
        this.engineName   = engineName;



    }
}
