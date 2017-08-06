/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftCipher2 {

    public static void main(String[] args) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Shift Key : ");
        int shiftKey = keyboard.nextInt();
        
        Scanner sk = new Scanner(System.in);
        System.out.print("Plain Text : ");
        String plainText = sk.nextLine();
        
        char[] cipherText = new char[alphabet.length];
        char[] encrypt = new char[plainText.length()];
        char[] decrypt = new char[plainText.length()];
        
        // Create CipherText Loop
        for(int i=0; i < alphabet.length; i++){
            if(i < shiftKey){
                cipherText[i] = alphabet[(alphabet.length-shiftKey)+i];
            }
            else{
                cipherText[i] = alphabet[i-shiftKey];
            }
        }
        
        // Encryption Loop
        for(int a=0; a < plainText.length(); a++){
            for(int i=0; i < alphabet.length; i++){
                
                if( alphabet[i] == plainText.charAt(a) ){
                   encrypt[a] = cipherText[i];
                   //System.out.println(encrypt[a]);
                }
                        
            }
           
            /*if(i < shiftKey){
                encrypt[i] = pt.charAt((pt.length()-shiftKey)+i);
            }
            else{
                encrypt[i] = pt.charAt(i-shiftKey);
            } */
        }
        
        // Decryption Loop
        for(int a=0; a < encrypt.length; a++){
            for(int i=0; i < cipherText.length; i++){
                
                if( cipherText[i] == encrypt[a] ){
                   decrypt[a] = alphabet[i];
                   //System.out.println(decrypt[a]);
               }
            }
        /*for(int i=0; i < encrypt.length; i++){
            
            if(i < encrypt.length-shiftKey){
                decrypt[i] = encrypt[shiftKey+i];
            }
            else{
                decrypt[i] = encrypt[i-(encrypt.length-shiftKey)];
            }*/
        }
        //System.out.print("PlainText : ");
        //System.out.println(plainText);
        System.out.println("Key : "+shiftKey);
        System.out.println("Encryption : ");
        System.out.println(Arrays.toString(encrypt));
        System.out.println("Decryption : ");
        System.out.println(Arrays.toString(decrypt));
    }
    
}
