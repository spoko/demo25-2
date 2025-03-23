package oop;

public class Breed {
    private String name;
    private String possibleIllnesses;
    private String breedCharacteristics;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: Invalid entry for name!");
        }
    }

    public String getPossibleIllnesses() {
        return possibleIllnesses;
    }

    public void setPossibleIllnesses(String possibleIllnesses) {
        if (!possibleIllnesses.isEmpty()){
            this.possibleIllnesses = possibleIllnesses;
        }else {
            System.out.println("Error: Invalid entry for possible illnesses!");
        }
    }

    public String getBreedCharacteristics() {
        return breedCharacteristics;
    }

    public void setBreedCharacteristics(String breedCharacteristics) {
        if (!breedCharacteristics.isEmpty()){
            this.breedCharacteristics = breedCharacteristics;
        }else {
            System.out.println("Error: Invalid entry for breed characteristics!");
        }
    }

    //constructors
    public Breed(String name, String possibleIllnesses, String breedCharacteristics){
        setName(name);
        setPossibleIllnesses(possibleIllnesses);
        setBreedCharacteristics(breedCharacteristics);
    }

    @Override
    public String toString() {
        return name;
    }
}
