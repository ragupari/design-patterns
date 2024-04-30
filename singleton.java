public class Singleton {
    private static Singleton uniqueInstance;
    // other useful instance variables here
    private Singleton() {}
    public static Singleton getInstance() {
    if (uniqueInstance == null) {
    uniqueInstance = new Singleton();
    }
    return uniqueInstance;
    }
    public static void main(String[] args){
        Singleton uniqueInstance = Singleton.getInstance();
    System.out.println("Singleton: " + uniqueInstance);
    }
}
