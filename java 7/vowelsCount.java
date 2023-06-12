import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        scan.close();
        int count=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }

        }
        System.out.println(count);





    }
}
