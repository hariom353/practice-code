import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int n = scanner.nextInt();
        int sum=0;
        for(int i=1; i<=10;i++){
            sum=sum+(n*i);
            System.out.println(n+" times "+i+" is "+(n*i));
        }
        System.out.println("The sum is: "+sum);
        }
        
    }
