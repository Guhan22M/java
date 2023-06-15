import java.util.Scanner;
public class bitwise_condition {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number ");
        int a=scanner.nextInt();
        scanner.nextLine();
        if ((a>15) &&(a>30)){
            System.out.println("It works under and operator ");
        }else if ((a<15) || (a>30)) {
            System.out.println("It works under or operator ");
        }else{
            System.out.println("It does not works under any of the bitwise operator ");
        }
    }
}
