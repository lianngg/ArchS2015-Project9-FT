package models.metadata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class SensorTest {

	private static Sensor sensor;
	
	private static String ID = "id";
	private static String SENSOR_NAME = "sensorName";
	private static String SENSOR_TYPE_NAME = "sensorTypeName";
	private static String DEVICE_URI = "deviceUri";
	private static String SENSOR_CATEGORY_NAME = "sensorCategoryName";
	private static String SENSOR_USER_DEFINED_FIELDS = "sensorUserDefinedFields";
	
	@Before
	public void setUp() throws Exception{
		sensor = new Sensor();
	}
	
	@Test
	public void test1(){
		sensor.setId(ID);
		assertEquals(ID, sensor.getId());
	}
	
	@Test
	public void test2(){
		sensor.setSensorName(SENSOR_NAME);
		assertEquals(SENSOR_NAME, sensor.getSensorName());
	}
	
	@Test
	public void test3(){
		sensor.setSensorTypeName(SENSOR_TYPE_NAME);
		assertEquals(SENSOR_TYPE_NAME, sensor.getSensorTypeName());
	}
	
	@Test
	public void test4(){
		sensor.setDeviceUri(DEVICE_URI);
		assertEquals(DEVICE_URI, sensor.getDeviceUri());
	}
	
	@Test
	public void test5(){
		sensor.setSensorCategoryName(SENSOR_CATEGORY_NAME);
		assertEquals(SENSOR_CATEGORY_NAME, sensor.getSensorCategoryName());
	}
	
	@Test
	public void test6(){
		sensor.setSensorUserDefinedFields(SENSOR_USER_DEFINED_FIELDS);
		assertEquals(SENSOR_USER_DEFINED_FIELDS, sensor.getSensorUserDefinedFields());
	}
	
}
