package ch.zhaw.iwi.devops.applicationEntry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ch.zhaw.iwi.devops.demo.ApplicationEntry;

public class ApplicationEntryTest {

    @Test
    public void testSetName(){
        ApplicationEntry entry = new ApplicationEntry();
        entry.setAppName("AppName");
        assertEquals(entry.getAppName(), "AppName");
    }

    @Test
    public void testgetId(){
        ApplicationEntry entry = new ApplicationEntry(8,"demoAppName", "0.0.1", "testchange set");
        assertEquals(entry.getId(), 8);
    }

    @Test
    public void testSetAppVersion(){
        ApplicationEntry entry = new ApplicationEntry();
        entry.setAppVersion("0.0.1");
        assertEquals(entry.getAppVersion(), "0.0.1");
    }

    @Test
    public void testSetChangeSet(){
        ApplicationEntry entry = new ApplicationEntry();
        entry.setChangeSet("Change set to be checked");
        assertEquals(entry.getChangeSet(), "Change set to be checked");
    }
    
}
