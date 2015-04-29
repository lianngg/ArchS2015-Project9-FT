package models.metadata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import models.metadata.DeviceType;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class DeviceTypeTest
{
   private static DeviceType deviceType;
   private static DeviceType deviceType1;
   private static String TEST_ID = "1";
   private static String TEST_DEVICE_TYPE = "testDeviceType";
   private static String TEST_MANUFACTURER = "testSensorType";
   private static Double TEST_VERSION = 1.00;
   private static List<String> TEST_SENSOR_TYPE_NAMES;
   private static String TEST_USER_DEFINED_FIELDS = "testUserDefinedFileds";

   public void initSensor() {
       TEST_SENSOR_TYPE_NAMES.add("testType1");
       TEST_SENSOR_TYPE_NAMES.add("testType2");
       deviceType = new DeviceType(TEST_ID, TEST_DEVICE_TYPE, TEST_MANUFACTURER,
              TEST_VERSION, TEST_SENSOR_TYPE_NAMES, TEST_USER_DEFINED_FIELDS);
       deviceType1 = new DeviceType();
   }

   @Before
   public void setUp() throws Exception{
	   TEST_SENSOR_TYPE_NAMES = new ArrayList<String>();
	   initSensor();
   }
   
   @After
   public void tearDown() throws Exception{}
   
   @Test
   public void testAdd(){
	   assertEquals(TEST_SENSOR_TYPE_NAMES, deviceType.getSensorTypeNames());
   }
   
   @Test
   public void testDelete(){
	   TEST_SENSOR_TYPE_NAMES.remove("testType1");
	   deviceType.deleteSensorTypeName("testType1");
	   assertEquals(TEST_SENSOR_TYPE_NAMES, deviceType.getSensorTypeNames());
   }

   @Test
   public void testGetDeviceName(){
	   assertEquals(TEST_DEVICE_TYPE, deviceType.getDeviceTypeName());
   }
   
   @Test
   public void testGetDeviceManufacturer(){
	   assertEquals(TEST_MANUFACTURER, deviceType.getManufacturer());
   }
   
   @Test
   public void testGetDeviceType(){
	   assertEquals(TEST_ID, deviceType.getId());
   }
   
   @Test
   public void testGetSensorTypeNames(){
	   assertEquals(TEST_SENSOR_TYPE_NAMES, deviceType.getSensorTypeNames());
   }
   
   @Test
   public void testGetVersion(){
	   assertEquals(deviceType.getVersion(), TEST_VERSION, 0.001);
   }
   
   @Test
   public void testGetDeviceTypeUserDefinedFields()
   {
      assertEquals(TEST_USER_DEFINED_FIELDS, deviceType.getDeviceTypeUserDefinedFields());
   }
   
   @Test
   public void testSetID(){
	   deviceType1.setId(TEST_ID);
	   assertEquals(TEST_ID, deviceType1.getId());
   }
   
   @Test
   public void testSetDeviceTypeName(){
	   deviceType1.setDeviceTypeName(TEST_DEVICE_TYPE);
	   assertEquals(TEST_DEVICE_TYPE, deviceType1.getDeviceTypeName());
   }
   
   @Test
   public void testSetManufaxturer(){
	   deviceType1.setManufacturer(TEST_MANUFACTURER);
	   assertEquals(TEST_MANUFACTURER, deviceType1.getManufacturer());
   }
   
   @Test
   public void testSetVersion(){
	   deviceType1.setVersion(TEST_VERSION);
	   assertEquals(deviceType1.getVersion(), TEST_VERSION, 0.001);
   }
   
   @Test
   public void testSetDeviceTypeUserDefinedFields(){
	   deviceType1.setDeviceTypeUserDefinedFields(TEST_USER_DEFINED_FIELDS);
	   assertEquals(TEST_USER_DEFINED_FIELDS, deviceType1.getDeviceTypeUserDefinedFields());
   }
   
   @Test
   public void testSetSensorTypeName(){
	   deviceType1.setSensorTypeNames(TEST_SENSOR_TYPE_NAMES);
	   assertEquals(TEST_SENSOR_TYPE_NAMES, deviceType1.getSensorTypeNames());
   }
   
   @Test
   public void testAddSensor(){
	   deviceType1.addSensorTypeName("cmu");
	   TEST_SENSOR_TYPE_NAMES.add("cmu");
	   assertEquals(TEST_SENSOR_TYPE_NAMES, deviceType.getSensorTypeNames());   
   }
   
   @Test
   public void testDeleteSensor(){
	   deviceType.deleteSensorTypeName("testType2");
	   TEST_SENSOR_TYPE_NAMES.remove("testType1");
	   assertEquals(TEST_SENSOR_TYPE_NAMES, deviceType.getSensorTypeNames()); 
   }
}

