import java.util.Scanner;
public class conditional {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number ");
        int a=scanner.nextInt();
        System.out.print("enter the number ");
        int b=scanner.nextInt();
        int max;
        max= (a>b) ? a:b;
        System.out.println(max);
    }
}