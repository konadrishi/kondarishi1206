public class StaticMethod {
    static int sValue;

    public static int staticMethod(){
        System.out.println("This is from Static method");
        return 12;
    }
    static {
        sValue=staticMethod();
    }
}
