/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07array;



/**
 *
 * @author Patrick Mujambere
 */
public class Lab07Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int [] Array1 = new int[7];
        int[] myList1= {-3, -1, 5, 10, 3, 17, 2};
        int max =0;
        int index =0;
            System.out.print("Printig Array\n[");
           
        for (int i=0; i<=myList1.length-1; i++) {
            
             System.out.print(  + i + ":" + myList1[i]);
             if(i !=myList1.length-1){
                 System.out.print(",");
             }
              

        }
        System.out.println("]");

        for (int i =0; i < myList1.length; i++) {
            if (myList1[i] > max) {
                max = myList1[i];
                index = i;
 
            }
              
        }
       
          System.out.println("Maximum Value " + max +" found at index " + index);
          
          int [] Array2 = new int [6];
          
          int y=0;
        
         for(int i=0; i<myList1.length;i++) {
             if (i!= index  ){
             Array2[y] = myList1[i];
             
             y++;
            
             }

             
         }
         
                     System.out.print("A new array is\n[");
        for (int z =0; z<= Array2.length; z++) {
             System.out.print(  + z +":" + Array2[z]); 
             if (z == Array2.length-1) {
                 break;
             }
              System.out.print(",");
             
        
        }
        System.out.println("]");

           

    }
    
}
