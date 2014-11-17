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
       int result = 0;
       String line = mReader.readLine();
       result = Integer.parseInt(line);
       return result;
    }

}
