package Homework4;

public abstract class Plant implements Actions {
    protected String name;
    protected String type;
    protected String nativeRegion;
    protected boolean isWatered;

    public abstract String getPlantName();

    public abstract String getPlantType();

    public abstract String getPlantNativeRegion();

    public abstract String toString();
}