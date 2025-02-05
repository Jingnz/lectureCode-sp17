/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    private int size;
    private int[] items;

    /** Creates an empty list. */
    public AList() {
        items = new int[100];
        size = 0;
    }
    /** Resizes the array to the target capacity.*/
    private void resize(int capacity){
        int[]a = new int[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }
    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if(items.length == size){
            resize(size+1);
        }
        items[size] = x;
        size ++;
    }
    /** Returns the item from the back of the list. */
    public int getLast() {
        return items[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];
    }
    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }
    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int x = getLast();
        size --; //don't need to do anything to destroy the last item, it's there ,but not really there.
        return x;
    }
} 