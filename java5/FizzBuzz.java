package kondarishi1206.java5;
import java.util.Scanner;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        System.out.println("Enter number: ");
        Scanner scan=new Scanner(System.in);
        int a =scan.nextInt();
        if(a>0 && a<100){
            if(a%3==0 && a%5==0){
                System.out.println("FizzBuzz");
            }
            else if(a%3==0){
                System.out.println("Fizz");

            }else if(a%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(a+" number is not divisible by 3,5");
            }
        }else{
            System.out.println("Number should be from o to 100");
        }
    }
}
