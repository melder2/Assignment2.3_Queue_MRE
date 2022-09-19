/**
 * 
 * @author Michael Elder
 * Assignment 2.3 Implementing a Queue
 * Application class creates a queue and then adds people to the queue with the enqueue and then removes
 * people from the queue with the dequeue method
 */
public class Application {

	public static void main(String[] args) {
		
		/**
		 * Creating a queue of strings called myQueue
		 */
		Queue<String> myQueue = new Queue<String>();
		
		/**
		 * Adding Bill, Alice, and Bob to the queue and then printing it out
		 */
		myQueue.enqueue("Bill");
		myQueue.enqueue("Alice");
		myQueue.enqueue("Bob");
		System.out.println(myQueue);
		
		/**
		 * Customer was served so I delete them from the queue and print the queue
		 */
		myQueue.dequeue();
		System.out.println(myQueue);
		
		/**
		 * Two more people are added to the queue and then print the queue
		 */
		myQueue.enqueue("Jane");
		myQueue.enqueue("Hamad");
		System.out.println(myQueue);
		
		/**
		 * Two people were served so they are deleted and then the queue is printed
		 */
		myQueue.dequeue();
		myQueue.dequeue();
		System.out.println(myQueue);
		
		/**
		 * Adding Jim to the queue and printing it out
		 */
		myQueue.enqueue("Jim");
		System.out.println(myQueue);
		
		/**
		 * Removing two people from the queue and printing it out
		 */
		myQueue.dequeue();
		myQueue.dequeue();
		System.out.println(myQueue);
	}//end main

}//end class
