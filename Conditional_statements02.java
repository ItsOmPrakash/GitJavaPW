

public class Conditional_statements02 {
    public static void main(String []args)
    {
        int age = 57;
        
       if( age <= 10) 
       System.out.println("You are still a kid");
       else if(age <=18)
       System.out.println("you are now a teen");
       else if (age > 18 && age <= 60)
       System.out.println("you are now a adult and you have to work");
       else if (age > 60 || age < 100)
       System.out.println("you are now a old man and you will die soon");
       else
       System.out.println("No word for you lengend");

    }
}
