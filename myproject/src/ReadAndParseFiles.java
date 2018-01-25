import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class ReadAndParseFiles {

    public static void main(String[] args) throws IOException {
        String target_dir = "/home/alrevian/projects/testProject/testFiles";
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        StringBuilder strBuilder = new StringBuilder();
        for (File f : files) {
            if (f.isFile()) {
                BufferedReader bufReader = null;

                try {
                    bufReader = new BufferedReader(
                            new FileReader(f));
                    String line;

                    while ((line = bufReader.readLine()) != null) {
                        strBuilder.append(line).append("\n");
                    }
                } finally {
                    if (bufReader != null) {
                        bufReader.close();
                    }
                }
            }
            strBuilder.append("\n\n");
        }
        String[] blocks = strBuilder.toString().split("\n\n\n");

        List<String> stringBlocks = Arrays.asList(blocks);

        System.out.println(stringBlocks);

        List<List<String>> parsedBlocks = new ArrayList<>();
        for (String block : stringBlocks) {
            List<String> trimmedBlock = trim(block.split("\n"));
            if (trimmedBlock.size() > 1) {
                parsedBlocks.add(trimmedBlock);
//                TODO add parsed date and id
            }
        }
        System.out.println(parsedBlocks);

        Map<Date, Set<String>> dateMap = new TreeMap<>();
        Set<String> transactionIds = new HashSet<>();

    }

    private static List<String> trim(String[] arr) {
        List<String> result = new ArrayList<>();
        for (String str : arr) {
            String trimmed = str.trim();
            result.add(trimmed);
        }
        return result;
    }
//        private static LocalDate extractDate(List<String> block) {
//        }

    //    private static List<String> extractIds(List<String> block) {
    //    }
}