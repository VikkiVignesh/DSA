package Heaps;

import java.util.PriorityQueue;

public class WeakestSoldier {

    static class soldiers implements Comparable<soldiers>
    {
        int cnt;
        int indx;

        public soldiers(int cnt,int idx)
        {
            this.cnt=cnt;
            this.indx=idx;
        }

        @Override
        public int compareTo(soldiers s2)
        {
            if(Integer.compare(this.cnt, s2.cnt)==0)
            {
                return Integer.compare(this.indx, s2.indx);
            }
            else
            {
                return Integer.compare(this.cnt,s2.cnt);
            }
        }


    }
    public static void main(String[] args) {
        int army[][]={
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };


        PriorityQueue<soldiers> pq=new PriorityQueue<>();

        for(int i=0;i<army.length;i++)
        {
            int cnt=0;
            for(int j=0;j<army.length;j++)
            {
                cnt+=army[i][j] == 1?1:0;
            }
            pq.add(new soldiers(cnt, i));
        }


        int k=2;

        while (k!=0) {
            System.out.println("Row - "+pq.poll().indx);

            k--;
        }

    }
}
