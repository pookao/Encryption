/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Scanner;

/**
 *
 * @author Pookao
 */
public class SubCipher_Optimized {

    
    public static void main(String[] args) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] key = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
   
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Plain Text : ");
        String plainText = Keyboard.nextLine();
        
        char[] encrypt = new char[plainText.length()];
        char[] decrypt = new char[plainText.length()];
        int i=0, j=0;
        
        // Encryption Loop
        while(i < plainText.length()){
               
            if( alphabet[j] == plainText.charAt(i) ){
                encrypt[i] = key[j];
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
               
            if( key[j] == encrypt[i] ){
                decrypt[i] = alphabet[j];
                i++;
                j = 0;
            }
            else{
                j++;
            }
        }
        
        System.out.print("Encryption: ");
        System.out.println(encrypt);
        System.out.print("Descryption: ");
        System.out.println(decrypt);
    }
    
}
