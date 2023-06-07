public class Main {
    public static void main(String[] args){
        Class a= new Class();
        a.Name1("Rishi");
        a.Name2("Rishi");
        a.Name2("Rishi");
System.out.println();
        child ch1=new child(10,20);
        child ch2 = new child(30);
        System.out.println();

        StaticMethod stat=new StaticMethod();
        System.out.println(stat.sValue);
        System.out.println();

        finalClass finalV=new finalClass();
        System.out.println("finaVariable: "+ finalV.finalValue);
        finalV.finalMethod();

    }
}
