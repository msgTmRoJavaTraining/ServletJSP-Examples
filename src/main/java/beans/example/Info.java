package beans.example;

import java.io.Serializable;

public class Info  implements Serializable {
    private String name;
    private String cnp;
    public Info(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
}
