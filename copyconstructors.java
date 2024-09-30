public class copyconstructors {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "devanshu";
        s1.roll = 123;
        s1.password ="abcd";

        Student2 s2 = new Student2(s1);
        s2.password = "xyz";
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.password);

        System.out.println(s2.name);
        System.out.println(s2.roll);;
        System.out.println((s2.password));
    }
}
class Student2 {
    String name;
    int roll;
    String password;
    //copy constructor
    Student2( Student2 s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
    Student2(){
        System.out.println("constructor is called...");
    }
}
