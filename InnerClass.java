import src.innerClasses.AClass;

public class InnerClass {
    public static void main(String args[]){

        //Inner class demo
        //inner class
        //Works only if non abstract class
        AClass aClass = new AClass();
        AClass.BClass bClass = aClass.new BClass();
        bClass.config();
        //Inner anonymoius class
        AClass cClass = new AClass(){
            public void show()
            {
                System.out.println("I am the new A class! from cClass object");
            }
        };
        cClass.show();

        AClass dClass = cClass;
        dClass.show();
    }
}