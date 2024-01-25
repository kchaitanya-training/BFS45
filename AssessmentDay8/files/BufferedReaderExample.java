package AssessmentDay8.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    void fileDemo() throws IOException {
        String file = GetFile.filePath();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}
