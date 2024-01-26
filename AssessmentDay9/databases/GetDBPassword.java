package AssessmentDay9.databases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class GetDBPassword {

    public static String dbPassword() {
        String password = "root";
        try {

            // WRITE PASSWORD INTO 'databasePassword.txt' FILE IN THIS FOLDER
            File passwordFile = new File("AssessmentDay9/databases/databasePassword.txt");
            BufferedReader reader = new BufferedReader(new FileReader(passwordFile));

            password = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return password;

    }

}
