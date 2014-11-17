package maxKVisitors.util;

import java.io.IOException;

public class PopulateVisitor implements Visitor {

    private FileProcessorI mFileProcessor;

    public PopulateVisitor(FileProcessorI fileProcessorIn) {
        mFileProcessor = fileProcessorIn;
    }

    public void visit(MyVector vector) {
        Integer input = null;
        try {
            input = mFileProcessor.nextInt();
            while(input != null) {
                vector.add(input);
                input = mFileProcessor.nextInt();
            }
        } catch (IOException e) {
            System.exit(1);
        }
    }

    public void visit(MyArray array) {
        Integer input = null;
        try {
        input = mFileProcessor.nextInt();
        while(input != null) {
            array.add(input);
            input = mFileProcessor.nextInt();
        }
        } catch (IOException e) {
            System.exit(1);
        }
    }
}
