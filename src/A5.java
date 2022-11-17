import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class A5 {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("maze.in"));   //data file input
        int t = file.nextInt();
        file.nextLine();
        while(t-->0)
        {
            int c = file.nextInt();
            int r = file.nextInt();
            file.nextLine();
            char[][] mat = new char[r][c];
            char[][] copy = new char[r][c];
            int [][] sh = new int[r][c];
            int sr = -1;
            int sc = -1;
            for (int i = 0; i < r; i++)
            {
                String ln = file.nextLine();
                if(ln.indexOf("@") != -1)
                {
                    sr = i;
                    sc = ln.indexOf("@");
                }
                for (int j = 0; j < mat[i].length; j++) {
                    sh[i][j] = Integer.MAX_VALUE;
                }
                mat[i] = ln.toCharArray();
                copy[i] = ln.toCharArray();
            }

            Queue<Integer> q = new LinkedList<>();
            mat[sr][sc] = '0';
            q.add(sr);
            q.add(sc);
            q.add(0);
            int er = -1;
            int ec = -1;
            while(!q.isEmpty())
            {
                int x = q.remove();
                int y = q.remove();
                int cnt = q.remove();
                if(x >= 0 && x < mat.length && y >= 0 && y < mat[x].length && mat[x][y] != '#')
                {

                   if(mat[x][y] == '@')
                   {
                       sh[x][y] = cnt+1;
                       er = x;
                       ec = y;
//                       break;
                   }

                   mat[x][y] = '#';
                   sh[x][y] =cnt+1;
                   q.add(x+1);q.add(y);q.add(cnt+1);
                   q.add(x-1);q.add(y);q.add(cnt+1);
                   q.add(x);q.add(y+1);q.add(cnt+1);
                   q.add(x);q.add(y-1);q.add(cnt+1);
                }
            }

            q.clear();
            q.add(er);
            q.add(ec);
            q.add(sh[er][ec]);

            while(!q.isEmpty())
            {
                int x = q.remove();
                int y = q.remove();
                int cnt = q.remove();
                if(x >= 0 && x < mat.length && y >= 0 && y < mat[x].length && sh[x][y] <= cnt)
                {
                    if(sh[x][y] == 1)
                    {
                        break;
                    }
                    copy[x][y] = '@';
                    q.add(x+1);q.add(y);q.add(cnt-1);
                    q.add(x-1);q.add(y);q.add(cnt-1);
                    q.add(x);q.add(y+1);q.add(cnt-1);
                    q.add(x);q.add(y-1);q.add(cnt-1);
                }
            }
            for (int i = 0; i < mat.length; i++) {
                out.println(String.valueOf(copy[i]));
            }
        }
    }
}