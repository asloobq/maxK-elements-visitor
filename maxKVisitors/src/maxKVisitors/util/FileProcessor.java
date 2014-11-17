package maxKVisitors.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileProcessor implements FileProcessorI {

    private String mFilename;
    private BufferedReader mReader;

    public FileProcessor(String filenameIn) {
        mFilename = filenameIn;
        try {
            mReader = new BufferedReader(new FileReader(mFilename));
        } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.exit(1);
        } finally {}
       
    }

    /* 
      @return returns the next number from the file
    */
    public int nextInt() throws IOException {
       Integer result = null;
       String line = mReader.readLine();
       try {
           result = Integer.parseInt(line);
       } catch (NumberFormatException e) {
           System.err.println("Invalid number string");
           System.exit(1);
       }
       return result;
    }

}
