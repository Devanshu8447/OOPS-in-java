public class gettersandsetters {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1 ();
        //created a pen object called p1 in heap
        p1.settColor("Blue");
        System.out.println(p1.gettColor());
        p1.settColor("Yellow");
        System.out.println(p1.gettColor());
        ;
    }
}
class Pen1 {
    private String color;
    private int tip;

    String gettColor(){
        return this.color;
    }
    int gettTip(){
        return this.tip;
    }
    void settColor(String newColor){
        this.color = newColor;
    }

}
