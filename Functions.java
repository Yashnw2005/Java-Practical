import java.util.*;
class Functions{
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b);
        System.out.println("Sum is: "+sum);
        sc.close();
    }
}