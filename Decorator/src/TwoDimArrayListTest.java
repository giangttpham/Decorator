import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class TwoDimArrayListTest {

	ArrayList<String> testArray;
	TwoDimArrayList<String> test2DArray;
	
	@Before
	public void setUp() throws Exception {
		testArray = new ArrayList<String>();
		
		testArray.add("00");
		testArray.add("10");
		testArray.add("20");
		testArray.add("01");
		testArray.add("11");
		testArray.add("21");
		
		test2DArray = new TwoDimArrayList<String>(testArray,3);
	}

	@Test
	public void testComposedConsturctor(){
		ImmutableArrayList newImmuList = new ImmutableArrayList(testArray);
		TwoDimArrayList composed2DArray = new TwoDimArrayList<String>(newImmuList,3);
		
		assertTrue(composed2DArray.size() == 6);
	}
	
	@Test
	public void testGetIntInt() {
		String value = test2DArray.get(2, 1);
		assertTrue (value.equals("21") );
	}

	@Test
	public void testSetIntIntE() {
		test2DArray.set(1, 1, "testing");
		assertTrue (test2DArray.get(1, 1) == "testing");
	}

}
