public class abstraction {
    public static void main(String[] args) {
        Horse2 h = new Horse2();
        h.eats();
        h.walk();

        Chicken c = new Chicken();
        c.eats();
        c.walk();


    }
}
abstract class Animal4{
    void eats(){
        System.out.println("animal eats");
    }
    abstract void walk ();
}
class Horse2 extends Animal4{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal4{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
