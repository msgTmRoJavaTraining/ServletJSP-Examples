package servlets.day9;

import java.io.Serializable;

public class Info implements Serializable {

    private String name;
    private String cnp;

    public Info(){}

    public Info(String name,String cnp){
        this.name=name;
        this.cnp=cnp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public String getCnp() {
        return cnp;
    }
}
