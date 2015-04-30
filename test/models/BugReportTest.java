package models;

import static org.junit.Assert.*;

import java.sql.Date;

import org.apache.commons.collections.BagUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class BugReportTest {

	private static int TEST_ID = 1;
	private static String TEST_TITLE = "test_title";
	private static String TEST_EMAIL = "test_email";
	private static String TEST_NAME = "test_name";
	private static String TEST_ORGANIZATION = "test_organization";
	private static String TEST_DESCRIPTION = "test_description";
	private static int TEST_SOLVED = 1;
	
	private static Date date1;
	private static Date date2;
	
	private static BugReport bugReport;
	private static BugReport bugReport1;
	
	@Before
	public void setUp() throws Exception{
		bugReport = new BugReport();
		date1 = new Date(0);
		date2 = new Date(0);
		bugReport1 = new BugReport(TEST_TITLE, TEST_EMAIL, TEST_NAME, TEST_ORGANIZATION, TEST_DESCRIPTION, TEST_SOLVED, date1, date2);
	}
	
	@Test
	public void test1(){
		bugReport.setEmail(TEST_EMAIL);
		assertEquals(TEST_EMAIL, bugReport.getEmail());

	}
	
	@Test
	public void test2(){
		bugReport.setDescription(TEST_DESCRIPTION);
		assertEquals(TEST_DESCRIPTION, bugReport.getDescription());

	}
	
	@Test
	public void test3(){
		bugReport.setId(TEST_ID);
		assertEquals(TEST_ID, bugReport.getId());

	}
	
	@Test
	public void test4(){
		bugReport.setName(TEST_NAME);
		assertEquals(TEST_NAME, bugReport.getName());

	}
	
	@Test
	public void test5(){
		bugReport.setOrganization(TEST_ORGANIZATION);
		assertEquals(TEST_ORGANIZATION, bugReport.getOrganization());

	}
	
	@Test
	public void test6(){
		bugReport.setSolved(TEST_SOLVED);
		assertEquals(TEST_SOLVED, bugReport.getSolved());

	}
	
	@Test
	public void test7(){
		bugReport.setTitle(TEST_TITLE);
		assertEquals(TEST_TITLE, bugReport.getTitle());	

	}


}
