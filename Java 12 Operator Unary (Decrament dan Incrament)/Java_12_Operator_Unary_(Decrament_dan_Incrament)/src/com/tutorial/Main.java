
package com.tutorial;


public class Main {


    public static void main(String args[]) {
        // Unary = operasi yang dilakukan pada satu variable
        int angka = 1 ;
        System.out.println( -angka );
        System.out.println( +angka );
        System.out.println ( " unary ' + ' , " + angka + " menjadi " + +angka);
        System.out.println ( " unary ' - ' , " + angka + " menjadi " + -angka);
        
        
        // Unary decrament and incrament 
        
        int angka2 = 10;
        angka2 ++;
        System.out.println ( "nilai angka2 unary dengan ' ++ ' menjadi = " + angka2 );
        
         int angka3 = 10;
        angka3 --;
        System.out.println ( "nilai angka3 unary dengan ' -- ' menjadi = " + angka3 );
        
        int a = 5;
        System.out.println ( "nilai a unary dengan ' ++ ' menjadi = " + (++a) );
        // hasil nilai a menjadi 6 karena perintah unery '++' di awal nilai akan  
        // dieksekusi menjadi bertambah
        int b = 5;
        System.out.println ( "nilai b unary dengan ' ++ ' menjadi = " + (b++) );
        // namun disini nilai b tetap sama karena perintah unery '++'
        // dibelakang nilai, maka peintah unery akan berlaku apabila perintah 
        // sout menemukan nilai baru yang akan ditampilkan seperti ini
        System.out.println ( "nilai b unary dengan ' ++ ' menjadi = " + (b) );
        // hasil b menjadi enam bertambah satu karena ada perintah unery 
        // dibaris sout sebelumnya
        
        // unery boolean dengan ! untuk nagasi
        
        boolean ucup = true ;
        System.out.println("nilai boolean  = " + ucup );
        System.out.println("nilai boolean  = " + !ucup );
        
    }
}
