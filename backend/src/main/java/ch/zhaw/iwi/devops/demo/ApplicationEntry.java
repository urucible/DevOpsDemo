package ch.zhaw.iwi.devops.demo;

public class ApplicationEntry {

    private int id;
    private String appName;
    private String appVersion;
    private String changeSet;

    public ApplicationEntry() {
    }
    
    public ApplicationEntry(int id, String appName, String appVersion, String changeSet) {
        this.id = id;
        this.appName = appName;
        this.appVersion = appVersion;
        this.changeSet = changeSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getChangeSet() {
        return changeSet;
    }

    public void setChangeSet(String changeSet) {
        this.changeSet = changeSet;
    }
  
    
}
