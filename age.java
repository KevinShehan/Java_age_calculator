import java.util.*;
public class age{
    public static void main(String[] args){
        System.out.println("\t Age Calculator");
        System.out.println("===================================");
        System.out.print("Enter Age :- ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        int years =  age / 365;
        int remainingDays =  age % 365;
        int months = remainingDays / 30;
        System.out.println("Age is : " + years + " years, " + months + " months");
    }
}