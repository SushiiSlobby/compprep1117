import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class A11 {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("vowel.in"));   //data file input

        //Scanner file = new Scanner(System.in);    //keyboard input
        int t = file.nextInt();
        file.nextLine();
        while(t-->0)
        {
            String s = file.nextLine();
            out.println(s.substring(0,1).matches("[aeiouAEIOU]") ? "The word '" + s + "' begins with a vowel." : "The word '" + s + "' begins with a consonant.");
        }
    }
}