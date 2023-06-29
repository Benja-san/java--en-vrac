public class HelloWorld {
    
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
        int currentHour = Integer.parseInt(args[i]);
        if(currentHour >= 6 && currentHour <= 20) {
            System.out.println("Hello World!");
        }
        else{
            System.out.println("Good Night World");
        }
        }
    }

}
