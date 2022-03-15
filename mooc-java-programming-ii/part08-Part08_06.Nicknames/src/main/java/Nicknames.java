
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        
        nicknames.put("mathhew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");
        
        for (Map.Entry<String, String> entry : nicknames.entrySet()) {
            System.out.println(entry.getKey() + "'s nickname is " + entry.getValue());
        }
    }

}
