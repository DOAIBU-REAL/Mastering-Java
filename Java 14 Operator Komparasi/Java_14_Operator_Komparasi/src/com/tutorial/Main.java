
package com.tutorial;


public class Main {

    
    public static void main(String args[]) {
        // operator komparasi ini akan menghasillkan nilai dalam bentuk boolean
        
        
        
        int a,b;
        boolean hasilKomparasi;
        
        //Opeerator Equal Atau persamaan 
        System.out.println("=====PERSAMAAN=====");
        a = 10 ;
        b = 10 ;
        hasilKomparasi = (a == b);
        System.out.printf("%d apakah sama dengan %d ? %s \n",a,b,hasilKomparasi );
        
        a = 10 ;
        b = 20 ;
        hasilKomparasi = (a == b);
        System.out.printf("%d apakah sama dengan %d ? %s \n",a,b,hasilKomparasi );
        
        float c,d;
        boolean hasilKomparasicd;
        c = 10 ;
        d = 20 ;
        hasilKomparasicd = (c == d);
        System.out.printf("%f apakah sama dengan %f ? %s \n",c,d,hasilKomparasicd );
        
        
        //OPERATOR TIDAK EQUAL ATAU PERSAMAAN
        System.out.println("=====TIDAK PERSAMAAN=====");
        a = 10 ;
        b = 10 ;
        hasilKomparasi = (a != b);
        System.out.printf("%d apakah berbeda dengan %d ? %s \n",a,b,hasilKomparasi );
        
        a = 10 ;
        b = 20 ;
        hasilKomparasi = (a != b);
        System.out.printf("%d apakah berbeda dengan %d ? %s \n",a,b,hasilKomparasi );
        
        
        //OPERATOR less than atau kurang dari
        System.out.println("=====KURANG DARI=====");
        a = 10 ;
        b = 10 ;
        hasilKomparasi = (a < b);
        System.out.printf("%d apakah kurangdari dengan %d ? %s \n",a,b,hasilKomparasi );
        
        a = 10 ;
        b = 20 ;
        hasilKomparasi = (a < b);
        System.out.printf("%d apakah kurangdari dengan %d ? %s \n",a,b,hasilKomparasi );
        
        //OPERATOR rather than atau kurang dari
        System.out.println("=====LEBIH DARI=====");
        a = 10 ;
        b = 10 ;
        hasilKomparasi = (a > b);
        System.out.printf("%d apakah lebihdari dengan %d ? %s \n",a,b,hasilKomparasi );
        
        a = 20 ;
        b = 10 ;
        hasilKomparasi = (a > b);
        System.out.printf("%d apakah lebihdari dengan %d ? %s \n",a,b,hasilKomparasi );
        
        
        //OPERATOR less than equal atau kurang dari sama dengan
        System.out.println("=====KURANG DARI SAMA DENGAN=====");
        a = 10 ;
        b = 10 ;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ? %s \n",a,b,hasilKomparasi );
        
        a = 10 ;
        b = 20 ;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d ? %s \n",a,b,hasilKomparasi );
        
        //OPERATOR rather than equal atau kurang dari sama dengan
        System.out.println("=====LEBIH DARI SAMA DENGAN=====");
        a = 10 ;
        b = 10 ;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >=  %d ? %s \n",a,b,hasilKomparasi );
        
        a = 20 ;
        b = 10 ;
        hasilKomparasi = (a >= b);
        System.out.printf("%d  >= %d ? %s \n",a,b,hasilKomparasi );
        
        
    }
}
