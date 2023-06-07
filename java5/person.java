import java.util.Scanner;

public class person {
    public static void main(String[] args){
        System.out.println("enter age: ");
        Scanner scan =new Scanner(System.in);
        int a =scan.nextInt();
        if(a>0){
            if(a>=13 & a<=19){
                System.out.println("person is teen");
            }else if(a<13) {
                System.out.println("Person is Kid");
    
            }else{
                System.out.println("Adult");
            }
        }else{
            System.out.println("age should be above 0");
        }

    }
    
}
