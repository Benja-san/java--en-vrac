package src.threads;

public class MakeCoffeeThread extends Thread{
    static{
        System.out.println("Launch coffee");
    }
    
    public void run()
    {
        for(int i = 0; i < 5; i++){
            System.out.println("Coffee in process");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Coffee is ready");
    }
}
