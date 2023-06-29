import src.functionalInterface.YoBitch;

public class Lambda {
    public static void main(String args[]){

        YoBitch yoBitch = name -> "Yo " + name +" Bitch!";
        System.out.println(yoBitch.show("dirty"));
    }
}
