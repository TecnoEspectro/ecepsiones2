
package com.mycompany.ecepsiones2;


public class Even {
    public boolean isEven(int number) throws Exception{
    if(number % 2 == 0){   //Modulo
    throw new Exception("No me gustan los numeros pares");
    }
    return false;
    }
}
