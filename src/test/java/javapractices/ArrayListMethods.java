package javapractices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

				// add elements or object
				arrayList1.add(10);

				ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
				arrayList2.add(20);
				arrayList2.add(15);
				arrayList2.add(20);
				arrayList2.add(100);
				arrayList2.add(50);
				arrayList2.add(60);
				arrayList2.add(10);

				// adding all elements from arrayList2 to arrayList
				arrayList1.addAll(arrayList2);

				for (Integer i : arrayList1) {
					System.out.println(i);
				}

				System.out.println("####################################################");

				System.out.println("Array List contains 50 = " + arrayList1.contains(50));
				System.out.println("Array List contains 500 = " + arrayList1.contains(500));

				System.out.println("######################################################");

				System.out.println("Array list1 conatins arrayList 2 = " + arrayList1.containsAll(arrayList2));

				System.out.println("######################################################");

				System.out.println(arrayList2.get(3));

				System.out.println("#######################################################");

				System.out.println("Index of 60 = " + arrayList2.indexOf(60));

				System.out.println("#######################################################");

				System.out.println("arrayList2 is empty = " + arrayList2.isEmpty());

				// arrayList2.clear();

				System.out.println("arrayList2 is empty = " + arrayList2.isEmpty());

				System.out.println("#########################################################");

				System.out.println("arrayList2 size = " + arrayList2.size());

				System.out.println("#########################################################");

				List<Integer> arrayList3 = arrayList2.subList(3, 6);

				for (Integer a : arrayList3) {
					System.out.println(a);
				}

				System.out.println("############################################################");

				arrayList2.set(3, 200);
				arrayList2.remove(6);

				for (Integer a : arrayList2) {
					System.out.println(a);
				}

				System.out.println("########################################################");

				Iterator<Integer> it = arrayList2.iterator();

				while (it.hasNext()) {
					System.out.println(it.next());
				}

				System.out.println("######################################################");

			

}

}
