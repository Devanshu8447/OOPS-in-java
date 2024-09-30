public class typesofconstructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1("devanshu");
        System.out.println(s1.name);
        Student1 s2 = new Student1(123);
        System.out.println(s2.roll);

        System.out.println(s1.roll);
        System.out.println(s2.name);
        //Student1 s3 = new Student1();





    }
}
class Student1 {
    String name;
    int roll;
    Student1(String name){
        this.name= name;

    }
    Student1(int roll){
        this.roll = roll;
    }
}
