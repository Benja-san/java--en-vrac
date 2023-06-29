import src.enums.*;

public class Enums {
    public static void main(String[] args) {
        
        // Enum demo
        Status status = Status.ACTIVE;
        Status[] allStatus = Status.values();
        for(Status s : allStatus)
        {
            System.out.println(s + " " + s.ordinal());
        }
        switch(status)
        {
            case ACTIVE:
                System.out.println("Connexion active");
                break;
            case INACTIVE:
                System.out.println("Connexion inactive");
                break;
            case SUSPENDED:
                System.out.println("Connexion suspended");
                break;
            case DELETED:
                System.out.println("Connexion deleted");
                break;
            default:
                System.out.println("Connexion status unknown");
                break;
        }
        //Enum smartphone with price
        Smartphones IPhone = Smartphones.IPHONE;
        System.out.println(IPhone + " " + IPhone.getPrice() + " euros");
    }
}
