package Homework4;

public abstract class Plant implements Actions {
    protected String name;
    protected String type;
    protected String nativeRegion;
    protected boolean isWatered;

    public String getPlantName() {
        return name;
    }

    public String getPlantType() {
        return type;
    }

    public String getPlantNativeRegion() {
        return nativeRegion;
    }

    public String toString() {
        return ("Name: " + name + "\n" + "Type: " + type + "\n" + "Native Region: " + nativeRegion);
    }
}