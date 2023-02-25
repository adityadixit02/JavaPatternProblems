import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        int k=1;
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for (int i=1;i<=line;i++)
        {
            for (int j=1;j<=i;j++){

                System.out.print(k+" ");
            k++;
            }
            
            
System.out.println();
        }
    }
    
}
