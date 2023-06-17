import java.util.Scanner;
public class average {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your tamil mark: ");
        int a=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your english mark: ");
        int b=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your maths marks: ");
        int c=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your science marks: ");
        int d=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your social marks: ");
        int e=scanner.nextInt();
        scanner.nextLine();
        int tot;
        float avg;
        tot = a+b+c+d+e;
        avg=tot/5;
        System.out.println("Your Total is "+tot);
        System.out.println("Your Average is "+avg);
    }
}