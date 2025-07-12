import java.util.*;
class cuboid {
    public static void main(String args[]) {

        int len,bre,hei, totalarea,volume;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of len ,bre , hei");
        len =sc.nextInt();
        bre =sc.nextInt();
        hei =sc.nextInt();
        totalarea = 2*(len*bre+len*hei+bre*hei);
        volume = len*bre*hei;
        System.out.println("total area of cuniod" +totalarea +" volume of cuniod"+volume);
    } 
}