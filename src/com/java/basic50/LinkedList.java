package com.java.basic50;

public class LinkedList {
	
	Node head = null;
	
	class Node
	{
		int data;
		
		Node node;
		
		Node(int data)
		{
			this.data = data;
			this.node = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// addFirstNode
		//addLastNode
		// removeFirstNode
		//removeLastNode
		// displayList
		
		LinkedList ll = new LinkedList();
		ll.addFirstElement(10);
		ll.addFirstElement(20);
		ll.addLastElement(30);
		ll.displayList();

	}
	
	public void displayList()
	{
		if(head == null)
		{
			System.out.println("List is empty");			
		}
		else
		{
			Node tempNode = head;
			while(tempNode != null)
			{
				System.out.print(tempNode.data + " ");
				tempNode = tempNode.node;
				
			}
		}
	}
	
	public void addFirstElement(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			newNode.node = head;
			head = newNode;
		}
	}
	
	
	public void addLastElement(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node tempNode = head;
			while(tempNode.node != null)
			{
				tempNode = tempNode.node;
			}
			tempNode.node = newNode;
		}
	}

}
