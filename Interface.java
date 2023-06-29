import src.classes.Desktop;
import src.classes.Developer;
import src.classes.Laptop;
import src.interfaces.Computer;

public class Interface {
    public static void main(String args[]){
        
        // Interface demo
        Laptop laptop = new Laptop();
        Desktop desktop = new Desktop();
        Developer developer = new Developer();
        developer.devApp(laptop);
        developer.devApp(desktop);
        System.out.println("All devices use a " + Computer.name);
    }
}
