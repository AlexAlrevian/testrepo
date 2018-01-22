import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

        public static void main(String args[]){
            HashMap<Integer,String> hm = new HashMap<Integer,String>();
            hm.put(100,"Hey");
            hm.put(100,"SomeName");
            hm.put(101,"Blabla");
            hm.put(102,"Blablabla");
            for(Map.Entry m:hm.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }

