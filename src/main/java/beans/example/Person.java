package beans.example;

import java.io.Serializable;
public class Person implements Serializable {
   private String nume;
   private String CNP;
   public Person(){}

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }
}
