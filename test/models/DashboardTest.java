package models;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DashboardTest {

    private static Dashboard db;
    private static ArrayList<DashboardItem> items = new ArrayList<DashboardItem>();
    
    @Before
    public void setUp() throws Exception {
        db = new Dashboard(items, 0, 0);
    }

    @Test
    public void testGetActiveCount() {
        assertEquals(db.getActiveCount(), 0);
    }

    @Test
    public void testGetItems() {
        assertEquals(db.getItems(), new ArrayList<DashboardItem>());
    }

    @Test
    public void testGetTotalCount() {
        assertEquals(db.getTotalCount(), 0);
    }

    @Test
    public void testSetActiveCount() {
        db.setActiveCount(1);
        assertEquals(db.getActiveCount(), 1);
    }

    @Test
    public void testSetTotalCount() {
        db.setTotalCount(1);
        assertEquals(db.getTotalCount(), 1);
    }

}
