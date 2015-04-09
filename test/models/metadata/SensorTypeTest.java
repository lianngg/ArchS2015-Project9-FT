package models.metadata;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class SensorTypeTest {

	private static SensorType sensorType = new SensorType();
	
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
	
	@BeforeClass
	public static void setter(){
		sensorType.setId(ID);
		sensorType.setSensorTypeName(SENSOR_TYPE_NAME);
		sensorType.setManufacturer(MANUFACTURER);
		sensorType.setVersion(VERSION);
		sensorType.setMaxValue(MAX_VALUE);
	}
	
	@Test
	public void getter(){
		assertEquals(ID, sensorType.getId());
		assertEquals(SENSOR_TYPE_NAME, sensorType.getSensorTypeName());
		assertEquals(MANUFACTURER, sensorType.getManufacturer());
		assertEquals(VERSION, sensorType.getVersion(),0.0001);
		assertEquals(MAX_VALUE, sensorType.getMaxValue(),0.0001);
	}
	
}
