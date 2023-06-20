import java.util.Scanner;
public class vowel {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the letter ");
        char c=scanner.next().charAt(0);
        switch(c) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.print("Given letter is vowel ");
                break;
            default:
                System.out.print("It is constant ");
        }
    }
}
