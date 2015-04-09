package models.metadata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import models.metadata.DeviceType;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Contains unit tests for Device Type
 */
@RunWith(JUnit4.class)
public class DeviceTypeTest
{
   private static DeviceType deviceType;
   private static String TEST_ID = "1";
   private static String TEST_DEVICE_TYPE = "testDeviceType";
   private static String TEST_MANUFACTURER = "testSensorType";
   private static Double TEST_VERSION = 1.00;
   private static List<String> TEST_SENSOR_TYPE_NAMES = new ArrayList<>();
   private static String TEST_USER_DEFINED_FIELDS = "testUserDefinedFileds";

   /**
    * Setup a sensor object to test on
    */
   @BeforeClass
   public static void initSensor() {
       TEST_SENSOR_TYPE_NAMES.add("testType1");
       TEST_SENSOR_TYPE_NAMES.add("testType2");
       deviceType = new DeviceType(TEST_ID, TEST_DEVICE_TYPE, TEST_MANUFACTURER,
              TEST_VERSION, TEST_SENSOR_TYPE_NAMES, TEST_USER_DEFINED_FIELDS);
   }
   
   /**
    */
   @Test
   public void getterTest()
   {
      String deviceName =  deviceType.getDeviceTypeName();
      String deviceManufacturer = deviceType.getManufacturer();
      assertEquals(TEST_DEVICE_TYPE, deviceName);
      assertEquals(TEST_MANUFACTURER, deviceManufacturer);
   }
}

