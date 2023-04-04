package Homework4;

public class FloweringPlant extends Plant {
    private String flowerName;
    private String flowerType;
    private String flowerNativeRegion;
    private boolean flowerIsWatered;

    @Override
    public void createPlant( String name, String type, String nativeRegion, boolean isWatered ) {
        this.flowerName = name;
        this.flowerType = type;
        this.flowerNativeRegion = nativeRegion;
        this.flowerIsWatered = isWatered;
    }

    @Override
    public void updatePlant( String name, String type, String nativeRegion, boolean isWatered ) {

    }

    @Override
    public String getPlantName() {
        return flowerName;
    }

    @Override
    public String getPlantType() {
        return flowerType;
    }

    @Override
    public String getPlantNativeRegion() {
        return flowerNativeRegion;
    }

    @Override
    public void waterPlant() {
        flowerIsWatered = true;
    }

    public void tieUpFlower() {
        System.out.println(flowerName + " was tied up. It doesn't fall anymore!");
    }

    public String toString() {
        return ("Flower plant info\n" + "Name: " + flowerName + "\n" + "Type: " + flowerType + "\n" + "Native Region: " + flowerNativeRegion);
    }
}
