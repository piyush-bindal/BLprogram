import java.util.Scanner;
public class Ternaryoperator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("Enter fourth number: ");
        int d = sc.nextInt();
        String largest = (a>b && a>c && a>d)? "A is greater":
                (b>a && b>c && b>d)? "B is greater":
                        (c>a && c>b && c>d)? "C is greater":
                                (d>a && d>c && d>b)? "D is greater":
                                        "All are equal";

        System.out.println("The largest number is: "+largest);

    }
}
