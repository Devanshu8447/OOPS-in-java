public class hierarchialinheritance {
    public static void main(String[] args) {
        Fish1 f1 = new Fish1();
        f1.eat();


    }
}
class Animal2 {
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal1 extends Animal2{
    void walk(){
        System.out.println("walk");
    }

}
class Fish1 extends Animal2{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal2{
    void fly(){
        System.out.println("fly");
    }
}