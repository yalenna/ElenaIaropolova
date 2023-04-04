package Homework4;


public class Shrub extends Plant {
    private String shrubName;
    private String shrubType;
    private String shrubNativeRegion;
    private boolean shrubIsWatered;

    @Override
    public void createPlant( String name, String type, String nativeRegion, boolean isWatered ) {
        this.shrubName = name;
        this.shrubType = type;
        this.shrubNativeRegion = nativeRegion;
        this.shrubIsWatered = isWatered;
    }

    @Override
    public void updatePlant( String name, String type, String nativeRegion, boolean isWatered ) {
    }

    @Override
    public String getPlantName() {
        return shrubName;
    }

    @Override
    public String getPlantType() {
        return shrubType;
    }

    @Override
    public String getPlantNativeRegion() {
        return shrubNativeRegion;
    }

    @Override
    public void waterPlant() {
        shrubIsWatered = true;
    }

    public void trimShrub() {
        System.out.println(shrubName + " was trimmed. Looks great!");
    }

    public String toString() {
        return ("Shrub plant info\n" + "Name: " + shrubName + "\n" + "Type: " + shrubType + "\n" + "Native Region: " + shrubNativeRegion);
    }
}
