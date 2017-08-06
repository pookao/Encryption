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
public class NewMain {
    private static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
'w', 'x', 'y', 'z'};

    public static char[] shiftAlphabet(int shift){
        char[] newAlpha = new char[26];
        for (int i = 0; i < 26; i++)
        {
            if(((i + shift) < 26) && ((i + shift) >= 0))
            {
                newAlpha[i]  = alphabet[i + shift];
            }
            else if ((i + shift) >= 26)
            {
                newAlpha[i] = alphabet[i + shift - 26];
            }
        }
        return newAlpha;
    }
    public static String encrypt(String s, int shift){
        String e = "";
        for(int i = 0; i < s.length(); i++)
        {
            char letter = s.charAt(i);
            if (letter != ' ')
            {
                int f = find(alphabet, letter);
                if(((f + shift) < 26) && ((f + shift) >= 0))
                {
                    letter  = alphabet[f + shift];
                }
                else if ((f + shift) >= 26)
                {
                    letter = alphabet[f + shift - 26];
                }
                e = e + String.valueOf(letter);
            }
            else 
            {
                e = e + " ";
            }
        }
        return e;
    }
    public static int find(char[] c, char c2){
        int w = 0;
        for(int i = 0; i < c.length; i++)
        {
            if(c[i] == (c2))
                w = i;
        }
        return w;
    }
    public static void main(String[] args) {
        char[] pt = new char[26];
        String encryp = "";
        pt = shiftAlphabet(5);
        encryp = encrypt(pt.toString(), 5);
        System.out.println(pt+"  "+encryp);
    }
}
