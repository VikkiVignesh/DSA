package Queue;

public class UsingArrays {
    static class QueueA
    {
      int arr[];
      int size;
      int rear;

      QueueA(int z)
      {
        arr=new int[z];
        size=z;
        rear=-1;
      }

      public boolean isEmpty()
      {
        return rear==-1;
      }

      public boolean isFull()
      {
        return rear == size-1;
      }

      public void add(int data)
      {
         if(isFull())
         {
            System.out.println("Queue is Full...");
            return;
         }
         rear++;
         arr[rear]=data;
      }

      public int remove()
      {
        if(isEmpty())
        {
            System.out.println("Queue is Empty....");
            return -1;
        }
        int frnt=arr[0];

        for (int i=0;i<rear;i++) {
            arr[i]=arr[i+1];
        }
        rear--;
        return frnt;
      }

      public int peek()
      {
        if(isEmpty())
        {
            return -1;
        }
        return arr[0];
      }
    }

    public static void main(String[] args) {
        QueueA q =new QueueA(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
