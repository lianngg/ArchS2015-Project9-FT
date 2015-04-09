package models;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NasaAWSFamiliarityTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAllMembersAreAsExpected() {
		List<String> list = NasaAWSFamiliarity.list();
		assertEquals(3, list.size());
		assertEquals("Beginner", list.get(0));
		assertEquals("Proficient", list.get(1));
		assertEquals("Expert", list.get(2));
	}

}
