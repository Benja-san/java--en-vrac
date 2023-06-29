import src.classes.*;
import src.threads.*;

public class ThreadDemo {
    public static void main(String args[]){
        //Thread extending demo
        // Will only work as Thread and not As classes with runnable interfaces
        MakeCoffeeThread makeCoffeeThread = new MakeCoffeeThread();
        TakeShowerThread takeShowerThread = new TakeShowerThread();
        takeShowerThread.setPriority(Thread.MAX_PRIORITY);
        makeCoffeeThread.setPriority(Thread.MIN_PRIORITY);
        System.out.println(takeShowerThread.getPriority());
        makeCoffeeThread.start();
        takeShowerThread.start();
        try {
            MakeCoffeeThread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Runnable implementation demo
        MakeCoffee makeCoffeeRunnable = new MakeCoffee();
        TakeShower takeShowerRunnable = new TakeShower();
        Thread thread1 = new Thread(makeCoffeeRunnable);
        Thread thread2 = new Thread(takeShowerRunnable);
        thread1.start();
        thread2.start();
        //Thread safe Lambda Runnable and Thread instanciating demo
        MoodIndicator moodIndicator = new MoodIndicator();
        Runnable makeCoffee = () -> {
            for(int i = 0; i < 10; i++)
            {
                System.out.println("Making coffee");
                moodIndicator.betterMood();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Coffee is ready");
            }
        };
        Runnable takeShower = () -> {
            for(int i = 0; i < 10; i++)
            {
                System.out.println("Taking shower");
                moodIndicator.betterMood();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Shower is done");
            }
        };
        Thread coffeeThread = new Thread(makeCoffee);
        Thread showerThread = new Thread(takeShower);
        coffeeThread.start();
        showerThread.start();

        try {
            coffeeThread.join();
            showerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mood indicator : " + moodIndicator.getMood());
    }
}
