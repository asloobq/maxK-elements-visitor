package maxKVisitors.util;

import java.util.Vector;

public class MyVector implements Visiting {

   private Vector<Integer> mVector;

   public MyVector() {
       mVector = new Vector<Integer>();
       Logger.getInstance().write(Logger.LEVEL.LEVEL_CTOR, getClass().getName() + " ctor");
   }

   public void accept(Visitor visitor) {
        visitor.visit(this);
    }

   public void add(Integer elem) {
        mVector.add(elem);
   }

    public Vector<Integer> getMyVector(){
        return mVector;
    }
}
