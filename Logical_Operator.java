public class Logical_Operator
{
    public static void main(String []args)
    {
        int a = 20, b= 10;
        int c =20;
        System.out.println(a==b || a<b || a>b);
        System.out.println(a<b && a>b && a==b);
        System.out.println(a>b && c>b && c==a);
        System.out.println(a==c && a>b || c<b); //And Operator has high precedence than or operator
        System.out.println(!true);

    }
}