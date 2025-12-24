import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("---------Calculator----------");
        System.out.println(" ");
        Scanner sc=new Scanner(System.in);
        System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nSelect your operation:- ");
        int operation=sc.nextInt();
        System.out.println("");
        int value;

        switch (operation) {
            case 1:
                System.out.println("Choice is Addition");
                System.out.print("First Number: ");
                int a=sc.nextInt();
                System.out.print("Second Number: ");
                int b=sc.nextInt();
                int sum=a+b;
                System.out.println("Value of your operation is: "+ sum);
            break;
            case 2:
                System.out.println("Choice is Subtraction");
                System.out.print("Larger Number: ");
                int c=sc.nextInt();
                System.out.print("smaller Number: ");
                int d=sc.nextInt();
                value=c-d;
                System.out.println("Value of your operation is: "+ value);
            break;
            case 3:
                System.out.println("Choice is Multiplication");
                System.out.print("First Number: ");
                int e=sc.nextInt();
                System.out.print("Second Number: ");
                int f=sc.nextInt();
                value=e*f;
                System.out.println("Value of your operation is: "+ value);
            break;
            case 4:
                System.out.println("Choice is Division");
                System.out.print("Enter dividend: ");
                int g=sc.nextInt();
                System.out.print("Enter divisor: ");
                int h=sc.nextInt();
                value=g/h;
                System.out.println("Value of your operation is: "+ value);
            break;
            default:
                System.out.println("");
                System.out.println("Invalid choice");
                break;
        }
        
    }

}
