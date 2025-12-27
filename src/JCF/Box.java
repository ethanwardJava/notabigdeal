package JCF;

import lombok.Setter;

@Setter
public class Box<T extends Animal> {
    T animalType;

    public void setAnimalType(T animalType) {
        this.animalType = animalType;
    }

    public void message() {
        System.out.println("This " + animalType + " is your father");
    }
}
