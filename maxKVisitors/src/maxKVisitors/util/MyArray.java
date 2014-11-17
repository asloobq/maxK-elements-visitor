package maxKVisitors.util;

import java.util.ArrayList;

public class MyArray implements Visiting {

    ArrayList<Integer> mArray;

    public MyArray() {
       mArray = new ArrayList<Integer>();
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

   public void add(Integer elem) {
       mArray.add(elem);
   }

}
