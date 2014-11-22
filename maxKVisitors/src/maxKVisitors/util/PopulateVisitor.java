package maxKVisitors.util;

import java.io.IOException;

public class PopulateVisitor implements Visitor {

    private FileProcessorI mFileProcessor;//, mFileProcessorForArray;

    public PopulateVisitor(FileProcessorI fileProcessorIn ) { //, FileProcessor fileProcessorIn2) {
        mFileProcessor = fileProcessorIn;
//        mFileProcessorForArray = fileProcessorIn2;
        Logger.getInstance().write(Logger.LEVEL.LEVEL_CTOR, "FileProcessor ctor");
    }

//    public void setFile(FileProcessorI fileProcessorIn) {
//        mFileProcessor = fileProcessorIn;
//    }

    public void visit(MyVector vector) {
        Logger.getInstance().write(Logger.LEVEL.LEVEL_VISIT, getClass().getName() + " visit vector");
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
        Logger.getInstance().write(Logger.LEVEL.LEVEL_VISIT, getClass().getName() + " visit array");
        Integer input = null;
        try {
            input = mFileProcessor.nextInt();
            while(input != null) {
                array.add(input);
                input = mFileProcessor.nextInt();
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
