import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=in.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++) {
                int sum=i+j;
                if ((sum % 2) == 0) //even
                    System.out.print("1 ");
                else//odd
                {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }
}