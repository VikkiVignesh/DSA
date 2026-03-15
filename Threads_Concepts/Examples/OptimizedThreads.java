package Threads_Concepts.Examples;

public class OptimizedThreads {
    
    public static void main(String[] args) throws InterruptedException {
        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi"+Thread.currentThread().getName()+" ->"+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello"+Thread.currentThread().getName()+" ->"+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread thead3=new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Welcome"+Thread.currentThread().getName()+" ->"+Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        },"WelcomeThread");

        Thread thread1 = new Thread(task1,"HiThread");
        Thread thread2 = new Thread(task2,"HelloThread");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thead3.setPriority(Thread.MAX_PRIORITY);

        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
        System.out.println(thead3.getPriority());

        thread1.start();
          thread1.join();
        thread2.start();
        thead3.start();

      
        thread2.join();
        thead3.join();
        
        System.out.println("Threads have been started.");
    }
}
