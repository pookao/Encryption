/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pookao
 */
public class SubCipher {

    
    public static void main(String[] args) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] key = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
   
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Plain Text : ");
        String plainText = Keyboard.nextLine();
        
        char[] encrypt = new char[plainText.length()];
        char[] decrypt = new char[plainText.length()];
        int n=0, aa=0;
        
        while(aa < plainText.length()){
        //for (int a=0; a < plainText.length(); a++) {
            
            //for (int i=0; i < alphabet.length; i++) {
               
                if( alphabet[n] == plainText.charAt(aa) ){
                   encrypt[aa] = key[n];
                   aa++;
                   n = 0;
                   //System.out.println(encrypt[i]);
                }
                else{n++;}
                //if(aa == plainText.length()) break;
            //}
        //}
        }
        for (int a = 0; a < encrypt.length; a++) {
            
            for (int i = 0; i < key.length; i++) {
                
               if( key[i] == encrypt[a] ){
                   decrypt[a] = alphabet[i];
                   //System.out.println(decrypt[i]);
               }
            }
        }
        System.out.print("Encryption: ");
        System.out.println(encrypt);
        System.out.print("Descryption: ");
        System.out.println(decrypt);
    }
    
}
