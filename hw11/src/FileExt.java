import java.io.*;
import java.util.Map;



public class FileExt extends File {

    public String pathname;

    public FileExt(String pathname) {
        super(pathname);
    }


    //returns String with file's values replaced with ones given in the map, where primary values are keys. Outprints message to console if some elements were not changed
    public String replacer(Map<String, String> map) {
        String s;
        int count = 0;
        StringBuilder result = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(this))) {

            while ((s = reader.readLine()) != null) {
                if (map.get(s) != null)
                    result.append(map.get(s)).append(System.lineSeparator());
                else count++;
            }

        } catch (IOException e) {
            System.err.println(this.toString() + " reading has crashed");
        }

        switch (count) {
            case 0:
                break;
            case 1:
                System.out.println("1 element was not changed");
                break;
            default:
                System.out.println(count + " elements were not changed");
                break;
        }

        return result.toString();
    }

    //replaces file's content with a given in the map
    public File fileContentReplacer(Map<String, String> map) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this))) {
            writer.write(this.replacer(map));
        } catch (IOException e) {
            System.err.println(this.toString() + " rewriting has crashed");
        }
        return this;
    }


    /*You should create method which replace words in the File and write result to existing File content
    a) read file, save to string var
    b) replace words
    c) add string to the existing file content*/

    public File fileContentMerger(Map<String, String> map) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.getPath()))){
        bw.append(this.replacer(map));
    }
    catch (IOException e)
    {System.err.println(this.toString() + " editing has crashed");}
    return this;
    }


    /*Check if file contains particular word. Pring 0 if no. Print number n which equals number of times it is contained in the file
    a) read file, save to string var
    b) calculate how many time the word occurs
    c) print result*/

    //public int checkWord(String word) {
//
    //}

}
