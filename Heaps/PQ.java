package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

import Heaps.PQ.Student;

public class PQ {

    static class Student implements Comparable<Student>
    {
        int rank;
        String name;

        public Student(int x,String n)
        {
            this.rank=x;
            this.name=n;
        }

        @Override
        public int compareTo(Student s)
        {
           return Integer.compare(this.rank,s.rank);
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);

        pq1.add(10);
        pq1.add(20);
        pq1.add(30);
        pq1.add(40);
        pq1.add(50);


        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
        System.out.println();

        while (!pq1.isEmpty()) {
            System.out.print(pq1.peek()+" ");
            pq1.remove();
        }
        System.out.println();


        PriorityQueue<Student> spq=new PriorityQueue<>();
        spq.add(new Student(10, "Vikki"));
        spq.add(new Student(5, "Vikki"));
        spq.add(new Student(1, "Vikki"));

         while (!spq.isEmpty()) {
            System.out.println(spq.peek().name+" ->"+spq.peek().rank);
            spq.remove();
        }
    }
}
