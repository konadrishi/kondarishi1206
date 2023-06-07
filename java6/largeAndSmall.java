import java.sql.Array;


public class largeAndSmall {

    public static void main(String[] args){
        int[] arr={14,23,3,41,5};

        int LargeNum=large(arr);
        System.out.println("Large is: "+LargeNum);
        int Small=small(arr);
        System.out.println("Small is: "+Small);
    }
    public static int small(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(temp>arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }
    public static int large(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length-1;i++){
                if(temp<arr[i]){
                    temp=arr[i];
                }
            }
            return temp;
        }
    }


