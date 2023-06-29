package src.throwsMethods;

public class UselessClass {
    public void uselessMethod() throws ClassNotFoundException
    {
        Class.forName("UnexistingClass");
    }
}
