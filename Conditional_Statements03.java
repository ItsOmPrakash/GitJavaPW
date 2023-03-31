public class Conditional_Statements03 {
    public static void main(String []args)
    {
      int a,b,c;
       a = 9;
       b = 7;
       c = 6;
      
      if(a > b)
      {
         if (a > c)
         System.out.println("A is gratest");
         else 
         System.out.println("C is Gratest");
      }
      else if (b > c)
        System.out.println("B is Biggest");
      else if(b<c)
        System.out.println("C is biggest");  
      else
        System.out.println("A is equal to B and C");  
     
    }
}
