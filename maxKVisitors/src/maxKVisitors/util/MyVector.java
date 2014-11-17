package maxKVisitors.util;

public class MyVector implements Visiting {

   public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
