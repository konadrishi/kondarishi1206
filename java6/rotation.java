import java.util.Scanner;

public class rotation {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=2;
        int[] arr={1,2,3,4,5};
        int[] finalArr=new int[5];
        int len=arr.length-a;
        for(int i=0;i<len;i++){
            finalArr[i]=arr[i+a];
        }
        for(int j=0;j<a;j++){
            finalArr[j+a+1]=arr[j];
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(finalArr[k]);
        }
;
    }
}
