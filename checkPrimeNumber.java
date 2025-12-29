import java.util.Scanner;

public class checkPrimeNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Give Number: ");
        int num=sc.nextInt();
        if(num==1||num==2||num==3){
            System.out.println(num+" is prime number");
        }
        else if(num%1==0&&num%num==0&&num%2==1&&num%3!=0){
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not prime number");
        }
    }
}