import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
public class reverseSentence {

    public static String reverse(String str){
        char[] arr=str.toCharArray();
        char[] fnl = new char[arr.length];
        for(int i=0;i<arr.length;i++){
            fnl[i]=arr[arr.length-1-i];
        }

        return new String(fnl);
    }
    public static void main(String[] args){
        String str="Java J2EE Reverse Me";
        String[] arr=str.split(" ",0);
        String rev="";
        for(int i=0;i<arr.length;i++){
            rev=rev+" "+reverse(arr[i]);
        }
        System.out.println(rev);

    }
}
