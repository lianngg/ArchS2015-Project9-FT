package models;

import static org.junit.Assert.assertEquals;
import models.metadata.Device;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DashboardItemTest {
	private static int TEST_STATUS = 0;
	private static Device TEST_DEVICE = new Device();
	private static DashboardItem dashBoardItem;
	
	private static int TEST_STATUS_2 = 1;
	private static Device TEST_DEVICE_2 = new Device();
	private static DashboardItem dashBoardItem2;
	
	@BeforeClass
	public static void init(){
		dashBoardItem = new DashboardItem(TEST_STATUS, TEST_DEVICE);
	}
	
	@Test
	public void getter(){
		int status = dashBoardItem.getStatus();
		Device device = dashBoardItem.getDevice();
		assertEquals(TEST_STATUS, status);
		assertEquals(TEST_DEVICE, device);
	}
	
	@BeforeClass
	public static void init2(){
		dashBoardItem2 = new DashboardItem();
		dashBoardItem2.setStatus(TEST_STATUS_2);
		dashBoardItem2.setDevice(TEST_DEVICE_2);
	}
	
	@Test
	public void getter2(){
		int status = dashBoardItem2.getStatus();
		Device device = dashBoardItem2.getDevice();
		assertEquals(TEST_STATUS_2, status);
		assertEquals(TEST_DEVICE_2, device);
	}
	
}
