package maxKVisitors.util;

import java.util.ArrayList;

public class MyArray implements Visiting {

    private ArrayList<Integer> mArray;

		/*
		* Constructor
		*/
    public MyArray() {
       mArray = new ArrayList<Integer>();
       Logger.getInstance().write(Logger.LEVEL.LEVEL_CTOR, getClass().getName() + " ctor");
    }
	
		/*
		* @Return Type: void
		*/
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
		
		/*
		* @Return Type: void
		*/
   public void add(Integer elem) {
       mArray.add(elem);
   }

		/*
		* @Return Type: Array list of integers 
		*/
    public ArrayList<Integer>getmArray(){
        return mArray;
    }
}
