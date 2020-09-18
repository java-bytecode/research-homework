/**
 * 
 */
package collectionsPractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author CyberxNuke
 *
 */
public class ArrayListProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Double> arrList = new ArrayList<Double>();
		ArrayList<Double> arrList2 = new ArrayList<Double>();
		Object arrList3 = new ArrayList<Double>();
		
		
		arrList.add(2.1);
		arrList2.add(1.2);
		arrList2.add(7.1);
		arrList.addAll(arrList2);
		arrList.remove(1);
		
		Iterator itr = arrList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	//	arrList3 = arrList.clone();

		System.out.println(arrList2.contains(1.2));
		System.out.println(arrList2.contains(1));
		
/*
 * 
 * ConcurrentModificationException. Do I need to declare/initialize new iterator every time?
 * 
 */
//		arrList.clear();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		System.out.println();
		
/*
 * LinkedList
 */
	
		
		LinkedList<String> lList = new LinkedList<>();
		lList.add("Hello");
		lList.addLast("World!");
		lList.add("x");
		lList.add("x");
		System.out.println(lList.peek());
		System.out.println(lList.peekFirst());
		System.out.println(lList.lastIndexOf("x"));
		System.out.println(lList.pop());
		System.out.println(lList.pollFirst());
		System.out.println(lList.peek());
		System.out.println(lList.peekLast());
		System.out.println(lList.size());
		
		Iterator itr2 = lList.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		// Why infinite loop?
		
		//System.out.println(lList.iterator().hasNext());
		
//		while(lList.iterator().hasNext()) {
//			System.out.println(lList.iterator().next());
//		}
		
		System.out.println();
		
/*
 * Stack
 */
		
		Stack<Integer> stack = new Stack<>(); // LIFO
		
		stack.push(1);
		stack.add(2); // Difference?
		stack.push(3);
		stack.pop();
		stack.push(4);
		stack.push(5);
		
		for(int element: stack) {
			System.out.println(element);
		}
		
		System.out.println();
		
		/**
		 * Priority Queue
		 * 	
		 */
			
			PriorityQueue<Integer> pQueue = new PriorityQueue<>();
			
			pQueue.add(1);
			pQueue.add(2);
			pQueue.add(3);
			pQueue.add(4);
			pQueue.add(5);
			
			System.out.println(pQueue.element());
			System.out.println(pQueue.peek());
			System.out.println(pQueue.remove(1));
			System.out.println(pQueue.poll());
			System.out.println(pQueue.toString());
			
			System.out.println();
			
			/*
			 * Array Dequeue: Similar to LinkedList
			 */
			
			ArrayDeque aDeque = new ArrayDeque();
			ArrayDeque aDequeIntentionallyEmpty = new ArrayDeque(); 
			
			aDeque.add(1);
			aDeque.addLast("Hello World!");
			aDeque.add(1);
			
			System.out.println(aDeque.element());
			
			try {
			System.out.println(aDequeIntentionallyEmpty.element());
			
			} catch(Exception e) {
				System.out.print("Intentionally printing this exception! ");
				System.out.println(e.fillInStackTrace());
			}
		
			System.out.println(aDequeIntentionallyEmpty.peek());
			System.out.println(aDequeIntentionallyEmpty.peekFirst());
			System.out.println(aDequeIntentionallyEmpty.peekLast());
			try {
				System.out.println(aDequeIntentionallyEmpty.remove());
			} catch (Exception e) {
				System.out.print("Intentionally printing this exception! ");
				System.out.println(e.fillInStackTrace());
			}
			
			System.out.println(aDequeIntentionallyEmpty.poll());
			
			System.out.println(aDeque.removeLastOccurrence(1));
			
			System.out.println(aDeque.getLast());
			
			System.out.println();
			
			/*
			 * HashSet
			 */
			
			HashSet<String> hashSet = new HashSet<>();
			
			hashSet.add("Apple");
			hashSet.add("Apple");
			hashSet.add("Watch 6");
			hashSet.add(null);
			hashSet.add(null);
			hashSet.add("Microsoft");
			
			Iterator itrHashSet = hashSet.iterator();
			while(itrHashSet.hasNext()) {
				System.out.println(itrHashSet.next());
			}
			
		}

}
