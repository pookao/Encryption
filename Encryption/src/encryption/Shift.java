/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Arrays;

/**
 *
 * @author Pookao
 */
public class Shift {
    String cipher(String msg, int shift){
    String str = "";
    int len = msg.length();
    
    for(int x = 0; x < len; x++){
        char c = (char)(msg.charAt(x) + shift);
        if (c > 'z')
            str += (char)(msg.charAt(x) - (26-shift));
        else
            str += (char)(msg.charAt(x) + shift);
    }
    return str;
}
    public static void main(String[] args) {
        char[] plainText = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
'w', 'x', 'y', 'z'};
        
        int key = 5;
        char[] encrypt = new char[26];
        char[] decrypt = new char[26];
        char[] head = new char[key];
        char[] rear = new char[26-key];
        
        for(int i=0; i<26; i++){
            if(i<key){
                head[i] = plainText[(26-key)+i];
            }
            else{
                rear[i-key] = plainText[i-key];
            }
        }
        
        System.out.print(Arrays.toString(head));
        System.out.println(Arrays.toString(rear));
    }
    
}
