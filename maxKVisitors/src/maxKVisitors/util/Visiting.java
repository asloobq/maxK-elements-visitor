package maxKVisitors.util;

public interface Visiting {

    public void accept(Visitor visitor);

    public void add(Integer elem);
}
