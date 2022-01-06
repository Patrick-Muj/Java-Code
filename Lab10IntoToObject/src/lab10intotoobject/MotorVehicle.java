/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10intotoobject;

/**
 *
 * @author Patrick Mujambere
 */
public class MotorVehicle {
    
    private String vehicleType;
    private int numberWheels;
    private double engineSize;
    private boolean powerSteering;
    private String purchaseDate;
    
    public MotorVehicle (String vehicle){
        this.vehicleType = vehicle;
 
    }
    public MotorVehicle (String vehicle, int numberWheel, 
                         double engineSizeIn, boolean powerStreering,
                         String purchaseDate){
        this.vehicleType = vehicle;
        this.numberWheels = numberWheel;
        this.powerSteering = true;
        this.engineSize = engineSizeIn;
        this.purchaseDate = purchaseDate;
        
        
    }
    public MotorVehicle(){
        
    }
    
    
   public void setvehicleType(String type){
       //Statement
           this.vehicleType = type;

   }
   public String getvehicle(){
       
       return this.vehicleType;
   }
   public void setnumberWheels(int numberWheels){
       //something 
       this.numberWheels = numberWheels;
      
       
   }
   public int getnumberWheels(){
       
       return this.numberWheels;
   }
   public void setEngineSize(double engineSize){
       // do something
       this.engineSize = engineSize;
   }
   public double getEngineSize(){
       
       return this.engineSize;
   }
   public void setPowerSteering(boolean powerSteering){
       // do something
       this.powerSteering = powerSteering;
   }
   public boolean getPowerSteering(){
       
       return this.powerSteering;
   }
   public void setPurchaseDate(String purchaseDate){
       //do something
       this.purchaseDate= purchaseDate;
   }
   public String getPurchaseDate(){
       
       return this.purchaseDate;
   }
}
