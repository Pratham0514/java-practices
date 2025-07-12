import java.util.*;

class Aresoftraingle {

    public static void main(String args[]) {

        Scanner sc= new Scanner(System.in);
        
        float base,height,area;
        
        System.out.println("Enter the Height and Base");
        base =sc.nextFloat();
        height =sc.nextFloat();
          area = 0.5f * base * height;
        
        System.out.println("area of triangle" + area);
        
        sc.close();
    }
}



