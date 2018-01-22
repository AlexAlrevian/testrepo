import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    private static final String FILENAME = "/home/alrevian/projects/Project/myfile.txt";

    public static void write(String line) {

//        System.out.println(line);

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            fw = new FileWriter(FILENAME, true);
            bw = new BufferedWriter(fw);
            bw.write(line);
            bw.write('\n');


        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

}