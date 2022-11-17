import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class A9 {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("sort.in"));   //data file input

        //Scanner file = new Scanner(System.in);    //keyboard input
        int t = file.nextInt();
        file.nextLine();
        for(int i = 1; i <= t; i++)
        {
            out.println("Data Set #" + i);
            int w = file.nextInt();
            file.nextLine();
            List<weird> arr = new ArrayList<>();
            while(w-->0)
            {
                weird s = new weird(file.nextLine());
                arr.add(s);
            }
            Collections.sort(arr);
            for(weird weir : arr)
            {
                String ret = new StringBuffer(weir.s).reverse().toString();
                out.println(ret);
            }
        }
    }
}
class weird implements Comparable
{
    String s;
    public weird (String n)
    {
        s = new StringBuffer(n).reverse().toString();
    }
    public int compareTo(Object o) {
        return  s.compareToIgnoreCase(((weird)o).s);
    }
}