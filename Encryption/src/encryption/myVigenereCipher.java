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
public class myVigenereCipher {

    static String encrypt(String text, String key) {
        String enc = "";
        text = text.toUpperCase();
        key = key.toUpperCase();
        
        for (int i=0, j=0; i < text.length(); i++) {
            
            enc += (char)(  (text.charAt(i) + key.charAt(j)) % 26 + 65 );
            
            j = ++j % key.length(); // Block Control
        }
        return enc.toLowerCase();
    }
 
    static String decrypt(String text, String key) {
        String dec = "";
        text = text.toUpperCase();
        key = key.toUpperCase();
        
        for (int i=0, j=0; i < text.length(); i++) {
            
            dec += (char)(  (text.charAt(i) - key.charAt(j) + 26) % 26 + 65   );
            
            j = ++j % key.length(); // Block Control
        }
        return dec.toLowerCase();
    }
    public static void main(String[] args) {
        //String key = "INT4101";
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Block Key : ");
        String key = Keyboard.nextLine();
        System.out.print("Plain Text : ");
        String pt = Keyboard.nextLine();
        //String pt = "Security";
        System.out.println("Key: "+ key);
        
        // Encryption
        String ct = encrypt(pt, key);
        System.out.println("Cipher: "+ ct);
        
        // Decryption
        String ms = decrypt(ct, key);
        System.out.println("Massage: "+ ms);
    }
    
}
