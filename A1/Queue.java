package eecs2011;

public interface Queue<E> {
	/** Returns the number of elements in the queue */
	public int size();
	
	/** Tests whether the queue is empty */
	public boolean isEmpty();
	
	/** Returns the element at the front without removing it (null if empty) */
	public Object front();
	
	/** Inserts an element at the end of the queue */
	public void enqueue(E e);
	
	/** Removes and returns the element at the front of the queue (null if empty) */
	public Object dequeue();
}