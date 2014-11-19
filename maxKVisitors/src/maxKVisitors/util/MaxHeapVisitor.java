package maxKVisitors.util;

import java.util.List;
import java.util.Vector;

public class MaxHeapVisitor implements Visitor {
    int k = 0;
    public MaxHeapVisitor(int ink) {
        k = ink;
    }

    public void visit(MyVector vector) {
        System.out.println("Visiting vector in max-heap");
        Vector<Integer> myVector = vector.getMyVector();
        checkK( myVector);

        int initialSize = myVector.size(), tempK = k;
        for( int i = initialSize; tempK > 0 && i > 0; i--, tempK--){
            heapify(myVector, i);
            System.out.println( getMax(myVector, i));
        }
    }

    public void visit(MyArray array) {
        System.out.println("Visiting Array in max-heap");
        Vector<Integer> myVector = new Vector<>(array.getmArray());
        checkK( myVector);

        int initialSize = myVector.size(), tempK = k;
        for( int i = initialSize; tempK > 0 && i > 0; i--, tempK--){
            heapify(myVector, i);
            System.out.println( getMax(myVector, i));
        }
    }

    private void checkK( Vector<Integer> myVector){
        if( k > myVector.size() ){
            System.out.println("Resetting k to " + myVector.size());
            k = myVector.size();
        }
    }

    private int getMax(Vector<Integer> myVector, int heapSize){
        int max = myVector.get(0);
        myVector.set( 0 , myVector.get(heapSize-1));
        myVector.set( heapSize-1, max);
        return max;
    }

    private void heapify( Vector<Integer> myVector, int size){
        // (size-1)/2 because actual size doesn't start from index 0
        int left, right, max = 0, index;
        for( int i = (size-1)/2; i >= 0; i--){
            index = i;
            left = i*2+1;
            right = i*2+2;
            max = myVector.get(index);
            if( left< size && myVector.get(left) > max) {
                max = myVector.get(left);
                index = left;
            }
            if( right < size && myVector.get(right) > max){
                max = myVector.get(right);
                index = right;
            }
            if( index !=i){
                int temp = myVector.get(index);
                myVector.set(index, myVector.get(i));
                myVector.set(i, temp);
            }
        }
    }
}
