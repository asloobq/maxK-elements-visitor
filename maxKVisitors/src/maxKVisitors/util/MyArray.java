package maxKVisitors.util;

public class MyArray implements Visiting {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
