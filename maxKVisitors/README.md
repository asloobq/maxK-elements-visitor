Project Description

The purpose of this assignment is to program with visitors.

1. Design a class FileProcessor.java that reads from the input file and returns one integer everytime the nextInt() method is called. Remember to convert the string in each line of the file to an integer.
2. The input integers should be stored in a file. Each line should have one integer. Assume that the input does not contain any duplicates.
3. Create two ADTs: MyVector and MyArray that internally store a vector of integers and an array (or arrayList) of integers respectively. Both these ADTs should be programmed to an interface with a method that adds an element at a time to the data structure. Design a visitor that reads from a file and populates an ADT. Apply the visitor to MyVector and then to MyArray. The visitor should use an instance of the FileProcessor class and its nextInt(..) method.
4. Create two more visitors to determine the max-K elements of the ADTs.
  -the first visitor creates a max-heap.
  -the second visitor uses a modified bubble sort (or any other method). It is acceptable for the bubble sort to modify the ordering in the original array/vector.
  -O(n^2) algorithms for visitors are not acceptable. x
  -Apply the two visitors to MyVector and MyArray. Create two instances of each of the two ADTs. So, each visitor is applied to a different instance.
  -The visitors should determine and then display the largest K elements on stdout.
5. Use a singleton Logger and design your own debugging scheme.
6. The driver should accept the input file name and the value of "K" via the command line.
