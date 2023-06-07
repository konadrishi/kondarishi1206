public class parent {
    int first;
    public parent(int first){
        this.first=first;
    }

}

class child extends parent{
    int second;
    public child(int first,int second){
        super(first);
        System.out.println("Parent Class: "+first);
        System.out.println("Child Class: "+ second);

    }
    public child(int second){
        super(0);
        System.out.println("Child class input only"+ second);
    }

}
