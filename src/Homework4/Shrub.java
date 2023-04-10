package Homework4;

public class Shrub extends Plant {
    @Override
    public void createPlant(String name, String type, String nativeRegion, boolean isWatered) {
        this.name = name;
        this.type = type;
        this.nativeRegion = nativeRegion;
        this.isWatered = isWatered;
    }

    @Override
    public void updatePlant(String name, String type, String nativeRegion, boolean isWatered) {
    }

    @Override
    public String getPlantName() {
        return "Shrub - " + super.getPlantName();
    }

    @Override
    public void waterPlant() {
        isWatered = true;
    }

    public void trimShrub() {
        System.out.println(name + " was trimmed. Looks great!");
    }

    public String toString() {
        return "Shrub info\n" + super.toString();
    }
}