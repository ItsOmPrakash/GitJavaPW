public class Basic_Loops
{
    public static void main(String []args)
    {
     
         for( int a = 0 ; a <5 ; a++ )
         {
             System.out.println("For Loop");
         }
      int b = 0;
      while(b < 3)
        {
          System.out.println("while Loop");
          ++b;
        }
       int c = 0;
       do
         {
           System.out.println("Do-While Loop");
           ++c;
         } 
         while (c <3);
    }
}