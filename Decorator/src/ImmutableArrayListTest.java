import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class ImmutableArrayListTest {

	ArrayList<String> testArray;
	ImmutableArrayList<String> testImmutableArray;

	@Before
	public void setUp() throws Exception {
		testArray = new ArrayList<String>();
		testArray.add("Hello");
		testArray.add("Good day");
		testArray.add("Ciao");
		testArray.add("Aloha");

		testImmutableArray = new ImmutableArrayList<String>(testArray);
	}


	@Test
	public void testAddObject() {
		try {
			testImmutableArray.add("xin chao");
		}
		catch(UnsupportedOperationException E) {
			assertTrue(testImmutableArray.get(testImmutableArray.size()-1) != "xin chao" && testImmutableArray.size() == testArray.size());
		}
	}

	@Test
	public void testAddIntObject() {
		try {
			testImmutableArray.add(0,"xin chao");
		}
		catch(UnsupportedOperationException E) {
			assertTrue(testImmutableArray.get(0) == testArray.get(0) && testImmutableArray.size() == testArray.size());
		}
	}

	@Test
	public void testAddAllCollectionOfQextendsE() {
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("what's up");
		testList.add("hi");
		
		try {
			testImmutableArray.addAll(testList);
		}
		catch(UnsupportedOperationException E) {
			assertTrue(testImmutableArray.size() == testArray.size());
		}
	}

	@Test
	public void testAddAllIntCollectionOfQextendsE() {
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("what's up");
		testList.add("hi");
		
		try {
			testImmutableArray.addAll(0,testList);
		}
		catch(UnsupportedOperationException E) {
			assertTrue(testImmutableArray.size() == testArray.size());
		}
	}
	

	@Test
	public void testClear() {
		try {
			testImmutableArray.clear();
		}
		catch(UnsupportedOperationException E) {
			assertTrue(testImmutableArray.size() == testArray.size());
		}
	}

	@Test
	public void testRemoveInt() {
		try {
			testImmutableArray.remove(0);
		}
		catch(UnsupportedOperationException E) {
			assertTrue(testImmutableArray.get(0) == testArray.get(0) && testImmutableArray.size() == testArray.size());
		}
	}

	@Test
	public void testRemoveObject() {
		try {
			testImmutableArray.remove("Hello");
		}
		catch(UnsupportedOperationException E) {
			assertTrue(testImmutableArray.get(0) == testArray.get(0) && testImmutableArray.size() == testArray.size());
		}
	}

	@Test
	public void testRemoveAllCollectionOfQ() {
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("Hello");
		testList.add("Ciao");
		
		try {
			testImmutableArray.removeAll(testList);
		}
		catch(UnsupportedOperationException E) {
			assertTrue(testImmutableArray.size() == testArray.size());
		}
	}

	
	@Test
	public void testRemoveRange() {
		try {
			testImmutableArray.removeRange(0, 2);
		}
		catch(UnsupportedOperationException E) {
			assertTrue(testImmutableArray.size() == testArray.size());
		}
	}
	
	@Test
	public void testRetainAllCollectionOfQ() {
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("Hello");
		testList.add("Ciao");
		
		try {
			testImmutableArray.removeAll(testList);
		}
		catch(UnsupportedOperationException E) {
			assertTrue(testImmutableArray.size() == testArray.size());
		}
	}

	@Test
	public void testSetIntObject() {
		try {
			testImmutableArray.set(0, "Goodbye");
		}
		catch(UnsupportedOperationException E) {
			assertTrue(testImmutableArray.get(0) == testArray.get(0) && testImmutableArray.size() == testArray.size());
		}

	}

	@Test
	public void testSubListIntInt() {
		
	try {
		
		testImmutableArray.subList(0, 2).clear();
	}
	
	catch (UnsupportedOperationException E){
		assertTrue( testImmutableArray.size() == testArray.size());
	}
	}
}
