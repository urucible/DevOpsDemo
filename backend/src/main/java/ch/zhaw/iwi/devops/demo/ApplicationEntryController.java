package ch.zhaw.iwi.devops.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationEntryController {

    private Map<Integer, ApplicationEntry> applicationEntries = new HashMap<Integer, ApplicationEntry>();
    
    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        this.applicationEntries.put(1,new ApplicationEntry(1, "ZHAW Intranet", "3.15.2", "Erweiterung für Studierende, ihre Noten direkt auf dem Portal einzusehen"));
        this.applicationEntries.put(2,new ApplicationEntry(2, "DevOps App", "7.8.05", "DevOps Erweiterung, um auch die Applikationen im System erfassen zu können"));
        this.applicationEntries.put(3,new ApplicationEntry(3, "StudiVereinapp", "1.05", "Erste Version des Studierendenvereins"));
    }

    @GetMapping("/application")
    public Map<Integer, ApplicationEntry> applications() {
        return this.applicationEntries;
    }

    @GetMapping("/application/{appId}")
    public ApplicationEntry getApplication(@PathVariable Integer appId) {
        return this.applicationEntries.get(appId);
    }

    @PostMapping("/application")
    public void createTodo(@RequestBody ApplicationEntry applicationEntry) {
        var newId = this.applicationEntries.keySet().stream().max(Comparator.naturalOrder()).orElse(0) + 1;
        applicationEntry.setId(newId);
        this.applicationEntries.put(newId, applicationEntry);
    }

    @PutMapping("/application/{appId}")
    public void createTodo(@PathVariable Integer appId, @RequestBody ApplicationEntry applicationEntry) {
        applicationEntry.setId(appId);
        this.applicationEntries.put(appId, applicationEntry);
    }

    @DeleteMapping("/application/{appId}")
    public ApplicationEntry deleteTodo(@PathVariable Integer appId) {
        return this.applicationEntries.remove(appId);
    }

}
