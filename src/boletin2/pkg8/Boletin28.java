/* celsius 2 F&K*/
package boletin2.pkg8;

import java.util.Scanner;

/**
 *
 * @author aferreiradominguez
 */
public class Boletin28 {

    public static void main(String[] args) {
        float c , k , f ;
        System.out.println("ºC=");
        Scanner dato=new Scanner(System.in);
        c=dato.nextFloat();
        k=c+273;
        f=((c*9)/5)+32;
        System.out.println("K="+k+"ºF="+f);
        
        
        
    }
    
}
