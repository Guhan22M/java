import java.util.Scanner;
public class restaurant {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a=1,b=2,c=3,d=4,e=5,n=1200,i,j;
        System.out.println("Welcome to our Restaurant ");
        System.out.println("Your bill amount is "+n);
        System.out.println("Please fill our Restaurant food rating ");
        System.out.print("Enter food rating from 1 to 5 ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter service rating from 1 to 5 ");
        int y=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter ambience rating from 1 to 5 ");
        int z=scanner.nextInt();
        scanner.nextLine();
        if (x==4 || x==5) {
            if ((y==4 || y==5) && (z==4 || z==5)) {
                i=((n%10)/100);
                System.out.println("your tip is "+i);
            }
            else {
                i=((n%5)/100);
                System.out.println("your tip is "+i);
            }
        }
        else if (x==3 || x==2 || x==1) {
            if ((y==4 || y==5) && (z==4 || z==5)) {
                j=((n*5)/100);
                System.out.println("your tip is "+j);
            }
            else {
                j=((n*1)/100);
                System.out.println("your tip is "+j);
            }
        }
        }
    }