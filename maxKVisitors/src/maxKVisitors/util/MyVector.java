package maxKVisitors.util;

import java.util.Vector;

public class MyVector implements Visiting {

   private Vector<Integer> mVector;
	
	/**
	* Constructor
	*/
   public MyVector() {
       mVector = new Vector<Integer>();
       Logger.getInstance().write(Logger.LEVEL.LEVEL_CTOR, getClass().getName() + " ctor");
   }
	
	/**
	* @Return type: void
	*/
   public void accept(Visitor visitor) {
        visitor.visit(this);
    }
	
	/**
	* @Return type: void
	*/
   public void add(Integer elem) {
        mVector.add(elem);
   }
	
	/**
	* @Return type: Vector of integers
	*/
    public Vector<Integer> getMyVector(){
        return mVector;
    }
}
