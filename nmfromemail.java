/* finf if the email id is on gmail
    find user and domain form email*/


import java.util.*;
class nmfromemail{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the email");
        String ac= sc.nextLine();
        int i= ac.indexOf("@");
        if(i!=-1){
        String username = ac.substring(0,i);
        String domain= ac.substring(i+1);
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
        }
        else{
            System.out.println("Invalid email format");
        }
    }
}