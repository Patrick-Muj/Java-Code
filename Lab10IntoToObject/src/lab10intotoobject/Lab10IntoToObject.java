/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10intotoobject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Patrick Mujambere
 */
public class Lab10IntoToObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the vehicle type as a string,\nthe number of "
                            + "wheels as an integer,\nthe engine size as a double in cubic "
                            + "centimeters (cc),\nthe power steering as a boolean "
                            + "(true or false),\nand the purchase date as mm/dd/yyyy\n");
        
        Scanner input = new Scanner (System.in);
        String car1, car2, car3;
        String[] car1array = new String[5];
        System.out.print("Enter the data for vehicle 1:");
        car1= input.nextLine();
        car1array = car1.split("\\s+");
        //place info from cararray into a new motor vehicle
        
        MotorVehicle[] vehicleArray = new MotorVehicle[3];
        ArrayList<MotorVehicle> vehicleArrayList = new ArrayList<MotorVehicle>();
        
        //Array for car1
        vehicleArray[0] = new MotorVehicle();
        vehicleArray[0].setvehicleType(car1array[0]);
        vehicleArray[0].setnumberWheels(Integer.parseInt(car1array[1]));
        vehicleArray[0].setEngineSize(Double.parseDouble(car1array[2]));
        vehicleArray[0].setPowerSteering(Boolean.parseBoolean(car1array[3]));
        vehicleArray[0].setPurchaseDate(car1array[4]);
        
        //ArrayList for car1
        MotorVehicle tempVehicle = new MotorVehicle();
        tempVehicle.setvehicleType(car1array[0]);
        tempVehicle.setnumberWheels(Integer.parseInt(car1array[1]));
        tempVehicle.setEngineSize(Double.parseDouble(car1array[2]));
        tempVehicle.setPowerSteering(Boolean.parseBoolean(car1array[3]));
        tempVehicle.setPurchaseDate(car1array[4]);
        vehicleArrayList.add(tempVehicle);

//  CAr number 2
    
        String[] car2array = new String[5];    
        System.out.print("Enter the data for vehicle 2:");        
        car2 = input.nextLine();
        car2array = car2.split("\\s+"); 
        
        //Array for car2
        vehicleArray[1] = new MotorVehicle();
        vehicleArray[1].setvehicleType(car2array[0]); 
        vehicleArray[1].setnumberWheels(Integer.parseInt(car2array[1]));
        vehicleArray[1].setEngineSize(Double.parseDouble(car2array[2]));
        vehicleArray[1].setPowerSteering(Boolean.parseBoolean(car2array[3]));
        vehicleArray[1].setPurchaseDate(car2array[4]);
        
       //ArrayList for car2
        MotorVehicle temp1Vehicle = new MotorVehicle();
        temp1Vehicle.setvehicleType(car2array[0]);
        temp1Vehicle.setnumberWheels(Integer.parseInt(car2array[1]));
        temp1Vehicle.setEngineSize(Double.parseDouble(car2array[2]));
        temp1Vehicle.setPowerSteering(Boolean.parseBoolean(car2array[3]));
        temp1Vehicle.setPurchaseDate(car2array[4]);
        vehicleArrayList.add(temp1Vehicle);        
        //Car number 3

        String[] car3array = new String[5];    
        System.out.print("Enter the data for vehicle 3:");        
        car3 = input.nextLine();
        car3array = car3.split("\\s+");
        
        //Array for car3
        vehicleArray[2] = new MotorVehicle();
        vehicleArray[2].setvehicleType(car3array[0]); 
        vehicleArray[2].setnumberWheels(Integer.parseInt(car3array[1]));
        vehicleArray[2].setEngineSize(Double.parseDouble(car3array[2]));
        vehicleArray[2].setPowerSteering(Boolean.parseBoolean(car3array[3]));
        vehicleArray[2].setPurchaseDate(car3array[4]);
        
        //ArrayList for car3
        MotorVehicle temp2Vehicle = new MotorVehicle();
        temp2Vehicle.setvehicleType(car3array[0]);
        temp2Vehicle.setnumberWheels(Integer.parseInt(car3array[1]));
        temp2Vehicle.setEngineSize(Double.parseDouble(car3array[2]));
        temp2Vehicle.setPowerSteering(Boolean.parseBoolean(car3array[3]));
        temp2Vehicle.setPurchaseDate(car3array[4]);
        vehicleArrayList.add(temp2Vehicle);
        
        System.out.println("");
        System.out.println("Data from the array follows:");
        System.out.println("Vehicle Type #-wheels Engine Size Power Steering Purchase Date");
        System.out.print(vehicleArray[0].getvehicle() + " " + vehicleArray[0].getnumberWheels()
                + " " + vehicleArray[0].getEngineSize() + " " + vehicleArray[0].getPowerSteering() 
                + " " + vehicleArray[0].getPurchaseDate() + "\n");
        System.out.print(vehicleArray[1].getvehicle() + " " + vehicleArray[1].getnumberWheels()
                + " " + vehicleArray[1].getEngineSize() + " " + vehicleArray[1].getPowerSteering() 
                + " " + vehicleArray[1].getPurchaseDate() + "\n");
        System.out.println(vehicleArray[2].getvehicle() + " " + vehicleArray[2].getnumberWheels()
                + " " + vehicleArray[2].getEngineSize() + " " + vehicleArray[2].getPowerSteering() 
                + " " + vehicleArray[2].getPurchaseDate() + "\n");
        
        System.out.println("Data from the ArrayList follows:");
        System.out.println("Vehicle Type #-wheels Engine Size Power Steering Purchase Date");
        System.out.println(vehicleArrayList.get(0).getvehicle() + " " + vehicleArrayList.get(0).getnumberWheels()
                + " " + vehicleArrayList.get(0).getEngineSize() + " " + vehicleArrayList.get(0).getPowerSteering() 
                + " " + vehicleArrayList.get(0).getPurchaseDate());
         System.out.println(vehicleArrayList.get(1).getvehicle() + " " + vehicleArrayList.get(1).getnumberWheels()
                + " " + vehicleArrayList.get(1).getEngineSize() + " " + vehicleArrayList.get(1).getPowerSteering() 
                + " " + vehicleArrayList.get(1).getPurchaseDate());
          System.out.println(vehicleArrayList.get(2).getvehicle() + " " + vehicleArrayList.get(2).getnumberWheels()
                + " " + vehicleArrayList.get(2).getEngineSize() + " " + vehicleArrayList.get(2).getPowerSteering() 
                + " " + vehicleArrayList.get(2).getPurchaseDate());


    }
    
}
