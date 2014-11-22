package maxKVisitors.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ModifiedBubbleSortVisitor implements Visitor {
    int k = 0;
    public ModifiedBubbleSortVisitor(int kin) {
        k = kin;
        Logger.getInstance().write(Logger.LEVEL.LEVEL_CTOR, getClass().getName() + " ctor");
    }

    public void visit(MyVector vector) {
        checkK(vector.getMyVector());
        System.out.println("Visiting Vector bubble sort ");
        Logger.getInstance().write(Logger.LEVEL.LEVEL_VISIT, getClass().getName() + " visit vector");
        List<Integer> list = new ArrayList<Integer>(vector.getMyVector());
        int count = k;
        for( int outer = list.size()-1; (outer >= 0) && (count > 0); outer--, count--){
            for( int inner = list.size()-1; inner > 0; inner--){

                if( list.get(inner) > list.get(inner-1)){
                    int temp = list.get(inner-1);
                    list.set(inner-1, list.get(inner));
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
        Logger.getInstance().write(Logger.LEVEL.LEVEL_VISIT, getClass().getName() + " visit array");
        if( k > array.getmArray().size()){
            System.out.println("Resetting k to " + array.getmArray().size());
            k = array.getmArray().size();
        }
        List<Integer> list = array.getmArray();
        int count = k;
        for( int outer = list.size()-1; (outer >= 0) && (count > 0) ; outer--, count--){
            for( int inner = list.size()-1; inner > 0; inner--){

                if( list.get(inner) > list.get(inner - 1)){
                    int temp = list.get(inner - 1);
                    list.set(inner - 1, list.get(inner));
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
