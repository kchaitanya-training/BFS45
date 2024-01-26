package BufferedInputOutputS;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputOutputS {

    public static void main(String[] args) {
        BufferedInputStream input = null;
        BufferedOutputStream output = null;

        try {
            // Specify the input and output file names
           
            // Create BufferedInputStream and BufferedOutputStream
            input = new BufferedInputStream(new FileInputStream("/Users/dhawanyingma/desktop/Eclipse/data.txt"));
            output = new BufferedOutputStream(new FileOutputStream("/Users/dhawanyingma/desktop/Eclipse/output.txt"));

            // Read from the input and write to the output
            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }

            // Flush the output stream to ensure all data is written
            output.flush();

        } catch (IOException ex) {
            System.out.println(ex);

        } finally {
            try {
                // Close the input and output streams in the finally block
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}












