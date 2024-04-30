package Singleton;
public class Singleton {
    private static Singleton uniqueInstance;
    // other useful instance variables here
    private Singleton() {}
    public static Singleton getInstance() {
    if (uniqueInstance == null) {
    uniqueInstance = new Singleton();
    } else{
        System.out.println("Singleton already exists");
    }
    return uniqueInstance;
    }
    public static void main(String[] args){
        Singleton uniqueInstance = Singleton.getInstance();
        Singleton uniqueInstance2 = Singleton.getInstance();
    System.out.println("Singleton: " + uniqueInstance);
    System.out.println("Singleton: " + uniqueInstance2);
    }
}
