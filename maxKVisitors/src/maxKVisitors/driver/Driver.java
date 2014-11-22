package maxKVisitors.driver;

import java.io.IOException;

import maxKVisitors.util.FileProcessorI;
import maxKVisitors.util.FileProcessor;

import maxKVisitors.util.MyVector;
import maxKVisitors.util.MyArray;
import maxKVisitors.util.PopulateVisitor;
import maxKVisitors.util.MaxHeapVisitor;
import maxKVisitors.util.ModifiedBubbleSortVisitor;
import maxKVisitors.util.Visiting;
import maxKVisitors.util.Visitor;
import maxKVisitors.util.Logger;
import maxKVisitors.util.Logger.LEVEL;

public class Driver {

    public static void main(String args[]) {
        if( args.length != 3){
            System.err.println("Please enter only 2 arguments <filename> <k>");
            System.exit(1);
        }

        int k = 0;
        try{
            k = Integer.parseInt( args[0]);
        }catch (Exception e){
            //e.printStackTrace();
            System.err.println("invalid format of K.");
            System.exit(1);
        } finally {}
  
        if(args[1].equals("")) {
            System.err.println(" filename is empty.");
            System.exit(1);
        }

        int debugValue = 0;
        if(args.length == 3) {
            try {
                debugValue = Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                System.out.println("DEBUG_VALUE is not a number." 
                + " Range of DEBUG_VALUE is 0 to 2");
                return;
            } finally {
            }

            if(debugValue < 0 || debugValue > 2) {
                System.out.println("Invalid range. Range of DEBUG_VALUE is 0 to 2");
                return;
            }

        }
        //System.out.println("Debug value = " + debugValue);
        //System.out.println("Args length = " + args.length);
        if(debugValue == 0) {
            Logger.setDebugValue(LEVEL.LEVEL_NONE);
        } else if(debugValue == 1) {
            Logger.setDebugValue(LEVEL.LEVEL_CTOR);
        } else if(debugValue == 2) {
            Logger.setDebugValue(LEVEL.LEVEL_VISIT);
        }

        FileProcessorI fp = new FileProcessor(args[1]);
        Visitor populateVisitor = null;
        populateVisitor = new PopulateVisitor(fp); //, new FileProcessor(args[1]));

        Visiting vector = new MyVector();
        Visiting array = new MyArray();

        Visitor maxHeapVisitor = new MaxHeapVisitor(k);
        Visitor bubbleSortVisitor = new ModifiedBubbleSortVisitor(k);
         
        //todo build the two ADTs
        vector.accept(populateVisitor);

        fp = new FileProcessor(args[1]);
        populateVisitor = new PopulateVisitor(fp);
        array.accept(populateVisitor);

        vector.accept(maxHeapVisitor);
        array.accept(maxHeapVisitor);

        vector.accept(bubbleSortVisitor);
        array.accept(bubbleSortVisitor);
    }
}
