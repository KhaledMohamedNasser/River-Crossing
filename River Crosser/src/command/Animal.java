package command;

public class Animal extends Character{
    private String animalType;
    private double animalWeight;
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    public String getAnimalType() {
        return animalType;
    }
    public void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }
    public double getAnimalWeight() {
        return animalWeight;
    }
}
