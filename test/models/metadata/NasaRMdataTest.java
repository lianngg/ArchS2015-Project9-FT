package models.metadata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
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
	
	@BeforeClass
	public static void setter(){
		nasaRMdata = new NasaRMdata(USER_NAME_FIELD, PASSWORD_FIELD, F_NAME_FIELD,
				L_NAME_FIELD, M_NAME_FIELD, AFFLIATION_FIELD, EMAIL_FIELD, R_AREA_FIELD,
				GOAL_FIELD, ALGO_FIELD, B_CONCERNS_FIELD, AWS_FAMILIARITY_FIELD);
		sensorTypeNames.add("a");
		sensorTypeNames.add("b");
		
		
		nasaRMdata.setSensorTypeNames(sensorTypeNames);
	}
	
	@Test
	public void getter(){
		assertEquals(USER_NAME_FIELD, nasaRMdata.getUserNameField());
		assertEquals(M_NAME_FIELD, nasaRMdata.getmNameField());
		assertEquals(GOAL_FIELD, nasaRMdata.getGoalField());
		assertEquals(PASSWORD_FIELD, nasaRMdata.getPasswordField());
		assertEquals(F_NAME_FIELD, nasaRMdata.getfNameField());
		assertEquals(L_NAME_FIELD, nasaRMdata.getlNameField());
		assertEquals(AFFLIATION_FIELD, nasaRMdata.getAffliationField());
		assertEquals(EMAIL_FIELD, nasaRMdata.getEmailField());
		assertEquals(R_AREA_FIELD, nasaRMdata.getrAreaField());
		assertEquals(ALGO_FIELD, nasaRMdata.getAlgoField());
		assertEquals(B_CONCERNS_FIELD, nasaRMdata.getbConcernsField());
		assertEquals(AWS_FAMILIARITY_FIELD, nasaRMdata.getAwsFamiliarityField());
		
		
		assertEquals(sensorTypeNames, nasaRMdata.getSensorTypeNames());
		
	}
	
	@BeforeClass
	public static void setter1(){
		nasaRMdata1 = new NasaRMdata();
		nasaRMdata1.setAffliationField(AFFLIATION_FIELD);
		nasaRMdata1.setAlgoField(ALGO_FIELD);
		nasaRMdata1.setAwsFamiliarityField(AWS_FAMILIARITY_FIELD);
		nasaRMdata1.setbConcernsField(B_CONCERNS_FIELD);
		nasaRMdata1.setEmailField(EMAIL_FIELD);
		nasaRMdata1.setfNameField(F_NAME_FIELD);
		nasaRMdata1.setGoalField(GOAL_FIELD);
		nasaRMdata1.setlNameField(L_NAME_FIELD);
		nasaRMdata1.setmNameField(M_NAME_FIELD);
		nasaRMdata1.setPasswordField(PASSWORD_FIELD);
		nasaRMdata1.setrAreaField(R_AREA_FIELD);
		nasaRMdata1.setUserNameField(USER_NAME_FIELD);
	}
	
	@Test
	public void getter1(){
		assertEquals(USER_NAME_FIELD, nasaRMdata1.getUserNameField());
		assertEquals(M_NAME_FIELD, nasaRMdata1.getmNameField());
		assertEquals(GOAL_FIELD, nasaRMdata1.getGoalField());
		assertEquals(PASSWORD_FIELD, nasaRMdata1.getPasswordField());
		assertEquals(F_NAME_FIELD, nasaRMdata1.getfNameField());
		assertEquals(L_NAME_FIELD, nasaRMdata1.getlNameField());
		assertEquals(AFFLIATION_FIELD, nasaRMdata1.getAffliationField());
		assertEquals(EMAIL_FIELD, nasaRMdata1.getEmailField());
		assertEquals(R_AREA_FIELD, nasaRMdata1.getrAreaField());
		assertEquals(ALGO_FIELD, nasaRMdata1.getAlgoField());
		assertEquals(B_CONCERNS_FIELD, nasaRMdata1.getbConcernsField());
		assertEquals(AWS_FAMILIARITY_FIELD, nasaRMdata1.getAwsFamiliarityField());
	}
}
