import java.util.Scanner;
public class Day2 {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.println("--Student Details-- ");
        System.out.println("Enter your name:-");
        String name = abc.nextLine();
        System.out.println("Enter your age:-");
        int age = abc.nextInt();
        System.out.println("Enter roll no.:-");
        int rollno = abc.nextInt();
        System.out.println("Name:- "+name);
        System.out.println("Age:- "+age);
        System.out.println("Rollno.:- "+rollno);
        System.out.println("Thanks.");

    }

}
