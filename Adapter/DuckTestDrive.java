package Adapter;

interface Duck {
    public void quack();
    public void fly();
}

class MallardDuck implements Duck {
    //public MallardDuck(){};
    public void quack() {
    System.out.println("Quack");
    }
    public void fly() {
    System.out.println("I’m flying");
}

interface Turkey {
    public void gobble();
    public void fly();
}

class WildTurkey implements Turkey {
    //public WildTurkey(){};
    public void gobble() {
    System.out.println("Gobble");
    }
    public void fly() {
    System.out.println("I'm flying");
    }
}

class TurkeyAdapter implements Duck{
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
    }
    public void quack() {
        turkey.gobble();
    }
    public void fly() {
        turkey.fly();
    }
}
public class DuckTestDrive{
    public static void main(String[] args) {
    Turkey wildTurkey = new WildTurkey();
    Duck wildTurkeyAdapter = new TurkeyAdapter(wildTurkey);
    wildTurkeyAdapter.quack();
    }
}
