public class constructorsinabstraction {
    public static void main(String[] args) {
        Mustang2 myhorse = new Mustang2();
    }
}
abstract class Animal5 {
    String color;
    Animal5(){
        color = "brown";
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse3 extends Animal5{
    void changeColor(){
        color = " dark brown";

    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
    Horse3(){
        System.out.println("horse constructor called");
    }
}
class Mustang2 extends Horse3{
    Mustang2 (){
        System.out.println("Mustang constructor called ");
    }
}
