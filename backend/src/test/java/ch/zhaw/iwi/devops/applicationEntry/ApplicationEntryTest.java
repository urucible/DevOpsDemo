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
    
}
