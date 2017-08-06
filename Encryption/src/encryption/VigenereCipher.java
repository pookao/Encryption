/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

/**
 *
 * @author Pookao
 */
public class VigenereCipher {

    static String encrypt(String text, final String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            
            res += (char)((c + key.charAt(j) - (2 * 'A')) % 26 + 'A');
            //System.out.println((int)((c + key.charAt(j) - 2 * 'A')% 26 ));
            //System.out.println((int)('a'));
            j = ++j % key.length();
        }
        return res;
    }
 
    static String decrypt(String text, final String key) {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            
            res += (char)((c - key.charAt(j) + 26) % 26 + 'A');
            System.out.println((int)((c - key.charAt(j)  ) % 26 ));
            j = ++j % key.length();
        }
        return res;
    }
    public static void main(String[] args) {
        String key = "ALLTECH";
        String ori = "texttocipher";
        String enc = encrypt(ori, key);
        System.out.println(enc);
        System.out.println(decrypt(enc, key));
    }
    
}
