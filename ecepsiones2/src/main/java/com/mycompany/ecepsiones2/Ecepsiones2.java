
package com.mycompany.ecepsiones2;
import java.util.Scanner;

public class Ecepsiones2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        Even even = new Even();
        try{
                even.isEven(number);
                }
        catch(Exception e){
            System.out.println("Ha ocurrido un error en " + e.getMessage());
        }
        
        String word = "Hello";
        
        for(int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
