package kondarishi1206.java2;

public class Student{
    String name="Rishi";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
        
    }
    
    public static void main(String[] args){
        Student a=new Student();
        a.getName();
        a.setName("rrrrr");
    }
}