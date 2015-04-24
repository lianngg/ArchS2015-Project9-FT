package models.metadata;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DeviceTest {
	private final static String TEST_ID = "id";
	private final static String TEST_DEVICEURI = "deviceUri";
	private final static double TEST_LONGITUDE = 1.1;
	private final static double TEST_LATITUDE = 2.2;
	private final static double TEST_ALTITUDE = 3.3;
	private final static String TEST_DEVICE_TYPE_NAME = "deviceTypeName";
	private final static String REPRESENTATION = "representation";
	private final static String DEVICE_USER_DEFINED_FIELDS = "deviceUserDefinedFields";

	private Device device; // = new Device();
	private List<String> SENSOR_TYPE_NAMES;
	private List<String> SENSOR_NAMES;

	public void initAddSensor() {
		SENSOR_TYPE_NAMES.add("sensorType1");
		SENSOR_TYPE_NAMES.add("sensorType2");

		SENSOR_NAMES.add("sensorName1");
		SENSOR_NAMES.add("sensorName2");

		device.addSensorTypeName("sensorType1");
		device.addSensorTypeName("sensorType2");

		device.addSensorNames("sensorName1");
		device.addSensorNames("sensorName2");
	}

	@Before
	public void setUp() throws Exception {
		device = new Device();
		SENSOR_TYPE_NAMES = new ArrayList<String>();
		SENSOR_NAMES = new ArrayList<String>();
		initAddSensor();
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testAddSensorTypeName() {
		assertEquals(SENSOR_TYPE_NAMES, device.getSensorTypeNames());
	}
	
	@Test
	public void testAddSensorName() {
		assertEquals(SENSOR_NAMES, device.getSensorNames());
	}
	
	@Test 
	public void testCanDeleteSensorName() {
		SENSOR_NAMES.remove("sensorName2");
		device.deleteSensorName("sensorName2");
		assertEquals(SENSOR_NAMES, device.getSensorNames());
	}
	
	@Test 
	public void testCanDeleteSensorTypeName() {
		SENSOR_TYPE_NAMES.remove("sensorType1");
		device.deleteSensorTypeName("sensorType1");
		assertEquals(SENSOR_TYPE_NAMES, device.getSensorTypeNames());	
	}

	@Test 
	public void canSetAltitude() {
		device.setAltitude(TEST_ALTITUDE);
		assertEquals(device.getAltitude(), TEST_ALTITUDE, 0.001);
	}

	@Test 
	public void canSetDeviceTypeName() {	
		device.setDeviceTypeName(TEST_DEVICE_TYPE_NAME);
		assertEquals(TEST_DEVICE_TYPE_NAME, device.getDeviceTypeName());
	}

	@Test
	public void canSetDeviceURI() {
		device.setDeviceUri(TEST_DEVICEURI);
		assertEquals(TEST_DEVICEURI, device.getDeviceUri());
	}
	
	@Test
	public void canSetDeviceUserDefinedFields() {
		device.setDeviceUserDefinedFields(DEVICE_USER_DEFINED_FIELDS);
		assertEquals(DEVICE_USER_DEFINED_FIELDS, device.getDeviceUserDefinedFields());
	}
	
	@Test
	public void canSetDeviceID() {
		device.setId(TEST_ID);
		assertEquals(TEST_ID, device.getId());
	}
	
	@Test
	public void canSetLatitude() {
		device.setLatitude(TEST_LATITUDE);
		assertEquals(device.getLatitude(), TEST_LATITUDE, 0.001);
	}
	
	@Test
	public void canSetLongitude() {
		device.setLongitude(TEST_LONGITUDE);
		assertEquals(device.getLongitude(), TEST_LONGITUDE,0.001);
	}
	
	@Test
	public void canSetRepresentation () {
		device.setRepresentation(REPRESENTATION);
		assertEquals(REPRESENTATION, device.getRepresentation());
	}
		
}
