/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7cs11800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Patrick Mujambere
 */
public class Lab7CS11800 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner list = new Scanner(System.in);
      System.out.println("Enter the size of the array :: ");
      int size = list.nextInt();
      String myArray[] = new String[size];
      System.out.println("Enter elements of the array : ");
      for(int i=0; i<size; i++) {
         myArray[i] = list.next();
      }
      System.out.println(Arrays.toString(myArray));
      ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
      System.out.println("Enter the element that is to be added:");
      String element = list.next();
      myList.add(element);
      myArray = myList.toArray(myArray);
      System.out.println(Arrays.toString(myArray));
    }
    
}
