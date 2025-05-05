
package com.tutorial;


public class Main {

    
    public static void main(String args[]) {
        // program untuk konversi data dari tipe data ke tipe data lain
        
        int nilaiInt= 450 ; // %32bit 
        System.out.println( " nilaiInt = " + nilaiInt );
        
        // Memperluas rentang ke tipe dataa yang lebih besar
        
        long nilaiLong = nilaiInt ;
        System.out.println( " nilaLong = " + nilaiLong );
        
        // memperkecil rentang data ke tipe data yang lebih kecil 
        byte nilaiByte = (byte)nilaiInt ;
        System.out.println( " nilaByte = " + nilaiByte );
        System.out.println( "nilai max byte = " + Byte.MAX_VALUE);
        // jadi jika tipe data yang diinputkan melebihi max valau nilai rentang 
        // tipe data yang lebih kecil akan menjadi minus, jadi ingat rentang
        // tipe data untuk memahamai asal nilai saat mengonversi
        
        // casting pembagian
        
        float  a = 10;
        int b = 4 ;
        
        float c = (a/b);
        System.out.println(a + " : " + b + " = " + c);
        
        int x = 10 ;
        int y = 4 ;
        
        float z = (float) x/y ;
        System.out.println( x + " : " + y + " = " + z );
        // konversi kali ini hanya untuk angka numeric saja
    }
}
