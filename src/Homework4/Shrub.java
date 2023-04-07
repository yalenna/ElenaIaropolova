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
        return name;
    }

    @Override
    public String getPlantType() {
        return type;
    }

    @Override
    public String getPlantNativeRegion() {
        return nativeRegion;
    }

    @Override
    public void waterPlant() {
        isWatered = true;
    }

    public void trimShrub() {
        System.out.println(name + " was trimmed. Looks great!");
    }

    public String toString() {
        return ("Shrub plant info\n" + "Name: " + name + "\n" + "Type: " + type + "\n" + "Native Region: " + nativeRegion);
    }
}