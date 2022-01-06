/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs11800lab3ed;

import java.util.Scanner;

/**
 *
 * @author Patrick Mujambere
 */
public class CS11800Lab3ed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ask user for income
        Scanner input = new Scanner (System.in);
        
        
        double taxOwened = 0.0, income = 0.0;
       
      
        System.out.print("Please enter the taxable income in dollars: ");
        
        income = input.nextDouble();
      
        
          if (income <= 9700){
            taxOwened = income * 0.1; 
        }
        else if (income <= 39475){
            taxOwened = (9700 * 0.1) + ((income - 9700) * 0.12);
        }
        else if (income <= 84200){
            taxOwened = (9700 * 0.1) + ((39475 - 9700) * 0.12) + 
            ((income - 39475) * 0.22);
        }
        else if (income <= 160725){
            taxOwened = (9700 * 0.1) + ((39475 - 9700) * 0.12) + 
            ((84200 - 39475) * 0.22) + ((income - 84200)* 0.24);
        }
        else if (income <= 204100) {
            taxOwened = (9700 * 0.1) + ((39475 - 9700) * 0.12) + 
            ((84200 - 39475) * 0.22) + (160725 - 84200)* 0.24 + 
            ((income - 160725) * 0.32);
        }
         else if (income <= 510300) {
            taxOwened = (9700 * 0.1) + ((39475 - 9700) * 0.12) + 
            ((84200 - 39475) * 0.22) + ((160725 - 84200)* 0.24) + 
            (( 24100 - 160725) * 0.32) + ((income - 204100) * 0.35);
        } 
         else if (income <= 510301){
            taxOwened = (9700 * 0.1) + ((39475 - 9700) * 0.12) + 
            ((84200 - 39475) * 0.22) + ((160725 - 84200)* 0.24) + 
            (( 24100 - 160725) * 0.32) + ((510300 - 204100) * 0.35) +
            ((income - 510300) * 0.37);
        }
        
          double taxRate = income + taxOwened;
          double effective = taxOwened/income;
         System.out.println("The tax on " + income + " is " + taxOwened + 
         " and your tax rate should be \n" + taxRate + " Effective paid "
                 + "tax rate is " + effective);
        
       
    }
    
}
