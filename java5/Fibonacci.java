import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println("Enter number: ");
        Scanner scan=new Scanner(System.in);
        int nTerm=scan.nextInt();
        int a=0,b=1;
        for(int i=1;i<=nTerm;i++){
            System.out.print(a+" ");
            int temp=a;
            a=b;
            b=temp+b;

        }

    }
    
}
