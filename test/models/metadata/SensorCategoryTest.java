package models.metadata;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class SensorCategoryTest {

	private static SensorCategory sensorCategory = new SensorCategory();
	
	private static String ID = "id";
	private static String SENSOR_CATEGORY_NAME = "sensorCategoryName";
	private static String PURPOSE = "purpose";
	
	@BeforeClass
	public static void setter(){
		sensorCategory.setId(ID);
		sensorCategory.setSensorCategoryName(SENSOR_CATEGORY_NAME);
		sensorCategory.setPurpose(PURPOSE);
	}
	
	@Test
	public void getter(){
		assertEquals(ID, sensorCategory.getId());
		assertEquals(SENSOR_CATEGORY_NAME, sensorCategory.getSensorCategoryName());
		assertEquals(PURPOSE, sensorCategory.getPurpose());
	}
}
