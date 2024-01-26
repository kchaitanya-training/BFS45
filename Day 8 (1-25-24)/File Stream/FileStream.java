import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileStream {
	
	String readFile() throws IOException{
		// Input File path for read.txt
		File inputFile = new File("D:\\bootcamp\\Day8\\src\\read.txt");
        // Create BufferedInputStream to read from the input file
        BufferedInputStream inFile = new BufferedInputStream(new FileInputStream(inputFile));
        //Creating a variable to store with string of the input file with StringBuilder
        StringBuilder fileContent = new StringBuilder();
        int readBytes=0;
        while ((readBytes = inFile.read()) != -1) {
        	fileContent.append((char)readBytes);		// store the input file content in the fileContent var
        }
        inFile.close();
        System.out.println("File read successfully.\nContent of input file: " + fileContent);
        
        return fileContent.toString(); 			
	}
	
	static void writeFile(String inFileContent) throws IOException{
		//Output File path for write.txt
		File outputFile = new File("D:\\\\bootcamp\\\\Day8\\\\src\\\\write.txt");
		// Create BufferedOutputStream to write into the output file
		BufferedOutputStream outFile = new BufferedOutputStream(new FileOutputStream(outputFile));
		outFile.write(inFileContent.getBytes());
		System.out.println("File copied successfully into the output file.");
		outFile.close();
	}

	    public static void main(String[] args) throws IOException {
	    	
	    	FileStream read = new FileStream();
	    // calling a method to read input file from an object and storing the input file content in the inFileContent var
	    	String inFileContent = read.readFile();
	    	// passing the content received from readFile() method,
	    	// Then writing the content to the output file
	    	writeFile(inFileContent);
	    }
}
