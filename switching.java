import java.util.Scanner;
public class switching {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number ");
        int a=scanner.nextInt();
        System.out.println("enter the second number ");
        int b=scanner.nextInt();
        char c;
        System.out.println("enter the operation ");
        c=scanner.next().charAt(0);
        switch(c) {
            case '+':
                System.out.println("Addition of given numbers are "+(a+b));
                break;
            case '-':
                System.out.println("subtraction of given numbers are "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication of given numbers are "+(a*b));
                break;
            case '/':
                System.out.println("Division of given mubers are "+(a/b));
                break;
            case '%':
                System.out.println("Modulus of given numbers are "+(a/b));
                break;
            default:
                System.out.println("enter the correct operator it may be +,-,*,/,%");
        }

    }
}
