package Homework4;

import java.util.List;

public interface Greenhouse {
    void buyPlant( Plant plant );

    List<Plant> getAllPlants();

    void removePlant( Plant plant );

    void changeTemperature( double temperature );

    double getTemperature();

    List<Plant> getPlantByType( String type );

    List<Plant> getPlantByNativeRegion( String nativeRegion );
}
