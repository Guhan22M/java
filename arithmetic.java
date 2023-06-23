import java.util.Scanner;
public class arithmetic {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number ");
        int a=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the second number ");
        int b=scanner.nextInt();
        scanner.nextLine();
        int c;
        c=a+b+(a++)+(b++)+(++a)+(++b);
        System.out.println(c);
    }
}
