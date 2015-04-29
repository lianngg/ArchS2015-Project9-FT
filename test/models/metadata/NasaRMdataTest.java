package models.metadata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class NasaRMdataTest {

	private static NasaRMdata nasaRMdata;
	private static NasaRMdata nasaRMdata1;
	
	private static String USER_NAME_FIELD = "userNameField";
	private static String PASSWORD_FIELD = "passwordField";
	private static String F_NAME_FIELD = "fNameField";
	private static String L_NAME_FIELD = "lNameField";
	private static String M_NAME_FIELD = "mNameField";
	private static String AFFLIATION_FIELD = "affliationField";
	private static String EMAIL_FIELD = "emailField";
	private static String R_AREA_FIELD = "rAreaField";
	private static String GOAL_FIELD = "goalField";
	private static String ALGO_FIELD = "algoField";
	private static String B_CONCERNS_FIELD = "bConcernsField";
	private static String AWS_FAMILIARITY_FIELD = "awsFamiliarityField";

	private static List<String> sensorTypeNames = new ArrayList<String>();

	public void init(){
		nasaRMdata = new NasaRMdata(USER_NAME_FIELD, PASSWORD_FIELD, F_NAME_FIELD,
				L_NAME_FIELD, M_NAME_FIELD, AFFLIATION_FIELD, EMAIL_FIELD, R_AREA_FIELD,
				GOAL_FIELD, ALGO_FIELD, B_CONCERNS_FIELD, AWS_FAMILIARITY_FIELD);
		sensorTypeNames.add("a");
		sensorTypeNames.add("b");
		nasaRMdata1 = new NasaRMdata();
	}
	
	@Before
	public void setUp() throws Exception{
		init();
	}
	
	@After
	public void tearDown() throws Exception{}
	
	@Test
	public void test1(){
		assertEquals(USER_NAME_FIELD, nasaRMdata.getUserNameField());
	}
	
	@Test
	public void test2(){
		assertEquals(M_NAME_FIELD, nasaRMdata.getmNameField());
	}
	
	@Test
	public void test3(){
		assertEquals(GOAL_FIELD, nasaRMdata.getGoalField());
	}
	
	@Test
	public void test4(){
		assertEquals(PASSWORD_FIELD, nasaRMdata.getPasswordField());
	}
	
	@Test
	public void test5(){
		assertEquals(F_NAME_FIELD, nasaRMdata.getfNameField());
	}
	
	@Test
	public void test6(){
		assertEquals(L_NAME_FIELD, nasaRMdata.getlNameField());
	}
	
	@Test
	public void test7(){
		assertEquals(AFFLIATION_FIELD, nasaRMdata.getAffliationField());
	}
	
	@Test
	public void test8(){
		assertEquals(EMAIL_FIELD, nasaRMdata.getEmailField());
	}
	
	@Test
	public void test9(){
		assertEquals(R_AREA_FIELD, nasaRMdata.getrAreaField());
	}
	
	@Test
	public void test10(){
		assertEquals(ALGO_FIELD, nasaRMdata.getAlgoField());
	}
	
	@Test
	public void test11(){
		assertEquals(B_CONCERNS_FIELD, nasaRMdata.getbConcernsField());
	}
	
	@Test
	public void test12(){
		assertEquals(AWS_FAMILIARITY_FIELD, nasaRMdata.getAwsFamiliarityField());
	}
	
	@Test
	public void set1(){
		nasaRMdata.setSensorTypeNames(sensorTypeNames);
		assertEquals(sensorTypeNames, nasaRMdata.getSensorTypeNames());
	}
	
	
	@Test
	public void set2(){
		nasaRMdata1.setAffliationField(AFFLIATION_FIELD);
		assertEquals(AFFLIATION_FIELD, nasaRMdata1.getAffliationField());
	}
	
	@Test
	public void set3(){
		nasaRMdata1.setAlgoField(ALGO_FIELD);
		assertEquals(ALGO_FIELD, nasaRMdata1.getAlgoField());
	}
	
	@Test
	public void set4(){
		nasaRMdata1.setAwsFamiliarityField(AWS_FAMILIARITY_FIELD);
		assertEquals(AWS_FAMILIARITY_FIELD, nasaRMdata1.getAwsFamiliarityField());
	}
	
	@Test
	public void set5(){
		nasaRMdata1.setbConcernsField(B_CONCERNS_FIELD);
		assertEquals(B_CONCERNS_FIELD, nasaRMdata1.getbConcernsField());
	}
	
	@Test
	public void set6(){
		nasaRMdata1.setEmailField(EMAIL_FIELD);
		assertEquals(EMAIL_FIELD, nasaRMdata1.getEmailField());
	}
	
	@Test
	public void set7(){
		nasaRMdata1.setfNameField(F_NAME_FIELD);
		assertEquals(F_NAME_FIELD, nasaRMdata1.getfNameField());
	}
	
	@Test
	public void set8(){
		nasaRMdata1.setGoalField(GOAL_FIELD);
		assertEquals(GOAL_FIELD, nasaRMdata1.getGoalField());
	}
	
	@Test
	public void set9(){
		nasaRMdata1.setlNameField(L_NAME_FIELD);
		assertEquals(L_NAME_FIELD, nasaRMdata1.getlNameField());
	}
	
	@Test
	public void set10(){
		nasaRMdata1.setmNameField(M_NAME_FIELD);
		assertEquals(M_NAME_FIELD, nasaRMdata1.getmNameField());
	}
	
	@Test
	public void set11(){
		nasaRMdata1.setPasswordField(PASSWORD_FIELD);
		assertEquals(PASSWORD_FIELD, nasaRMdata1.getPasswordField());
	}
	
	@Test
	public void set12(){
		nasaRMdata1.setrAreaField(R_AREA_FIELD);
		assertEquals(R_AREA_FIELD, nasaRMdata1.getrAreaField());
	}
	
	@Test
	public void set13(){
		nasaRMdata1.setUserNameField(USER_NAME_FIELD);
		assertEquals(USER_NAME_FIELD, nasaRMdata1.getUserNameField());
	}

}
