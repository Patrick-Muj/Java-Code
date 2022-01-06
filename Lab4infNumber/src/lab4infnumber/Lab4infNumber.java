/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4infnumber;

import java.util.Scanner;

/**
 *
 * @author Patrick Mujambere
 */
public class Lab4infNumber {

    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
        // TODO code application logic here

     static double sum(double s) 
    { 
      double i, sum = 0.0; 
      
      for (i = 1; i <= s; i++) 
          sum = sum + 1/i; 
 
      return sum; 
    } 
  
    public static void main(String args[]) 
    { 
        double n =0.0; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        n = input.nextDouble();
        
        System.out.printf("Sum is %f", sum(n)); 
          
    } 
} 
  
