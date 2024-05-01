package customintegerarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomIntegerArrayListTest {

	@Test
	void testGetArrayList() {
		
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst1, arr1.getArrayList());

		ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
		arr4Elements.add(100);
		arr4Elements.add(200);
		arr4Elements.add(500);
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(100);
		lst4.add(200);
		lst4.add(500);

		assertEquals(lst4, arr4.getArrayList());
		
		// TODO write at least 3 additional test cases 
		assertEquals(arr4Elements, lst4);
		
		assertNotEquals(arr1.getArrayList(), arr4Elements);
		
		assertNotEquals (lst1, lst4);
	}

	@Test
	void testGet() {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(4);
		arr2.add(0,3);
		arr2.add(1,1);
		arr2.add(2,9);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(4);
		lst2.add(0,3);
		lst2.add(1,1);
		lst2.add(2,9);
		
		assertEquals(lst2.get(0), arr2.get(0));
		assertEquals(lst2.get(1), arr2.get(1));
		assertEquals(lst2.get(2), arr2.get(2));
		
	}

	@Test
	void testAddInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 
		
		arr1.add(5);
		arr1.add(6);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(5, arr1.get(3));
		assertEquals(5, lst1.get(3));
		assertEquals(arr1.get(4), lst1.get(4));
		
	}

	@Test
	void testAddIntInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(1, 3);
		arr1.add(2, 4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(1, 3);
		lst1.add(2, 4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 	
		arr1.add(3, 5);
		arr1.add(4, 6);
		lst1.add(3, 5);
		lst1.add(4, 6);
		
		assertEquals(5, arr1.get(3));
		assertEquals(5, lst1.get(3));
		assertEquals(arr1.get(4), lst1.get(4));
		
	}

	@Test
	void testRemoveInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(1, 3);
		arr1.add(2, 4);
		arr1.remove(0);
		arr1.remove(1);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(1, 3);
		lst1.add(2, 4);
		lst1.remove(0);
		lst1.remove(1);
		
		assertEquals(lst1.get(0), arr1.get(0));

		// TODO write at least 3 additional test cases 
		assertEquals(3, arr1.get(0));
		assertEquals(3, lst1.get(0));
		assertNotEquals(lst1.size(), 2);
		assertEquals(lst1.size(), 1);
		
	}

	@Test
	void testRemoveIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(1, 3);
		arr1.add(2, 3);
		arr1.add(3, 3);
		arr1.add(4, 3);
		arr1.add(5, 4);
		arr1.remove(3, 3);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(1, 3);
		lst1.add(2, 4);

		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 5);
		arr2.add(1, 6);
		arr2.add(2, 7);
		arr2.add(3, 7);
		arr2.add(4, 7);
		arr2.add(5, 8);
		arr2.remove(2, 7);
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 5);
		lst2.add(1, 6);
		lst2.add(2, 7);
		lst2.add(3, 8);
		
		assertEquals(lst2, arr2.getArrayList());
	
		arr2.remove(1, 5);
		assertNotEquals(lst2, arr2.getArrayList());
		
		lst2.remove(0);
		assertEquals(lst2, arr2.getArrayList());
		
		
		
	}

	@Test
	void testSpliceIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 2);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals(lst1.get(0), arr1.get(0));
		assertEquals(lst1.get(1), arr1.get(1));
		assertEquals(lst1.get(2), arr1.get(2));

		// TODO write at least 3 additional test cases 
		
		assertEquals(arr1.getArrayList(), lst1);
		
		arr1.splice(1,1);
		assertNotEquals(arr1.getArrayList(), lst1);
		
		lst1.remove(1);
		assertEquals(arr1.getArrayList(), lst1);
		
	}

	@Test
	void testSpliceIntIntIntArray() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 1, new int[] { 4, 5 });
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr2.add(6);
		arr2.splice(3, 3, new int[] { 5, 6 });
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(2);
		lst2.add(3);
		lst2.add(4);
		lst2.add(5);
		lst2.add(6);
		
		assertEquals(lst2, arr2.getArrayList());
		
		arr2.splice(0, 2, new int[] { 2,3 });
		assertEquals(lst2, arr2.getArrayList());
	
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(1);
		lst3.add(5);
		lst3.add(6);
		arr2.splice(0, 3, new int[] { 1 });
		
		assertEquals(lst3, arr2.getArrayList());
		
	}

}
