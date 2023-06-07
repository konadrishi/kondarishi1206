public class interFace {
}

interface inter1{
     default void Name1(String name){}
}

interface  inter2{
    default void Name2(String name){
    }
}


class Class implements inter2, inter1 {
    public void Name1(String name){
        System.out.println("From inter1 " +name);
    }
    public void Name2(String name){
        System.out.println("From inter2 " +name);
    }
}