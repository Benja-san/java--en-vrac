package src.threads;

public class TakeShowerThread extends Thread{
    static{
        System.out.println("Going to shower");
    }

    public void run()
    {
        for(int i = 0; i < 5; i++){
            System.out.println("Shower in process");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Shower is taken");
    }
}
