package Heaps;

import java.util.PriorityQueue;

public class KNearestCars {
    static class Carpt implements Comparable<Carpt>
    {
        int x;
        int y;
        int dist;
        String car;

        public Carpt(int i,int j,String s)
        {
            this.x=i;
            this.y=j;
            this.dist=(this.x*this.x)+(this.y*this.y);
            this.car=s;
        }

        @Override
        public int compareTo(Carpt c)
        {
            return Integer.compare(this.dist,c.dist);
        }
        
    }
    public static void main(String[] args) {
        PriorityQueue<Carpt> pq=new PriorityQueue<>();
        int points[][]={{3,3},{5,-1},{-2,4}};

        int k=2;

        for(int i=0;i<points.length;i++)
        {
            int x=points[i][0];
            int y=points[i][1];
            Carpt cp=new Carpt(x,y,"car "+i);
            pq.add(cp);
            
        }

        while (k!=0) {
            System.out.println(pq.peek().car+" -> "+pq.peek().dist);
            pq.remove();
            k--;
        }
        

    }
}
