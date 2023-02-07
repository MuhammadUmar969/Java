/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weird;

import java.util.Scanner;

/**
 *
 * @author Umar Aziz
 */
public class Weird {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n % 2 != 0 ){
            System.out.println("Weird");
        }
        else if(n % 2 == 0  && n>2 && n<=5){
            System.out.println("Not Weird");
        }
        else if (n % 2 == 0 && n>= 6 && n<=20){
            System.out.println("Weird");
        }
        else if(n % 2 == 0 || n>20){
            System.out.println("Not Weird");
        }
    }
    
}
