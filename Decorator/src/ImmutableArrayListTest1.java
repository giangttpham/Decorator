import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class ImmutableArrayListTest1 {

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
	public void testClear() {
		try {
			testImmutableArray.clear();
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
		public void testAddObject() {
			fail("Not yet implemented");
		}
	
		@Test
		public void testRemoveObject() {
			fail("Not yet implemented");
		}
	
		@Test
		public void testAddAllCollection() {
			fail("Not yet implemented");
		}
	
		@Test
		public void testAddAllIntCollection() {
			fail("Not yet implemented");
		}
	
		@Test
		public void testRemoveAllCollection() {
			fail("Not yet implemented");
		}
	
		@Test
		public void testRetainAllCollection() {
			fail("Not yet implemented");
		}
	
		@Test
		public void testSetIntObject() {
			fail("Not yet implemented");
		}
	
		@Test
		public void testAddIntObject() {
			fail("Not yet implemented");
		}
	
		@Test
		public void testRemoveInt() {
			fail("Not yet implemented");
		}

}
