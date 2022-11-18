import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class A7 {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("ship.in"));   //data file input
        int t = file.nextInt();
        file.nextLine();
        while(t-->0)
        {
            String[] mat = new String[10];
            int i = 10;
            while (i-->0)
            {
                mat[i] = file.nextLine();
            }
            int shots = file.nextInt();
            int c = 5;
            int b = 4;
            int d = 3;
            int s = 3;
            int p = 2;
            while (shots --> 0)
            {
                String cord = file.next();
                int x = cord.charAt(0) - 65;
                int y = Integer.parseInt(cord.substring(1));
                String[] ln = mat[x].split("");
                ln[y] = ".";
                mat[x] = String.valueOf(ln);
            }
            file.nextLine();
        }
    }
}