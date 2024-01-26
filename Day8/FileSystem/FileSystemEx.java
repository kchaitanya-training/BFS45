import java.io.*;

public class FileSystemEx {

    public static void main(String[] args) {
        String inputFile = "src/test.txt";
        String outputFile = "src/output.txt";

        //Reading from File Input Stream
        try{
            FileInputStream fileInputStream = new FileInputStream(inputFile);

            int value = 0;
            System.out.println("===Reading from File Input Stream===");
            while((value = fileInputStream.read())!= -1){
                System.out.print((char)value);
            }

            System.out.println("");
            fileInputStream.close();

        }catch(IOException e){
            System.out.println("Error occurred from FileInputStream" + e);
        }

        //Reading from Buffered Input Stream
        try{
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            int value = 0;
            System.out.println("\n===Reading from Buffered Input Stream===");
            while((value = bufferedInputStream.read())!= -1){
                System.out.print((char) value);
            }


            System.out.println("");
            bufferedInputStream.close();

        }catch (IOException e){
            System.out.println("Error occurred from BufferedInputStream" + e);
        }

        //Reading from Buffered Reader
        try{
            BufferedReader fileInputStream = new BufferedReader(new FileReader(inputFile));

            String value = null;
            System.out.println("\n===Reading from Buffered Reader===");
            while((value = fileInputStream.readLine())!= null){
                System.out.println(value);
            }

            fileInputStream.close();

        }catch (IOException e){
            System.out.println("Error occurred from BufferedReader" + e);

        }

        //Writing from BufferedOutputStream
        try{
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(outputFile));

            System.out.println("\n===Writing from BufferedOutputStream===");
            String message = "This is a message written from BufferedOutputStream.\nHello\nWorld";
            System.out.println(message);

            byte[] messageBytes = message.getBytes();

            bufferedOutputStream.write(messageBytes);
            bufferedOutputStream.close();

        }catch (IOException e){
            System.out.println("Error occurred from BufferedOutputStream" + e);
        }

    }
}
