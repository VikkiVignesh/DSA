package Queue;

public class UsingCircularArray {
     static class QueueB
    {
      int arr[];
      int size;
      int rear;
      int frnt;

      QueueB(int z)
      {
        arr=new int[z];
        size=z;
        rear=-1;
        frnt=-1;
      }

      public boolean isEmpty()
      {
        return rear==-1 && frnt==-1;
      }

      public boolean isFull()
      {
        return (rear+1)%size == frnt;
      }

      public void add(int data)
      {
         if(isFull())
         {
            System.out.println("Queue is Full...");
            return;
         }
         if(frnt==-1)
         {
            frnt=0;
         }
         rear=(rear+1)%size;
         arr[rear]=data;
      }

      public int remove()
      {
        if(isEmpty())
        {
            System.out.println("Queue is Empty....");
            return -1;
        }
        int res=arr[frnt];
        if(rear==frnt)
        {
            rear=frnt=-1;
        }
        else
        {
            frnt=(frnt+1)%size;
        }
        return res;
      }

      public int peek()
      {
        if(isEmpty())
        {
            return -1;
        }
        return arr[frnt];
      }
    }

    public static void main(String[] args) {
        QueueB q=new QueueB(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(10);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
