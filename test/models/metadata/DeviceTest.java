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
	private String id;
	private String deviceUri;
	private double longitude;
	private double latitude;
	private double altitude;
	private String deviceTypeName;
	private String representation;
	private String deviceUserDefinedFields;
	private List<String> sensorTypeNames = new ArrayList<String>();
	private List<String> sensorNames = new ArrayList<String>();
	
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
}

