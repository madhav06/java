//LINKED LIST TRAVERSAL
package com.linkedlist.geeksforgeeks.com;

class LinkedList {
	Node head; // head of list
	
	/*Linked list Node. this inner class is made static so that main() can access it. */
	static class Node{
		int data;
		Node next;
		Node(int d){data=d; next=null;}
	}
	/* this function prints contents of the linked list starting from head  */
	public void printList()
	{
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" ");
			n = n.next;
			
		}
	}
	/* starts with the empty list.  */
	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		llist.head.next = second; // Link first node with the second node
		second.next = third; //Link second node with the third node
		third.next = fourth; // Link third  node with the fourth node
		
		llist.printList();
	}

}
