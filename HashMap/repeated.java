
import java.util.HashMap;

public class repeated {
    public static void main(String[] args){
        String world="test string";
        world=world.replace(" ","");
        HashMap<Character,Integer> counted=new HashMap<>();

        for(char c:world.toCharArray()){

            if(counted.containsKey(c)){
                counted.put(c,counted.get(c)+1);
            }else{
                counted.put(c,1);
            }

        }
        for(char c:counted.keySet()){
            System.out.println(c+"-"+counted.get(c));
        }
    }
}
