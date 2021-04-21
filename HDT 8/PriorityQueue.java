//Interfaz de priority Queue

public interface PriorityQueue<E extends Comparable<E>> {

    /**
     *
     * @return 
     */
    public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	
    /**
     *
     * @return 
     */
    public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	
    /**
     *
     * @param value
     */
    public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue
	
    /**
     *
     * @return 
     */
    public boolean isEmpty();
	// post: returns true iff no elements are in queue
	
    /**
     *
     * @return 
     */
    public int size();
	// post: returns number of elements within queue
	
    /**
     *
     */
    public void clear();
	// post: removes all elements from queue
}