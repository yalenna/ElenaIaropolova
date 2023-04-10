package Homework4;

import java.util.List;
import java.util.ArrayList;

public class BrandNewGreenhouse implements Greenhouse {
    private List<Plant> plants;
    private double temperature;

    public BrandNewGreenhouse() {
        plants = new ArrayList<>();
    }

    public static void main(String[] args) {
        String separator = "================================================";
        Greenhouse greenhouse1 = new BrandNewGreenhouse();

        // create plants
        Plant tulip = new FloweringPlant();
        tulip.createPlant("Tulip", "Flowering Plant", "Amsterdam, Netherlands", true);
        //tie up flower
        FloweringPlant tieFlower = (FloweringPlant) tulip;
        tieFlower.tieUpFlower();
        System.out.println(separator);
        Plant raspberry = new Shrub();
        raspberry.createPlant("Raspberry", "Shrub", "Saint-Petersburg, Russia", false);

        //trim a shrub
        Shrub trimRaspberry = (Shrub) raspberry;
        trimRaspberry.trimShrub();
        System.out.println(separator);

        //continue to create plants
        Plant ficus = new HousePlant();
        ficus.createPlant("Ficus", "House Plant", "Nairobi, Kenya", false);

        //fertilize a house plant
        HousePlant fertilizeFicus = (HousePlant) ficus;
        fertilizeFicus.fertilizeHousePlant();

        greenhouse1.buyPlant(ficus); //buy = add to greenhouse "Ficus"
        greenhouse1.buyPlant(raspberry);//buy = add to greenhouse "Raspberry"
        greenhouse1.buyPlant(tulip);//buy = add to greenhouse "Raspberry"

        // get all plants in greenhouse
        System.out.println(separator);
        List<Plant> plantsInGreenhouse = greenhouse1.getAllPlants();
        for (Plant plant : plantsInGreenhouse) {
            System.out.println("In greenhouse: " + plant.getPlantName());
        }
        System.out.println(separator);

        //remove plant from the greenhouse
        greenhouse1.removePlant(tulip);
        for (Plant plant : plantsInGreenhouse) {
            System.out.println("In greenhouse after deletion: " + plant.getPlantName());
        }

        System.out.println(separator);
        System.out.println(ficus); // get information about Plant "Ficus"
        System.out.println(separator);
        System.out.println(raspberry); // get information about Plant "Tulip"
        System.out.println(separator);
        //update plant
        ficus.updatePlant("Ficus", "House Plant", "Cebu, Philippines", false); // update information about "Ficus"
        System.out.println(separator);
        //water plant
        ficus.waterPlant();
        System.out.println(separator);
        System.out.println(ficus); // get information about Plant "Ficus" after watering
        System.out.println(separator);
        // get plants by type
        List<Plant> showPlantsByType = greenhouse1.getPlantByType("Shrub");
        System.out.println(showPlantsByType);
        System.out.println(separator);
        // get plants by native region
        List<Plant> showPlantsByNativeRegion = greenhouse1.getPlantByNativeRegion("cebu");
        System.out.println(showPlantsByNativeRegion);
        System.out.println(separator);
        // change temperature
        greenhouse1.changeTemperature(23.3);
        System.out.println("Greenhouse temperature is " + greenhouse1.getTemperature());
    }

    @Override
    public void buyPlant(Plant plant) {
        plants.add(plant);
    }

    @Override
    public List<Plant> getAllPlants() {
        return plants;
    }

    @Override
    public void removePlant(Plant plant) {
        plants.remove(plant);
    }

    @Override
    public void changeTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public List<Plant> getPlantByType(String type) {
        List<Plant> plantsByType = new ArrayList<>();
        for (Plant plant : plants) {
            if (plant.getPlantType().equals(type)) {
                plantsByType.add(plant);
            }
        }
        return plantsByType;
    }

    @Override
    public List<Plant> getPlantByNativeRegion(String nativeRegion) {
        List<Plant> plantsByRegion = new ArrayList<>();
        for (Plant p : plants) {
            if (p.getPlantNativeRegion().equals(nativeRegion) || p.getPlantNativeRegion().toLowerCase().contains(nativeRegion.toLowerCase())) {
                plantsByRegion.add(p);
            }
        }
        return plantsByRegion;
    }
}