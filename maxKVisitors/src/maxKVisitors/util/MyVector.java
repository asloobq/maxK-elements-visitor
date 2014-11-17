package maxKVisitors.util;

import java.util.Vector;

public class MyVector implements Visiting {

   Vector<Integer> mVector;

   public MyVector() {
       mVector = new Vector<Integer>();
   }

   public void accept(Visitor visitor) {
        visitor.visit(this);
    }

   public void add(Integer elem) {
        mVector.add(elem);
   }

}
