/**
 * 
 * @author Michael Elder
 * Assignment 2.3 Implementing a Queue
 * Queue class 
 */
public class Queue <T> {
	
	/**
	 * Creating nodes for front and rear with type GenericNode<T>
	 */
	GenericNode<T> front;
	GenericNode<T> rear;
	
	/**
	 * Setting front and rear initially to null
	 */
	public Queue(){
		front = null;
		rear = null;
		
	}//end empty argument constructor
	
	/**
	 * Enqueue method adds a person to the queue
	 * @param key
	 */
	public void enqueue(String key) {
		GenericNode<T> t = new GenericNode<T>();
		if (rear == null) 
		{
			front = t;
			rear = t;
			return;
		}
		rear.setNextNode(t);
		rear = t;
		}//end enqueue method
	
	/**
	 * Dequeue method delete a person from the queue
	 */
	public void dequeue() {
		if (front == null)
			return;
	
		front = front.getNextNode();
		
		if(front == null) 
			rear = null;
	}//end dequeue method

	@Override
	public String toString() {
		return "Queue [front=" + front + ", rear=" + rear + "]";
	}//end toString
	
}//end class
