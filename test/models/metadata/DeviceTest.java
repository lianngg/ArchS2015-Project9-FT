package models.metadata;

//DeviceTest
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import models.metadata.Device;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DeviceTest {
	
	private static String TEST_ID = "id";
	private static String TEST_DEVICEURI = "deviceUri";
	private static double TEST_LONGITUDE = 1.1;
	private static double TEST_LATITUDE = 2.2;
	private static double TEST_ALTITUDE = 3.3;
	private static String TEST_DEVICE_TYPE_NAME = "deviceTypeName";
	private static String REPRESENTATION = "representation";
	private static String DEVICE_USER_DEFINED_FIELDS = "deviceUserDefinedFields";
	
	private static Device device = new Device();
	private static List<String> SENSOR_TYPE_NAMES = new ArrayList<String>();
	private static List<String> SENSOR_NAMES = new ArrayList<String>();
	
	
	@BeforeClass
	   public static void initAddSensor() {
		   SENSOR_TYPE_NAMES.add("sensorType1");
		   SENSOR_TYPE_NAMES.add("sensorType2");
		   
		   SENSOR_NAMES.add("sensorName1");
		   SENSOR_NAMES.add("sensorName2");
		   
		   device.addSensorTypeName("sensorType1");
		   device.addSensorTypeName("sensorType2");
		   
		   device.addSensorNames("sensorName1");
		   device.addSensorNames("sensorName2");
	   }
	
	@Test
	   public void getterAddTest()
	   {
	      assertEquals(SENSOR_TYPE_NAMES, device.getSensorTypeNames());
	      assertEquals(SENSOR_NAMES, device.getSensorNames());
	   }
	
	@BeforeClass
	public static void initDeleteSensor(){
		SENSOR_TYPE_NAMES.remove("sensorType1");
		SENSOR_NAMES.remove("sensorName2");
		
		device.deleteSensorTypeName("sensorType1");
		device.deleteSensorName("sensorName2");
	}
	
	@Test
	   public void getterDeleteTest()
	   {
	      assertEquals(SENSOR_TYPE_NAMES, device.getSensorTypeNames());
	      assertEquals(SENSOR_NAMES, device.getSensorNames());
	   }
	
	@BeforeClass
	public static void setter(){
		device.setAltitude(TEST_ALTITUDE);
		device.setDeviceTypeName(TEST_DEVICE_TYPE_NAME);
		device.setDeviceUri(TEST_DEVICEURI);
		device.setDeviceUserDefinedFields(DEVICE_USER_DEFINED_FIELDS);
		device.setId(TEST_ID);
		device.setLatitude(TEST_LATITUDE);
		device.setLongitude(TEST_LONGITUDE);
		device.setRepresentation(REPRESENTATION);
	}
	
	@Test
	public void getter1(){
		assertEquals(device.getAltitude(), TEST_ALTITUDE, 0.001);
		assertEquals(device.getLongitude(), TEST_LONGITUDE,0.001);
		assertEquals(device.getLatitude(), TEST_LATITUDE, 0.001);
		assertEquals(TEST_DEVICE_TYPE_NAME, device.getDeviceTypeName());
		assertEquals(TEST_DEVICEURI, device.getDeviceUri());
		assertEquals(TEST_ID, device.getId());
		assertEquals(REPRESENTATION, device.getRepresentation());
		assertEquals(DEVICE_USER_DEFINED_FIELDS, device.getDeviceUserDefinedFields());
		
		
	}
}

