package com.capgemini;

//Java program to implement a queue using an array 
class QueueUsingArrays 
{ 
	private static int front, rear, capacity; 
	private static int queue[]; 

	QueueUsingArrays(int c) 
	{ 
		front = rear = 0; 
		capacity = c; 
		queue = new int[capacity]; 
	} 

	// function to insert an element 
	// at the rear of the queue 
	static void queueEnqueue(int data) 
	{ 
		// check queue is full or not 
		if (capacity == rear) { 
			System.out.printf("\nQueue is full\n"); 
			return; 
		} 

		// insert element at the rear 
		else { 
			queue[++rear] = data; 
			 
		} 
		return; 
	} 

	static void queueDequeue() 
	{ 
		// if queue is empty 
		if (front == rear) { 
			System.out.printf("\nQueue is empty\n"); 
			return; 
		} 
		else { 
			for (int i = 0; i < rear - 1; i++) { 
				queue[i] = queue[i + 1]; 
			} 

			// store 0 at rear indicating there's no element 
			if (rear < capacity) 
				queue[rear] = 0; 

			// decrement rear 
			rear--; 
		} 
		return; 
	} 

	// print queue elements 
	static void queueDisplay() 
	{ 
		int i; 
		if (front == rear) { 
			System.out.printf("\nQueue is Empty\n"); 
			return; 
		} 

		// traverse front to rear and print elements 
		for (i = front; i < rear; i++) { 
			System.out.printf(" %d <-- ", queue[i]); 
		} 
		return; 
	} 

	// print front of queue 
	static void queueFront() 
	{ 
		if (front == rear) { 
			System.out.printf("\nQueue is Empty\n"); 
			return; 
		} 
		System.out.printf("\nFront Element is: %d", queue[front]); 
		return; 
	} 
} 

public class Queue { 

	public static void main(String[] args) 
	{ 
		// Create a queue of capacity 4 
		QueueUsingArrays q = new QueueUsingArrays(4); 
 
		q.queueDisplay(); 
		q.queueEnqueue(20); 
		q.queueEnqueue(30); 
		q.queueEnqueue(40); 
		q.queueEnqueue(50); 
		q.queueDisplay(); 

		q.queueEnqueue(60); 
		q.queueDisplay(); 

		q.queueDequeue(); 
		q.queueDequeue(); 
		System.out.printf("\n\nafter two node deletion\n\n"); 

		// print Queue elements 
		q.queueDisplay(); 

		// print front of the queue 
		q.queueFront(); 
	} 
} 
