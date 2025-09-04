package Heaps;

import java.util.ArrayList;

public class Heap1 {

    static class heapDS
    {
        ArrayList<Integer> list=new ArrayList<>();

        public void add(int x)
        {
            //add at last by default
            list.add(x);

            //Calculate the correct position to place the element in the list

            int curr=list.size()-1;
            int parr=(curr-1)/2;

            while (list.get(curr) <list.get(parr)) {
                int temp=list.get(curr);
                list.set(curr, list.get(parr));
                list.set(parr, temp);

                curr=parr;
                parr=(curr-1)/2;
            }
        }

        public int peek() {
            if (list.isEmpty()) return -1;
            return list.get(0);
        }

        public void printHeap() {
            System.out.println(list);
        }

        private void heapify(int i)
        {
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;

            if(left <list.size() && list.get(i)>list.get(left))
            {
                minIdx=left;
            }
            if(right<list.size() && list.get(i)>list.get(right))
            {
                minIdx=right;
            }

            if(minIdx!=i)
            {
                int temp=list.get(i);
                list.set(i, list.get(minIdx));
                list.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove()
        {
            int data=0;
            int temp=list.get(0);
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1, temp);

            data=list.removeLast();

            heapify(0);
            return data;
        }
    }
    public static void main(String[] args) {
        heapDS h = new heapDS();
        h.add(50);
        h.add(20);
        h.add(30);
        h.add(10);
        h.add(60);

        h.printHeap();   // should be in min-heap order internally
        h.remove();
        h.printHeap();
        System.out.println("Min element: " + h.peek());
    }
}
