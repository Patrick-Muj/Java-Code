/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5cs1180methtrvssqu;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author Patrick Mujambere
 */
public class Lab5CS1180MethtrvsSqu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int height;
        String shape, letter;
        String another = "yes";
        Scanner input = new Scanner(System.in);
        
        while(another.equals("yes")) {
            System.out.println("Enter the Figure type (Triangle or Square)");
            shape = input.next().toLowerCase();
            while(!shape.equals("square") && !shape.equals("triangle")){
                System.out.println("Input error.  Try again. \nEnter the Fugure type (Triangle or Square)");
                shape = input.next().toLowerCase();                
            }
            System.out.print("what is the character to be used to draw: ");
            letter = input.next();
            System.out.print("Enter the base and height of "+ shape);
            height = input.nextInt();
         
            if(shape.equals("square")){
                printSquare(letter, height);
            }
            else if(shape.equals("triangle")){
                printTriangle(letter, height);
            }
        System.out.println("Enter yes to print another figure");
        another = input.next();
        
        }
              
              
    }
    public static void printTriangle(String letter, int height) {            
        for (int i=1; i<=height;i++){
            for (int j = 1; j<=i;j++) {
                System.out.print(letter);
            }
            System.out.println();
        }
        
                }    
    public static void printSquare(String letter, int height) {
        for (int i=1; i<=height;i++){
            for (int j = 1; j<=height;j++) {
                
                System.out.print(letter);
            }
                System.out.println();
        
            }
        
    }
    }
    
