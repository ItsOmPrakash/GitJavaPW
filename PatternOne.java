import java.util.Scanner;
public class PatternOne
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
      System.out.println("Enter Value of n");
      int n = scan.nextInt();
       int i,j;
       for(i = 0; i < n; i++ )
       {
         for(j = 0; j < n; j++ )
         {
         System.out.print("* ");
         }
         System.out.println( );

       }

    }
}