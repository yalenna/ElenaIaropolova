package Homework4;

public interface Actions {

    void createPlant( String name, String type, String nativeRegion, boolean isWatered );

    void updatePlant( String name, String type, String nativeRegion, boolean isWatered );

    void waterPlant();
}
