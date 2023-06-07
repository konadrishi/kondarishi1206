public class reverse {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7};

        int temp=0;
        int l=a.length-1;
        for(int i=0;i<l/2;i++){
            temp=a[i];

            a[i]=a[l-i];
            a[l-i]=temp;
        }
        for(int j=0;j< a.length;j++){
            System.out.println(a[j]);
        }

    }
}
