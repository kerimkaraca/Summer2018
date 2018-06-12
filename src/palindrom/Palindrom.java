/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrom;

import java.util.Scanner;
    public class Palindrom {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Kelime giriniz :");
        String a=input.nextLine();
        int i;
       String ters="";
        
        for ( i = a.length()-1; i >=0; i--) {  
             System.out.print(a.charAt(i));
            ters=ters+a.charAt(i);
            }
    if(a.equals(ters))
         System.out.println(" "+true);
    else System.out.println(" "+false);
            
    }
        }
