package org.someone;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class myFileUtil {

    public static void writeToFile(String hostname) throws IOException {
        List<String> lines=new ArrayList<String>(List.of("flag = 1", App.username, App.password));
        Files.write(Paths.get("C:\\Users\\" + hostname + "\\Documents\\mylittlepony\\data.txt"), lines);

    }

    public static List<String> readFileInList(String fileName) {
        List<String> lines;
        try
        {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }
        catch (IOException e)
        {
            System.out.println("Gerekli txt dosyalarının belgeler(documents) klasöründe olduğundan emin olun");
            return Collections.emptyList();
            //e.printStackTrace();
        }

        return lines;
    }

}

