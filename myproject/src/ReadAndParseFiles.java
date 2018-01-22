import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.util.*;
import java.util.regex.Pattern;


public class ReadAndParseFiles {

    public static void main(String[] args) throws IOException {
        String target_dir = "/home/alrevian/projects/Project/files";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        StringBuilder strBuilder = new StringBuilder();
        for (File f : files) {
            if(f.isFile()) {
                BufferedReader bufReader = null;

                try {
                    bufReader = new BufferedReader(
                            new FileReader(f));
                    String line;

                    while ((line = bufReader.readLine()) != null) {
                        strBuilder.append(line).append("\n");
                    }

                }
                finally {
                    if (bufReader != null) {
                        bufReader.close();
                    }
                }
            }
        }
        String[] blocks = strBuilder.toString().split("\n\n");

        Map<Date, Set<String>> dateMap = new TreeMap<>();
        Set<String> transactionIds = new HashSet<>();


        for (String block : blocks) {
            block = block.trim();

            Pattern datePattern = Pattern.compile("(Sun|Mon|Tue|Wed|Thu|Fri|Sat),\\s(([0-9])|([0-2][0-9])|([3][0-1]))\\s(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\s\\d{4}");







            System.out.println(block);
            System.out.println("+++++");
        }
    }

}