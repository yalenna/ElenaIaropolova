package Homework4;

public class HousePlant extends Plant {
    private String housePlantName;
    private String housePlantType;
    private String housePlantNativeRegion;
    private boolean housePlantIsWatered;

    @Override
    public void createPlant( String name, String type, String nativeRegion, boolean isWatered ) {
        this.housePlantName = name;
        this.housePlantType = type;
        this.housePlantNativeRegion = nativeRegion;
        this.housePlantIsWatered = isWatered;

    }

    @Override
    public void updatePlant( String name, String type, String nativeRegion, boolean isWatered ) {
        this.housePlantName = name;
        this.housePlantType = type;
        this.housePlantNativeRegion = nativeRegion;
        this.housePlantIsWatered = isWatered;
        System.out.println("Updated plant info: " + name + " - " + type + " - " + nativeRegion + " - " + isWatered);
    }

    @Override
    public String getPlantName() {
        return housePlantName;
    }

    @Override
    public String getPlantType() {
        return housePlantType;
    }

    @Override
    public String getPlantNativeRegion() {
        return housePlantNativeRegion;
    }

    @Override
    public void waterPlant() {
        housePlantIsWatered = true;
        System.out.println(housePlantName + " was watered");
    }

    public void fertilizeHousePlant() {
        System.out.println(housePlantName + " was fertilized. Now it will grow faster!");
    }

    public String toString() {
        return ("House plant info\n" + "Name: " + housePlantName + "\n" + "Type: " + housePlantType + "\n" + "Native Region: " + housePlantNativeRegion + "\n" + "Is watered: " + housePlantIsWatered);
    }
}
