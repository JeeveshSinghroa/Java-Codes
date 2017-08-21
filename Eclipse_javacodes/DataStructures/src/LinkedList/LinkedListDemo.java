package LinkedList;

public class LinkedListDemo 
{

	Node head;
	class Node 
	{
		int data;
		Node next;
		Node(int data) 
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void push(int new_data) 
	{
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	public void insertAfter(Node prev_node, int data) 
	{
		if(prev_node==null)
		{
			System.out.println("The given node can't be null");
			return;
		}
		Node new_node = new Node(data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
		
	}
	
	public void append(int data)
	{
		Node new_node = new Node(data);
		if(head==null)
		{
			head=new_node;
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=new_node;
		return;
	}
	
	public void printList()
	{
		Node tnode=head;
		while(tnode!=null)
		{
			System.out.print("[Data= "+tnode.data+"]-->");
			tnode=tnode.next;
		}
	}
	public static void main(String[] args) 
	{
		LinkedListDemo ll = new LinkedListDemo();
		ll.append(6);
		ll.push(7);
		ll.push(1);
		ll.insertAfter(ll.head.next, 8);
		System.out.println("Created Linked List is: ");
		ll.printList();
	}

}
