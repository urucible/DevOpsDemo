package ch.zhaw.iwi.devops.demo;

public class EngineerEntry {

    private int id;
    private String name;
    private String firstname;
    private String jobtitle;
    private boolean kader;

    public EngineerEntry() {
    }
    
    public EngineerEntry(int id, String name, String firstname, String jobtitle, boolean kader) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.jobtitle = jobtitle;
        this.kader = kader;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public boolean getKader() {
        return kader;
    }

    public void setKader(boolean kader) {
        this.kader = kader;
    }
}
