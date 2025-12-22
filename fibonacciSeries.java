import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Give range: ");
    int range=sc.nextInt();
        int first=0; int second=1; int next; int a=0;
        for(int n=1;n<=range;n++){
            a=a+first;
            System.out.print(first+" ");
            next=first+second;
            first=second;
            second=next;
        }
        System.out.println();
        System.out.println("sum of fibbonacci series: "+a);
    }
}