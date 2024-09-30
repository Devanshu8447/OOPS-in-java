public class methodoverriding {
    public static void main(String[] args) {
        Deer d = new Deer ();
        d.eat();
    }

}
class Animal3{
    void eat(){
        System.out.println("eats ");
    }

}
class Deer extends Animal3 {
    void eat(){
        System.out.println("eats grass");
    }
}
