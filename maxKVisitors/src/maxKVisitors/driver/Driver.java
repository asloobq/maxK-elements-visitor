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

public class Driver {

    public static void main(String args[]) {
        if( args.length != 2){
            System.err.println("Please enter only 2 arguments <filename> <k>");
            System.exit(1);
        }

        int k = 0;
        try{
            k = Integer.parseInt( args[0]);
        }catch (Exception e){
            e.printStackTrace();
        }

        FileProcessorI fp = new FileProcessor(args[1]);
        Visitor populateVisitor = null;
        populateVisitor = new PopulateVisitor(fp, new FileProcessor(args[1]));
//        fp.nextInt();

        Visiting vector = new MyVector();
        Visiting array = new MyArray();

        Visitor maxHeapVisitor = new MaxHeapVisitor(k);
        Visitor bubbleSortVisitor = new ModifiedBubbleSortVisitor(k);
         
        //todo build the two ADTs
        vector.accept(populateVisitor);
        array.accept(populateVisitor);

        vector.accept(maxHeapVisitor);
        array.accept(maxHeapVisitor);

        vector.accept(bubbleSortVisitor);
        array.accept(bubbleSortVisitor);
    }
}
