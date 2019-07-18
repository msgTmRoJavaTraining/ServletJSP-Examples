package beans.example;

public class Person
{
    private String name;
    private String CNP;


    public Person(){}

    public Person(String name, String CNP) {
        this.name = name;
        this.CNP = CNP;
    }

    public String getName() {
        return name;
    }

    public String getCNP() {
        return CNP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

}
