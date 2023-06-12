import java.util.Scanner;
public class rotationString {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        scan.close();
        if(str1.length()!=str2.length()){
            System.out.println("False");
        }else{
            String str3=str1+str1;
            if(str3.contains(str2)){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    }
}
