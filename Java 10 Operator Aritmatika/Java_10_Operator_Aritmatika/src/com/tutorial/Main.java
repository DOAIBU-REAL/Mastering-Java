
package com.tutorial;


public class Main {

    
    public static void main(String args[]) {
        // operasi aritmatika
        int variable1 = 12 ;
        int variable2 = 5 ;
        
        // 1. penjumlahan
        int hasil = variable1 + variable2 ;
        System.out.println( variable1 + "+" + variable2 + " = " + hasil );
        
        
        // 2. [engurangan
        hasil = variable1 - variable2 ;
        System.out.println(variable1 + "-" + variable2 + " = " + hasil );
        
        // 3. perkalian
        hasil = variable1 * variable2 ;
        System.out.println(variable1 + " x " + variable2 + " = " + hasil );
        
        // 4. pembagian
        hasil = variable1 / variable2 ;
        System.out.println(variable1 + ":" + variable2 + " = " + hasil );
        
        float a = 6 ;
        float b = 5 ;
        float hasilfloat = a / b ;
        System.out.println(a + " : " + b + " = " + hasilfloat );
        //5. modulus 
        // modulus adalah sisa hasil pembagian 
        
        hasil = variable1 % variable2 ;
        System.out.println(variable1 + " modulus " + variable2 + " = " + hasil );
    }
}
