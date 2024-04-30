package Singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
        ChocolateBoiler uniqueInstance;
    }
    public static ChocolateBoiler getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
            System.out.println("Created");
        }else{
            System.out.println("Already exists");
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fi ll the boiler with a milk/chocolate mixture
        }
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
        // drain the boiled milk and chocolate
            empty = true;
         }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
    public static void main(String[] args){
        ChocolateBoiler uniqueInstance = ChocolateBoiler.getInstance();
        ChocolateBoiler uniqueInstance2 = ChocolateBoiler.getInstance();

    }
    }
