import java.util.*;

class ThreeSideTArea {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        float s ;
        double area;
        System.out.println("Enter the values of a b c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = 0.5f*(a+b+c);
        System.out.println("vale of s " +s);
        area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area of the triangle" +area);
    }
}