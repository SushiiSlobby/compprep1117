import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class A2 {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("dinner.in"));   //data file input
        int t = file.nextInt();
        while(t --> 0)
        {
            int dogs = file.nextInt();
            int rabbits = file.nextInt();
            int carrots = file.nextInt();
            int days = file.nextInt();
            while (days --> 0)
            {
                int r = 0;
                while(r < rabbits)
                {
                    if(carrots - 3 >= 0)
                    {
                        r++;
                        carrots -= 3;
                    }
                    else { carrots = 0; break;}
                }
                rabbits = r;
                int d = 0;
                while(d < dogs)
                {
                   if(rabbits - 2 >= 0)
                   {
                       d++;
                       rabbits -=2;
                   }
                   else { rabbits = 0; break;}
                }
                dogs = d;
            }
            out.printf("%d %d %d\n",dogs,rabbits,carrots);
        }
    }
}