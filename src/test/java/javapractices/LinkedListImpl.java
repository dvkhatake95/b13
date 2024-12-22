package javapractices;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(20);
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(null);

		Iterator<Integer> it = linkedList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
