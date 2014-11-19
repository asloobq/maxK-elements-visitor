package maxKVisitors.util;

import java.io.IOException;

public class PopulateVisitor implements Visitor {

    private FileProcessorI mFileProcessor, mFileProcessorForArray;

    public PopulateVisitor(FileProcessorI fileProcessorIn, FileProcessor fileProcessorIn2) {
        mFileProcessor = fileProcessorIn;
        mFileProcessorForArray = fileProcessorIn2;
    }

    public void visit(MyVector vector) {
        Integer input = null;
        try {
            input = mFileProcessor.nextInt();
            while(input != null) {
                vector.add(input);
                input = mFileProcessor.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void visit(MyArray array) {
        Integer input = null;
        try {
            input = mFileProcessorForArray.nextInt();
            while(input != null) {
                array.add(input);
                input = mFileProcessorForArray.nextInt();
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
