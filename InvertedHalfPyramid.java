import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=in.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}