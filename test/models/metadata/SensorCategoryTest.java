package models.metadata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SensorCategoryTest {

	private static SensorCategory sensorCategory;
	
	private static String ID = "id";
	private static String SENSOR_CATEGORY_NAME = "sensorCategoryName";
	private static String PURPOSE = "purpose";
	
	
	@Before
	public void setUp() throws Exception{
		sensorCategory = new SensorCategory();
	}
	
	@Test
	public void test1(){
		sensorCategory.setId(ID);
		assertEquals(ID, sensorCategory.getId());
	}
	
	
	@Test
	public void test2(){
		sensorCategory.setSensorCategoryName(SENSOR_CATEGORY_NAME);
		assertEquals(SENSOR_CATEGORY_NAME, sensorCategory.getSensorCategoryName());
	}
	
	@Test
	public void test3(){
		sensorCategory.setPurpose(PURPOSE);
		assertEquals(PURPOSE, sensorCategory.getPurpose());
	}

}
