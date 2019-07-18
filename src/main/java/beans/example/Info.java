package beans.example;

import java.io.Serializable;

public class Info implements Serializable {
    private String Name;
    private String CNP;

    public Info() {
    }

    public Info(String name, String CNP) {
        Name = name;
        this.CNP = CNP;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }
}
