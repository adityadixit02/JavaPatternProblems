import java.util.*;
public class Pattern1{
    public static void main(String[] args) {
System.out.println("Enter limit:");
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
   for (int j=i;j<=n;j++){
System.out.print("*");
            }
            System.out.println();
        }
    }
}