import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n and m :");
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}