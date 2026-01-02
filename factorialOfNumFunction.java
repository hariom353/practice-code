import java.util.Scanner;

public class factorialOfNumFunction {
    public static void fact(int a){
        if(a<0){
            System.out.println("Invalid Number");
        }
        else{
            int fact=1;
            for(int i=1;i<=a;i++){
                fact*=i;
            }
            System.out.println("Factorial of "+a+" is "+fact);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        fact(n);
    }
}
