package com.step;

import java.util.Comparator;

public class Auto {
    
    private String producator;
    private String model;
    private int an;
    private int motorCapacity;
    private String tip;
    
    public Auto(String producator, String model, int an, int motorCapacity, String tip){
        this.producator = producator;
        this.model = model;
        this.an = an;
        this.motorCapacity = motorCapacity;
        this.tip = tip;
    }
    
    public String getModel(){
      return model;
    }
    
    public int getMotorCapacity(){
        return motorCapacity;
    }
    
    public int getAn(){
        return an; 
    }
    
    public String getTip(){
        return tip;
    }
   
    
    @Override
    public String toString(){
        return " Producator: " + this.producator + " Model: " + this.model + " An: " 
               + this.an +  " motorCapacity: " + this.motorCapacity + " Tip: " + this.tip;
    
    } 
}

class ModelComparator implements Comparator<Auto>{

    @Override
    public int compare(Auto a1, Auto a2) {
        return a1.getModel().compareTo(a2.getModel());
    }

}
