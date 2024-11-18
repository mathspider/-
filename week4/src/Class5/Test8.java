package Class5;

import java.util.ArrayList;
import java.util.Arrays;

public class Test8 {
        public static void main(String[] args){
            int[] d={2,5,6,5,4,3,23,43,2,0,2,2,2,2,2};
            final int N=100;
            calNumCount(d, N);
        }
        static void calNumCount(int[] d, final int N)
        {
            final int Mn=N+1;
            int[] nt=new int[Mn];
            int n=d.length;
            for(int i=0;i<n;++i)
            {
                if(d[i]>=1 && d[i]<=N)
                    nt[d[i]]++;
            }
            for(int i=1;i<=N;++i)
                if(nt[i]>0)
                    System.out.printf("%-4d%d次\n", i, nt[i]);
        }
    }
