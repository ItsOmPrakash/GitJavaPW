import java.util.Scanner;
public class Input_series1 {
    public static void main(String [] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("Enter the floating value");
        float num = scan.nextFloat();
        System.out.println(num);

        System.out.println("Enter the name ");
        String name = scan.next();
        System.out.println(name);
       
        System.out.println("Enter the Long value");
        long numb = scan.nextLong();
        System.out.println(numb);

        System.out.println("Enter the byte value");
        byte bit = scan.nextByte();
        System.out.println(bit);
    }
    
}
