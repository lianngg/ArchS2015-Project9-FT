package models;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class NasaRegistrationTest {
	private static String TEST_USERNAME = "test_username";
	private static String TEST_PASSWORD = "test_password";
	private static String TEST_FIRSTNAME = "test_firstname";
	private static String TEST_LASTNAME = "test_lastname";
	private static String TEST_MNAME = "test_mname";
	private static String TEST_AFFLIATION = "test_affliation";
	private static String TEST_EMAIL = "test_email";
	private static String TEST_RESEATCHAREA = "test_researcharea";
	private static String TEST_GOAL = "test_goal";
	private static String TEST_ALGO = "test_algo";
	private static String TEST_BUDGETCONCERNS = "test_budgetconcerns";
	private static String TEST_AWSFAMILIARITY = "test_awsfamiliarity";
	
	private static NasaRegistration nasaRegistration1;
	private static NasaRegistration nasaRegistration2 = new NasaRegistration();
	
	@Before
	public void setUp() throws Exception{
		 nasaRegistration1 = new NasaRegistration(TEST_USERNAME, TEST_PASSWORD, TEST_FIRSTNAME, 
				 TEST_LASTNAME, TEST_EMAIL, TEST_RESEATCHAREA, 
				 TEST_GOAL, TEST_ALGO, TEST_BUDGETCONCERNS, TEST_AWSFAMILIARITY, TEST_MNAME, TEST_AFFLIATION);
		 nasaRegistration2.setAffliation(TEST_AFFLIATION);
			nasaRegistration2.setAlgo(TEST_ALGO);
			nasaRegistration2.setAwsFamiliarity(TEST_AWSFAMILIARITY);
			nasaRegistration2.setBudgetConcerns(TEST_BUDGETCONCERNS);
			nasaRegistration2.setEmail(TEST_EMAIL);
			nasaRegistration2.setfNameField(TEST_FIRSTNAME);
			nasaRegistration2.setGoal(TEST_GOAL);
			nasaRegistration2.setLastName(TEST_LASTNAME);
			nasaRegistration2.setPasswordField(TEST_PASSWORD);
			nasaRegistration2.setResearchArea(TEST_RESEATCHAREA);
			nasaRegistration2.setUserNameField(TEST_USERNAME);
	
	}
	
	@Test
	public void getter1(){
		assertEquals(TEST_USERNAME, nasaRegistration1.getUserNameField());
		assertEquals(TEST_PASSWORD, nasaRegistration1.getPasswordField());
		assertEquals(TEST_FIRSTNAME, nasaRegistration1.getfNameField());
		assertEquals(TEST_LASTNAME, nasaRegistration1.getLastName());
		assertEquals(TEST_AFFLIATION, nasaRegistration1.getAffliation());
		assertEquals(TEST_EMAIL, nasaRegistration1.getEmail());
		assertEquals(TEST_RESEATCHAREA, nasaRegistration1.getResearchArea());
		assertEquals(TEST_GOAL, nasaRegistration1.getGoal());
		assertEquals(TEST_ALGO, nasaRegistration1.getAlgo());
		assertEquals(TEST_BUDGETCONCERNS, nasaRegistration1.getBudgetConcerns());
		assertEquals(TEST_AWSFAMILIARITY, nasaRegistration1.getAwsFamiliarity());
	}
	
	@Test
	public void getter2(){
		assertEquals(TEST_USERNAME, nasaRegistration2.getUserNameField());
		assertEquals(TEST_PASSWORD, nasaRegistration2.getPasswordField());
		assertEquals(TEST_FIRSTNAME, nasaRegistration2.getfNameField());
		assertEquals(TEST_LASTNAME, nasaRegistration2.getLastName());
		assertEquals(TEST_AFFLIATION, nasaRegistration2.getAffliation());
		assertEquals(TEST_EMAIL, nasaRegistration2.getEmail());
		assertEquals(TEST_RESEATCHAREA, nasaRegistration2.getResearchArea());
		assertEquals(TEST_GOAL, nasaRegistration2.getGoal());
		assertEquals(TEST_ALGO, nasaRegistration2.getAlgo());
		assertEquals(TEST_BUDGETCONCERNS, nasaRegistration2.getBudgetConcerns());
		assertEquals(TEST_AWSFAMILIARITY, nasaRegistration2.getAwsFamiliarity());
	}
}
