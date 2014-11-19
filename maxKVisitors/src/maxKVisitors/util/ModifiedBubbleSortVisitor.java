package maxKVisitors.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ModifiedBubbleSortVisitor implements Visitor {
    int k = 0;
    public ModifiedBubbleSortVisitor(int kin) {
        k = kin;
    }

    public void visit(MyVector vector) {
        checkK(vector.getMyVector());
        System.out.println("Visiting Vector bubble sort ");
        List<Integer> list = new ArrayList<>(vector.getMyVector());
        for( int outer = 0; outer < list.size() ; outer++){
            for( int inner = 0; inner < list.size()-1; inner++){
                if( list.get(inner) < list.get(inner+1)){
                    int temp = list.get(inner+1);
                    list.set(inner+1, list.get(inner));
                    list.set(inner, temp);
                }
            }
        }
        for( int i= 0; i< k; i++){
            System.out.println(list.get(i));
        }
    }

    public void visit(MyArray array) {
        System.out.println("Visiting array bubble sort");
        if( k > array.getmArray().size()){
            System.out.println("Resetting k to " + array.getmArray().size());
            k = array.getmArray().size();
        }
        List<Integer> list = array.getmArray();
        for( int outer = 0; outer < list.size() ; outer++){
            for( int inner = 0; inner < list.size()-1; inner++){
                if( list.get(inner) < list.get(inner+1)){
                    int temp = list.get(inner+1);
                    list.set(inner+1, list.get(inner));
                    list.set(inner, temp);
                }
            }
        }
        for( int i= 0; i< k; i++){
            System.out.println(list.get(i));
        }
    }

    private void checkK( Vector<Integer> myVector){
        if( k > myVector.size() ){
            System.out.println("Resetting k to " + myVector.size());
            k = myVector.size();
        }
    }
}
