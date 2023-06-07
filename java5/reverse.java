
public class reverse {

    public int getReverse(){
        int a=1234, rev=0;
        while(a!=0){
            int temp=a%10;
            rev=rev*10+temp;
            a /=10;
        }
        return rev;
    }
}
