package Homework4;

public class HousePlant extends Plant {
    @Override
    public void createPlant(String name, String type, String nativeRegion, boolean isWatered) {
        this.name = name;
        this.type = type;
        this.nativeRegion = nativeRegion;
        this.isWatered = isWatered;
    }

    @Override
    public void updatePlant(String name, String type, String nativeRegion, boolean isWatered) {
        this.name = name;
        this.type = type;
        this.nativeRegion = nativeRegion;
        this.isWatered = isWatered;
        System.out.println("Updated plant info: " + name + " - " + type + " - " + nativeRegion + " - " + isWatered);
    }

    @Override
    public String getPlantName() {
        return "House plant - " + super.getPlantName();
    }

    @Override
    public void waterPlant() {
        isWatered = true;
        System.out.println(name + " was watered");
    }

    public void fertilizeHousePlant() {
        System.out.println(name + " was fertilized. Now it will grow faster!");
    }

    public String toString() {
        return "House plant info\n" + super.toString();
    }
}