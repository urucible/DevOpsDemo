package ch.zhaw.iwi.devops.engineerEntry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ch.zhaw.iwi.devops.demo.EngineerEntry;

public class EngineerEntryTest {

    @Test
    public void testSetName(){
        EngineerEntry entry = new EngineerEntry();
        entry.setName("Uruci");
        assertEquals(entry.getName(), "Uruci");
    }

    @Test
    public void testgetId(){
        EngineerEntry entry = new EngineerEntry(1,"Blendor", "Uruci", "PO", true);
        assertEquals(entry.getId(), 8);
    }
    
}
