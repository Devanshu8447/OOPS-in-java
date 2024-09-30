public class shallowanddeepcopy {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.marks[0]= 100;
        s1.marks[1]= 90;
        s1.marks[2]= 80;

       // Student3 s2 = new Student3(s1);
        System.out.println(s1.marks[0]);
    }
}

class Student3 {
    int marks [];
    Student3(Student3 s1){
        marks = new int[3];
        this.marks= s1.marks;
    }
    Student3(){
        System.out.println("constructor is called");
    }
}
