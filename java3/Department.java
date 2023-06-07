abstract class Department{
    abstract int getDepartmenSize();

}
class cs extends Department{
    int size;
    public  cs(int size){
        this.size=size;

    }
    public int getDepartmenSize(){

        return this.size;
    }
}
