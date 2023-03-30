public class Assignment_Operator
{
    public static void main(String []args)
    {
        int a = 12, b =2;
        //Assignment Operators
       System.out.println("simple assignment operator = operator : a = " + a);
       a += b;
       System.out.println("Add assignment operator  += operator : a += " + a );
       a -= b;
       System.out.println("Subtract assignment operator -= operator : a -= " + a);
       a *= b;
       System.out.println("Multiply assignment operator *= operator : a *= " + a);
       a /= b;
       System.out.println("Division assignment operator /= operator : a/= " +a);
       a %= b;
       System.out.println("Modulus assignment operator %= operator : a%= " +a);
    
    }
}