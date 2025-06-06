/*import java.util.*;
class Conditionals
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
         System.out.println("Enter your age: ");
             int age=sc.nextInt();
             if(age>=18)
             {
                System.out.println("You are an adult");
             }
             else
             {
                Sys1tem.out.println("Bade ho jao beta");
             }
    }
}*/

/*import java.util.*;
class Conditionals{
    public static void main(String args[])
    {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter a no:- ");
        int a =sc.nextInt();
        if(a>=0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}*/

import java.util.*;
class Conditionals{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:- ");
        int button=sc.nextInt();
        switch(button)
        {
            case 1:System.out.println("Ram Ram");;
            break;
            case 2:System.out.println("Nmaskar");
            break;
            case 3:System.out.println("Namaste");
            break;
            default:System.out.println("Invalid Input");
        }
    }
}