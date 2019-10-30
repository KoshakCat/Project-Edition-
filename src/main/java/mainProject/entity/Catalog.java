package mainProject.entity;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Edition> editions = new ArrayList<>();

    public Catalog() {
    }

    public List<Edition> getEditions() {
        return editions;
    }

    public void setEditions(List<Edition> editions) {
        this.editions = editions;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "editions=" + editions +
                '}';
    }
}
