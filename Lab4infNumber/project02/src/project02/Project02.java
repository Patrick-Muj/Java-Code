/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02;

/**
 *
 * @author Patrick Mujambere
 */
public class Project02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
                   int [] Array = new int[8];
        int[] myList= {-3, -1, 5, 10, 3, 17, 2};
        int max =0;
        int x=0;
        Array[x]=0;
        int index =0;
        
        // System.out.print(Array[x]);
       // int p : myList;
        System.out.print("[");
        for (int p : myList) {
            
         System.out.print(  + x + ":" + p + ","); 
         x++;
            

        }
        System.out.println("]");

        

        for (int i =0; i < myList.length; i++) {
            if (myList [i] > max) {
                max = myList[i];
                index = i;
            
            
            }
              
        }
             
          System.out.println("Maximum Value " + max +" found at index " + index);
          
          System.out.println("My new array is:");
          
         // for (int i = 0; i < myList.length; i++){
         //    System.out.printf("Index: %d\tValue: %d\n", i, myList[i]);
       // }  

            }
   
        
    
    
}
