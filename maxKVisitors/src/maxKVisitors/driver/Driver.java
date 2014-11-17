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
        FileProcessorI fp = new FileProcessor("");
        Visitor populateVisitor = null; 
        try {
            populateVisitor = new PopulateVisitor(fp);
            fp.nextInt();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Visiting vector = new MyVector();
        Visiting array = new MyArray();

        Visitor maxHeapVisitor = new MaxHeapVisitor();
        Visitor bubbleSortVisitor = new ModifiedBubbleSortVisitor();
         
        //build the two ADTs
        vector.accept(populateVisitor);
        array.accept(populateVisitor);

        vector.accept(maxHeapVisitor);
        array.accept(maxHeapVisitor);

        vector.accept(bubbleSortVisitor);
        array.accept(bubbleSortVisitor);
    }
}
