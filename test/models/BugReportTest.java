package models;

import static org.junit.Assert.*;

import org.apache.commons.collections.BagUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BugReportTest {

	private static int TEST_ID = 1;
	private static String TEST_TITLE = "test_title";
	private static String TEST_EMAIL = "test_email";
	private static String TEST_NAME = "test_name";
	private static String TEST_ORGANIZATION = "test_organization";
	private static String TEST_DESCRIPTION = "test_description";
	private static int TEST_SOLVED = 1;
	
	private static BugReport bugReport = new BugReport();
	
	@BeforeClass
	public static void init1(){
		bugReport.setEmail(TEST_EMAIL);
		bugReport.setDescription(TEST_DESCRIPTION);
		bugReport.setId(TEST_ID);
		bugReport.setName(TEST_NAME);
		bugReport.setOrganization(TEST_ORGANIZATION);
		bugReport.setSolved(TEST_SOLVED);
		bugReport.setTitle(TEST_TITLE);
	}

	@Test
	public void test() {
		assertEquals(TEST_DESCRIPTION, bugReport.getDescription());
		assertEquals(TEST_EMAIL, bugReport.getEmail());
		assertEquals(TEST_ID, bugReport.getId());
		assertEquals(TEST_ORGANIZATION, bugReport.getOrganization());
		assertEquals(TEST_NAME, bugReport.getName());
		assertEquals(TEST_SOLVED, bugReport.getSolved());
		assertEquals(TEST_TITLE, bugReport.getTitle());
		
	}

}
