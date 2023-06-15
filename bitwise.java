import java.util.Scanner;
public class bitwise{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the second number: ");
        int b=scanner.nextInt();
        scanner.nextLine();
        int c=a & b,d=a | b,e=a ^ b;
        System.out.println("AND operator of "+a+"and "+b+"is "+c);
        System.out.println("OR operator of "+a+"and "+b+"is "+d);
        System.out.println("XOR operator of "+a+"and "+b+"is "+e);
    }
}