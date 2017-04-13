import java.io.*;
import java.util.Map;


public class FileExt extends File {

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
        String contentToWrite = this.replacer(map);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this))) {
            writer.write(contentToWrite);
        } catch (IOException e) {
            System.err.println(this.toString() + " rewriting has crashed");
        }
        return this;
    }


    // merges primary data in file with replaced data

    public File fileContentMerger(Map<String, String> map) {
        String contentToWrite = this.replacer(map);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.getPath()))) {
            bw.append(contentToWrite);
        } catch (IOException e) {
            System.err.println(this.toString() + " editing has crashed");
        }
        return this;
    }


    /*Checks if file contains particular word. Returns int of number of times word appears in a file and prints it to console*/

    public int checkWord(String word) {
        String s;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(this))) {
            while ((s = reader.readLine()) != null)
                if (s.equals(word))
                count++;
            System.out.println("Word \"" + word + "\" appears in " + this + " " + count + " times");
        }
        catch (IOException e) {
            System.err.println(this + "reading has failed");
        }
        return count;
    }

}
