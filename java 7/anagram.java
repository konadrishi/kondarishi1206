import java.util.Arrays;
import java.util.Scanner;
public class anagram{

    public static  void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2= scan.nextLine();
        scan.close();
       char[] arr1=str1.toCharArray();
       Arrays.sort(arr1);
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        }



    }

