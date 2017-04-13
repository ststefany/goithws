import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String > map = new HashMap<>();

        map.put("1", "2");
        map.put("2", "3");
        map.put("3", "4");
        map.put("5", "6");

        FileExt file = new FileExt("C:/Users/Scim/Desktop/file1.txt");

        String s = file.replacer(map);
        System.out.println(s);


        file.fileContentReplacer(map);
    }
}
