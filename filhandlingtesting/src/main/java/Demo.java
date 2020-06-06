import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Demo {
    //file handling
    // date n time
    // unit testing using junit.

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src", "main", "resources", "data.txt" );

        List<String> strings = Files.readAllLines(path);
        for (String str: strings) {
            System.out.println(str);
        }

        String str = "Learning Java is Good !";

        ///Files.write(path, str.getBytes() , StandardOpenOption.APPEND );

        Scanner scanner = new Scanner(path);

//        OutputStream stream = new FileOutputStream(path.toFile());
//        stream.write(str.getBytes());

        FileWriter writer = new FileWriter(path.toFile());
        writer.write(str);
        writer.close();



        //Formatter formatter = new FileWriter(new FileOutputStream(path.toFile()));

    }
}
