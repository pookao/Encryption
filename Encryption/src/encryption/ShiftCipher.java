/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Arrays;

public class ShiftCipher {

    public static void main(String[] args) {
        char[] plainText = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
'w', 'x', 'y', 'z'};
        
        int shiftKey = 5;
        char[] pt = {'l', 'o', 'v', 'e'};
        char[] encrypt = new char[26];
        char[] decrypt = new char[26];
        
        // Encryption Loop
        for(int i=0; i<26; i++){
            if(i < shiftKey){
                encrypt[i] = plainText[(26-shiftKey)+i];
            }
            else{
                encrypt[i] = plainText[i-shiftKey];
            }
        }
        
        // Decryption Loop
        for(int i=0; i<26; i++){
            if(i < 26-shiftKey){
                decrypt[i] = encrypt[shiftKey+i];
            }
            else{
                decrypt[i] = encrypt[i-(26-shiftKey)];
            }
        }
        System.out.println(plainText);
        System.out.println("Key : "+shiftKey);
        System.out.println("Encryption : ");
        System.out.println(Arrays.toString(encrypt));
        System.out.println("Decryption : ");
        System.out.println(Arrays.toString(decrypt));
    }
    
}
