/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftCipher_Optimized {

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
        
        int i=0, j=0;
        // Encryption Loop
        while(i < plainText.length()){
               
            if( alphabet[j] == plainText.charAt(i) ){
                encrypt[i] = cipherText[j];
                i++;
                j = 0;
            }
            else{
                j++;
            }
        }
        
        //Decryption Loop
        i=0; j=0;
        while(i < encrypt.length){
               
            if( cipherText[j] == encrypt[i] ){
                decrypt[i] = alphabet[j];
                i++;
                j = 0;
            }
            else{
                j++;
            }
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
