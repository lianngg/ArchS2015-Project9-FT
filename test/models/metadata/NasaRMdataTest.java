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
		assertEquals(sensorTypeNames, nasaRMdata.getSensorTypeNames());
	}
	
	
}
