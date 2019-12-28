import java.util.ArrayList;
import java.util.Scanner;

public class Node {
	public int x;
	public double y;
	public String z;
	public Node()
	{
		
	}
	public Node(int x, double y, String z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public int getX(int i) {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY(double d) {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getZ(String string) {
		return z;
	}
	public void setZ(String z) {
		this.z = z;
	}

	
	public String toString() {
		return "Node [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	

}

class L_Queue extends Node
{
	ArrayList<Node> Node = new ArrayList<Node>();
	public int head,tail,capacity,count;
	public L_Queue()
	{
		
	}
	
	
	
	public L_Queue(ArrayList<Node> node, int head, int tail, int capacity, int count) {
		super();
		Node = node;
		this.head = head;
		this.tail = tail;
		this.capacity = capacity;
		this.count = count;
	}
	



	public ArrayList<Node> getNode() {
		return Node;
	}



	public void setNode(ArrayList<Node> node) {
		Node = node;
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



	public void enqueue(Node item)
	{
		Node.add(item);
		System.out.println(Node.get(0));
	}
	public void dequeue()
	{
	     Node.remove(0);
		
	}
	public void displayAllElements()
	{
		for(int y=0;y<Node.size();y++) {
			System.out.println(Node.get(y));
		}
			
		
	}
	public void sizeOfqueue()
	{
		System.out.println("size:"+Node.size());
		
	}
	
}
class testQueue
{
	public static void main(String args[])
	{
		boolean kontrol=true;
		Node headnode,tailnode;
		int secim;
		Node nd = new Node();
		L_Queue l = new L_Queue();
		final int boyut=0;
	
		
		while(kontrol==true) {
			System.out.println("1:create a queue");
			System.out.println("2:enque");
			System.out.println("3:deque");
			System.out.println("4:display all");
			System.out.println("5:size of queue");
			System.out.println("6:exit");
			Scanner scn=new Scanner(System.in);
			secim=scn.nextInt();
			switch(secim) {
			case 1:
			{
				System.out.println("enter a capacity");
				l.setCapacity(scn.nextInt());
				break;
							
			}
			case 2:
			{
				System.out.println("enter integer");
				nd.setX(scn.nextInt());
				System.out.println("enter double");
				nd.setY(scn.nextDouble());
				System.out.println("enter string");
				nd.setZ(scn.next());
				l.enqueue(nd);
				break;
				
			}
			case 4:{
			l.displayAllElements();
			break;
				
			}
			case 3:{
				System.out.println("dequeed");
				l.dequeue();
				break;
			}
			case 5:{
				l.sizeOfqueue();
				break;
			}
			case 6:{
				kontrol=false;
				break;
				
			}
				
				
			
		}
		
		
	}
}
}