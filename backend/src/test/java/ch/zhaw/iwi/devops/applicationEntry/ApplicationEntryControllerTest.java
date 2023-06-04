package ch.zhaw.iwi.devops.applicationEntry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch.zhaw.iwi.devops.demo.ApplicationEntry;
import ch.zhaw.iwi.devops.demo.ApplicationEntryController;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ApplicationEntryControllerTest {

    private ApplicationEntryController controller;

    // Aufsetzen der init Methode
    @BeforeEach
    void setUp() {
        controller = new ApplicationEntryController();
        controller.init();
    }

    // Testen, ob die Liste des Controllers zurückgegeben wird (mittels einem einfachen size)
    @Test
    void testGetApplications() {
        Map<Integer, ApplicationEntry> listOfApplications = controller.applications();

        assertEquals(listOfApplications.size(), 3);

    }

    // Tests, ob eine spezifische Applikation mit der appId ausgelesen werden kann
    @Test
    void testGetApplication() {
        int appId = 1;
        ApplicationEntry expectedApplication = new ApplicationEntry(1, "ZHAW Intranet", "3.15.2", "Erweiterung für Studierende, ihre Noten direkt auf dem Portal einzusehen");

        ApplicationEntry result = controller.getApplication(appId);

        assertEquals(result.getAppName(), expectedApplication.getAppName());
    }

    // Test, ob eine Applikation erzeugt werden kann und auch danach zurückgegeben wird
    @Test
    void testCreateApplication() {
        int appId = 4;
        ApplicationEntry applicationEntry = new ApplicationEntry(appId, "ZHAW Extranet", "1.0", "Neues ZHAW Extranet jetzt verfügbar");

        controller.createApplication(applicationEntry);
        Map<Integer, ApplicationEntry> listOfApplications = controller.applications();

        ApplicationEntry result = controller.getApplication(appId);

        assertEquals(listOfApplications.size(), 4);
        assertNotNull(result);
    }

    // Eine bestehende Applikation updaten mittels appId und prüfen, ob diese Applikation das Update erhalten hat
    @Test
    void testUpdateApplication() {
        int appId = 2;
        ApplicationEntry applicationEntry = new ApplicationEntry(2, "DevOps App für Studierende", "7.8.05", "DevOps Erweiterung, um Studenten zu unterstützen");

        controller.createApplication(appId, applicationEntry);

        ApplicationEntry result = controller.getApplication(appId);

        assertEquals(result, applicationEntry);
    }

    // Prüfen, ob eine Applikation mittels der appId gelöscht werden kann
    @Test
    void testDeleteApplication() {
        int appId = 3;
        ApplicationEntry tobedeleted = new ApplicationEntry(3, "StudiVereinapp", "1.05", "Erste Version des Studierendenvereins");

        ApplicationEntry result = controller.deleteApplication(appId);

        assertEquals(tobedeleted.getAppName(), result.getAppName());
        assertEquals(tobedeleted.getAppVersion(), result.getAppVersion());
        assertEquals(tobedeleted.getChangeSet(), result.getChangeSet());
    }
}