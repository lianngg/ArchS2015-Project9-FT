package models.metadata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SensorTypeTest {

	private static SensorType sensorType;
	
	private static String ID = "id";
	private static String SENSOR_TYPE_NAME = "sensorTypeName";
	private static String MANUFACTURER = "manufacturer";
	private static double VERSION = 20.0;
	private static double MAX_VALUE = 40.0;
	private static double MIN_VALUE = 60.0;
	private static String UNIT = "unit";
	private static String INTERPRETER = "interpreter";
	private static String SENSOR_TYPE_USER_DEFINED_FIELDS = "sensorTypeUserDefinedFields";
	private static String SENSOR_CATEGORY_NAME = "sensorCategoryName";
	
	@Before
	public void setUp() throws Exception{
		sensorType = new SensorType();
	}
	
	@Test
	public void test1(){
		sensorType.setId(ID);
		assertEquals(ID, sensorType.getId());
	}
	
	@Test
	public void test2(){
		sensorType.setSensorTypeName(SENSOR_TYPE_NAME);
		assertEquals(SENSOR_TYPE_NAME, sensorType.getSensorTypeName());

	}
	
	@Test
	public void test3(){
		sensorType.setManufacturer(MANUFACTURER);
		assertEquals(MANUFACTURER, sensorType.getManufacturer());

	}
	
	@Test
	public void test4(){
		sensorType.setVersion(VERSION);
		assertEquals(VERSION, sensorType.getVersion(),0.0001);


	}
	@Test
	public void test5(){
		sensorType.setMaxValue(MAX_VALUE);
		assertEquals(MAX_VALUE, sensorType.getMaxValue(),0.0001);


	}
	
	@Test
	public void test6(){
		sensorType.setInterpreter(INTERPRETER);
		assertEquals(INTERPRETER, sensorType.getInterpreter());


	}
	
	@Test
	public void test7(){
		sensorType.setMinValue(MIN_VALUE);
		assertEquals(MIN_VALUE, sensorType.getMinValue(),0.0001);


	}
	
	@Test
	public void test8(){
		sensorType.setSensorCategoryName(SENSOR_CATEGORY_NAME);
		assertEquals(SENSOR_CATEGORY_NAME, sensorType.getSensorCategoryName());

	}
	
	@Test
	public void test9(){
		sensorType.setSensorTypeUserDefinedFields(SENSOR_TYPE_USER_DEFINED_FIELDS);
		assertEquals(SENSOR_TYPE_USER_DEFINED_FIELDS, sensorType.getSensorTypeUserDefinedFields());

	}
	
	@Test
	public void test10(){
		sensorType.setUnit(UNIT);

	}
	
}
