package lab9queue;

import java.util.ArrayList;

public class L_Queue extends Node{
	ArrayList<Node> queue=new ArrayList<Node>();
	private Node elemements[];
	private int head,tail,capacity,count;

	
	public L_Queue() {super();};
	
	public L_Queue(int x, double y, String z, ArrayList<Node> queue, Node[] elemements, int head, int tail,
			int capacity, int count) {
		super(x, y, z);
		this.queue = queue;
		this.elemements = elemements;
		this.head = head;
		this.tail = tail;
		this.capacity = capacity;
		this.count = count;
	}
	
	public ArrayList<Node> getQueue() {
		return queue;
	}
	public void setQueue(ArrayList<Node> queue) {
		this.queue = queue;
	}
	public Node[] getElemements() {
		return elemements;
	}
	public void setElemements(Node[] elemements) {
		this.elemements = elemements;
	}
	public int getHead() {
		return head;
	}
	public void setHead(int head) {
		this.head = head;
	}
	public int getTail() {
		return tail;
	}
	public void setTail(int tail) {
		this.tail = tail;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	public void enqueue(Node item) {
		queue.add(item);
		
	}
    public void dequeue(Node item) {
		
	}
    public void displayallelements() {
		
   	}
   public void sizeofqueue() {
		
   	}
	

}
