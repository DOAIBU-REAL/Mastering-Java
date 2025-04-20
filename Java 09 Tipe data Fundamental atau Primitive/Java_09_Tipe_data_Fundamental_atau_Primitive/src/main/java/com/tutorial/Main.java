
package com.tutorial;


public class Main {
    public static void main(String[]args){
        
        // tipe data di java :
        // integer, byte , short , long, double, float, char, boolean
        
        //integer (satuan)
        int i = 2147483647;
        System.out.println("=====INTEGER=====");
        System.out.println("nilai max integer = " + Integer.MAX_VALUE);
        System.out.println("nilai min integer = " + Integer.MIN_VALUE);
        System.out.println("nilai i = " + (i + 1));// apakah error jika melebihi nilai max?
        // ternyata jika nilai integer melebihi max akan kembali ke nilai min 
        // jadi bahaya sekali apabila tak mengetahui batasan nilai tipe integer
        System.out.println("Besar Integer = " + Integer.BYTES + " bytes");
        System.out.println("Besar Integer = " + Integer.SIZE + " bit");
        // mengapa hasilnya menjadi 32 bit?
        // 1 bytes = 8 bit
        // 4 bytes = 32 bit
        
        //byte (satuan)
        byte b = 10;
        System.out.println("=====BYTES=====");
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + " bytes");
        System.out.println("Besar byte = " + Byte.SIZE + " bit");
        
        
        //short (satuan)
        short s = 10;
        System.out.println("=====SHORT=====");
        System.out.println("nilai max short = " + Short.MAX_VALUE);
        System.out.println("nilai min short = " + Short.MIN_VALUE);
        System.out.println("Besar short = " + Short.BYTES + " bytes");
        System.out.println("Besar short = " + Short.SIZE + " bit");
        
        //long (satuan)
        long l = 10L;// FUNFACT kamu bisa menambahkan variable dengan huruf l
        // untuk membedakan tipe data long dengan yang lain
        System.out.println("=====LONG=====");
        System.out.println("nilai max long = " + Long.MAX_VALUE);
        System.out.println("nilai min long = " + Long.MIN_VALUE);
        System.out.println("Besar long = " + Long.BYTES + " bytes");
        System.out.println("Besar long = " + Long.SIZE + " bit");
        
        //double (koma, bilangan real)
        double d = 10.5d;
        System.out.println("=====DOUBLE=====");
        System.out.println("nilai max double = " + Double.MAX_VALUE);
        System.out.println("nilai min double = " + Double.MIN_VALUE);
        System.out.println("Besar double = " + Double.BYTES + " bytes");
        System.out.println("Besar double = " + Double.SIZE + " bit");
        
        //float (koma, bilangan real)
        float f = 10.5f;
        System.out.println("=====DOUBLE=====");
        System.out.println("nilai max float = " + Float.MAX_VALUE);
        System.out.println("nilai min float = " + Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES + " bytes");
        System.out.println("Besar float = " + Float.SIZE + " bit");
        
        
        //char (karakter) BERDASARKAN ASCII
        char c = 'c';
        System.out.println("=====CHAR=====");
        System.out.println("nilai max char = " + Character.MAX_VALUE);
        System.out.println("nilai min char = " + Character.MIN_VALUE);
        System.out.println("Besar  char= " + Character.BYTES + " bytes");
        System.out.println("Besar char = " + Character.SIZE + " bit");
        
        // nilai true atau false
        boolean val = true ;
        System.out.println("=====BOOLEAN=====");
        System.out.println("nilai boolean val  = " + val );
        System.out.println("nilai max  = " + Boolean.TRUE);
        System.out.println("nilai min  = " + Boolean.FALSE);
        
        // dapat disimpulkan tipe data ini dikategorikan sebagai
        // tipe data yang primitif karena terbilang "fix"
        
        
        
        
        
        
    }
    
}
