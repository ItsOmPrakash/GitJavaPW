//Write a Code Using Ternary Operator to Check the Greatest of 3 number
public class Ternary_Operator02 {
    public static void main(String []args)
    {
        int num1,num2,num3,result;
        num1 =89;
        num2 =65;
        num3 =18;
       result = (num1 > num2) ? ((num1>num3)? num1:num3):((num2>num3) ? num2:num3 );
        System.out.println(result);

    //Ternary Operator as IF Else

    if (num1 > num2)
    {
        if(num1> num3)
        System.out.println(num1);
        else
        System.out.println(num3);
    }
    else
    {
        if(num2> num3)
        System.out.println(num2);
        else
        System.out.println(num3);
    }
}
}