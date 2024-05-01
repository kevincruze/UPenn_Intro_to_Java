package arrayandarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {

	// declare myArrayAndArrayList which is the object for testing
	ArrayAndArrayList myArrayAndArrayList;
	
	@BeforeEach
	void setUp() throws Exception {
		// initialize myArrayAndArrayList for testing
		this.myArrayAndArrayList = new ArrayAndArrayList();
	}
	
	/**
	 * Test howMany method in ArrayAndArrayList.
	 */
	@Test
	void testHowMany() {
		// element in the array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));
		
		// TODO write at least 3 additional test cases
		
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 3));
		
		assertNotEquals(3, this.myArrayAndArrayList.howMany(array, 9));
		
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 5));
		
	}
	
	/**
	 * Test findMax method in ArrayAndArrayList.
	 */
	@Test
	void testFindMax() {
		// findMax in an nonEmpty array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(9, this.myArrayAndArrayList.findMax(array));
		
		// TODO write at least 3 additional test cases 
		int[] array2 = {1, 3, 35, 7, 19, 1, 2, 23, 4, 5};
		int[] array3 = {122, 313, 353, 733, 192, 152, 221, 23, 445, 522};
		
		assertEquals(35, this.myArrayAndArrayList.findMax(array2));
		
		assertNotEquals(7, this.myArrayAndArrayList.findMax(array));
		
		assertEquals(733, this.myArrayAndArrayList.findMax(array3));
	}

	/**
	 * Test maxArray method in ArrayAndArrayList.
	 */
	@Test
	void testMaxArray() {
		// test a valid array. 
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		ArrayList<Integer> testArrayList = new ArrayList<Integer>();
		testArrayList.add(9);
		assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));
		
		// TODO write at least 3 additional test cases 
		
		assertNotEquals(7, this.myArrayAndArrayList.maxArray(array));
		
		int [] array2 = {9, 14, 12, 44, 39, 20};
		ArrayList<Integer> testArrayList2 = new ArrayList<Integer>();
		testArrayList2.add(44);
		assertEquals(testArrayList2, this.myArrayAndArrayList.maxArray(array2));
		
		assertNotEquals(testArrayList2, this.myArrayAndArrayList.maxArray(array));
		assertNotEquals(testArrayList, this.myArrayAndArrayList.maxArray(array2));
		
	}

	/**
	 * Test swapZero method in ArrayAndArrayList.
	 */
	@Test
	void testSwapZero() {
		// test an array containing 0
		int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
		int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
		assertNotEquals(testArray, array);
		
		int[] copyA= array;
		assertArrayEquals(copyA,array);
		
		ArrayAndArrayList.swapZero(array);
		assertArrayEquals(testArray, array);
		
		assertArrayEquals(copyA, testArray);
		
		int [] array2 = {5, 0, 0, 0, 3, 4};
		ArrayAndArrayList.swapZero(array2);
		int[] testArray2 = {5, 3, 4, 0, 0, 0};
		assertArrayEquals(testArray2, array2);
	
		
	
	}
}