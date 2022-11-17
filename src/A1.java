import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class A1 {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("count.in"));   //data file input
        file.nextLine();
        String in = "";
        while(file.hasNextLine())
        {
            in += file.nextLine().replaceAll(" ","").toLowerCase();
        }

        Map<String, Integer> map = new TreeMap<>();
        String[] alp = "qazwsxedcrfvtgbyhnujmikolp".split("");
        for(String l : alp)
        {
            map.put(l,0);
        }
        for(int x = 0; x < in.length();x++)
        {
            String c = in.substring(x,x+1);
           map.put(c,map.get(c) + 1);
        }
        for(String key : map.keySet())
        {
            out.println(key + " " + map.get(key));
        }

    }
}