/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_pythagorean_triples;
import java.util.Scanner;
/**
 *
 * @author Al2a
 */
public class JAVA_Pythagorean_Triples {
    int n;
    String r="";
    
    public JAVA_Pythagorean_Triples(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");
        n = input.nextInt();
        
        for (int a = 1; a < n; a++) {
            int aa = (int) Math.pow(a, 2);
            
            for (int b = a; b < n; b++) {
                int bb = (int) Math.pow(b, 2);
                
                int c = n-(a+b);
                int cc = (int) Math.pow(c, 2);
                
                if(aa+bb==cc){
                    r = a+" et "+b+" et "+c;
                }
            }
        }
        System.out.println("Triplet Found :");
        if(r!=""){
            System.out.println(r);
        }else{
            System.out.println("No such triplet exists");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JAVA_Pythagorean_Triples myObj = new JAVA_Pythagorean_Triples();
    }
    
}
