import javax.xml.transform.sax.SAXSource;
import java.sql.SQLOutput;
import java.util.*;
public class oopsassignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of first complex number:");
        int r1 = sc.nextInt();
        System.out.println("Enter imaginary part of first complex number:");
        int i1 = sc.nextInt();
        System.out.println("Enter real part of second complex number:");
        int r2 = sc.nextInt();
        System.out.println("Enter imaginary part of second complex number:");
        int i2 = sc.nextInt();
        Complex c = new Complex();
        c.printsum(r1,i1,r2,i2);
        c.printdifference(r1,i1,r2,i2);
        c.printproduct(r1,i1,r2,i2);
        c.printdivide(r1,i1,r2,i2);
    }
}
class Complex {
    void printsum(int r1,int i1,int r2,int i2){
        System.out.println("sum of complex number is "+ (r1+r2) + " + " + (i1+i2)+ "i" );
    }
    void printdifference(int r1,int i1, int r2,int i2){
        System.out.println("Differnce of complex number is "+ (r1-r2) + " + "  + (i1-i2)+ "i");
    }
    void printproduct(int r1,int i1,int r2, int i2){
        System.out.println("Product of complex number is "+ (r1*r2) + " + " + (i1*i2) + "i");
    }
    void printdivide(int r1,int i1,int r2,int i2) {
       int denominator = r2 * r2 + i2 * i2;
       int realQuotient = (r1 * r2 + i1 * i2);
       int imaginaryQuotient = (i1 * r2 - r1 * i2);
       System.out.println("Quotient of complex numbers is " + realQuotient + " + " + imaginaryQuotient + "i");
    }

}
