import java.util.*;

class Student{
     String firstName;
     String lastName;
     double gpa;
    public Student(String firstName,String lastName,double gpa){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gpa=gpa;
    }
}


public class Main {
    public static void main(String[] args){
        HashMap<String,Student> students=new HashMap<>();

        Student s1=new Student("ri","koqa",3.2);
        Student s2=new Student("rishi","ksfdo",3.52);
        Student s3=new Student("rsdai","kfedo",3.42);
        Student s4=new Student("rsadi","kvsdo",3.25);
        Student s5=new Student("rasfafsi","kdvco",3.42);
        Student s6=new Student("rqwri","kovz",3.12);
        Student s7=new Student("rifwe","kvo",3.32);
        Student s8=new Student("rifds","kdvo",3.22);

        List<Student> stdl=new ArrayList<>();
        stdl.add(s1);
        stdl.add(s2);
        stdl.add(s3);
        stdl.add(s4);
        stdl.add(s5);
        stdl.add(s6);
        stdl.add(s7);
        stdl.add(s8);

        for(Student s:stdl){
            students.put(s.firstName,s);
        }

        //Entryset
        for(Map.Entry<String,Student> e:students.entrySet()){
            String key=e.getKey();
            Student value=e.getValue();
            System.out.println("key: " + key+" " + "value: "+value.firstName+" "+value.lastName+" "+value.gpa);
        }
        System.out.println(" ");

        //forEach method
        students.forEach((k,v)->System.out.println("Key : "+k+" "+"value: "+v.firstName+" "+v.lastName+" "+v.gpa));
        System.out.println(" ");

        Iterator<String> iterator = students.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Student value = students.get(key);
            System.out.println("Key: " + key + ", Value: " + value.firstName +" "+value.lastName+" "+value.gpa);
        }
    }

}
