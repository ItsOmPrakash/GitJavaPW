public class Increment_Decriment
{
public static void main(String []args )
{
int a,b,c;
a = 20;
b = a++ - --a + ++a + a++ - a-- + a++ + --a;
c = (b++ * ++b) + b++;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}