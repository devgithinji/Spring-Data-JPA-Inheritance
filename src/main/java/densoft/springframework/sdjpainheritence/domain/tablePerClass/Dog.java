package densoft.springframework.sdjpainheritence.domain.tablePerClass;

import jakarta.persistence.Entity;

@Entity
public class Dog extends Mammal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
