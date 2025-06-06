import java.util.Scanner;

class Vehical{
    String  model_name,company_name,fuel_type;
    int model,capacity;

    public void accept(Scanner sc) {
        System.out.print("Enter vehicle model name: ");
        model_name = sc.nextLine();

        System.out.print("Enter vehicle company name: ");
        company_name = sc.nextLine();

        System.out.print("Enter vehicle model year: ");
        model = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter vehicle seating capacity: ");
        capacity = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter vehicle fuel type: ");
        fuel_type = sc.nextLine();
    }


    public void display(){

        System.out.print("Vehical model name is :" + model_name);
        System.out.print("Vehical company name is :" + company_name);
        System.out.print("Vehical  model is :" + model);
        System.out.print("Vehical setting capacity is :" + capacity);
        System.out.print("Vehical fuel type is :" + fuel_type);

    }

}

public class Cia{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Vehical v=new Vehical();

        int ch;

        do{
            System.out.print("1.Accept details\n2.Display details\n3.Exite :");
            ch=sc.nextInt();

            switch(ch){
                case 1:
                v.accept(sc);
                break;

                case 2:
                v.display();
                break;

                case 3:
                System.out.print("Exite");
                break;
            }
        }while(ch!=3);

        sc.close();
    }
}