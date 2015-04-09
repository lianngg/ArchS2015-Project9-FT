package models.metadata;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SensorTest {

	private static Sensor sensor = new Sensor();
	
	private static String ID = "id";
	private static String SENSOR_NAME = "sensorName";
	private static String SENSOR_TYPE_NAME = "sensorTypeName";
	private static String DEVICE_URI = "deviceUri";
	private static String SENSOR_CATEGORY_NAME = "sensorCategoryName";
	private static String SENSOR_USER_DEFINED_FIELDS = "sensorUserDefinedFields";
	
	@BeforeClass
	public static void setter(){
		sensor.setId(ID);
		sensor.setSensorName(SENSOR_NAME);
		sensor.setSensorTypeName(SENSOR_TYPE_NAME);
		sensor.setDeviceUri(DEVICE_URI);
		sensor.setSensorCategoryName(SENSOR_CATEGORY_NAME);
		sensor.setSensorUserDefinedFields(SENSOR_USER_DEFINED_FIELDS);
	}
	
	@Test
	public void getter(){
		assertEquals(ID, sensor.getId());
		assertEquals(SENSOR_NAME, sensor.getSensorName());
		assertEquals(SENSOR_TYPE_NAME, sensor.getSensorTypeName());
		assertEquals(DEVICE_URI, sensor.getDeviceUri());
		assertEquals(SENSOR_CATEGORY_NAME, sensor.getSensorCategoryName());
		assertEquals(SENSOR_USER_DEFINED_FIELDS, sensor.getSensorUserDefinedFields());
	}
	
}
