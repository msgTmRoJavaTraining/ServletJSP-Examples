package beans.example;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private String species;

    public Animal() {
    }

    public Animal(String name, String species) {

        this.name = name;
        this.species = species;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
