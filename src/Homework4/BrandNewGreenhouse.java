package Homework4;

import java.util.List;
import java.util.ArrayList;

public class BrandNewGreenhouse implements Greenhouse, Illuminated {
    private List<Plant> plants;
    private double temperature;
    public BrandNewGreenhouse() {
        plants = new ArrayList<>();
    }

    @Override
    public void illuminateRed() {
    }

    @Override
    public void illuminateWhite() {
    }

    public static class GreenhouseCapacity {
        private String capacity;
        private int numberOfPlants;

        public GreenhouseCapacity(String capacity, int numberOfPlants) {
            this.capacity = capacity;
            this.numberOfPlants = numberOfPlants;
        }

        public void displayGreenhouseCapacity() {
            System.out.println("Greenhouse size is " + capacity + ", you can add " + numberOfPlants + " plants");
        }
    }

    private class ClearGreenhouse {
        public void removeAllPlants() {
            plants.clear();
        }
    }

    public static void main(String[] args) {
        Illuminated illumination = new Illuminated() {
            @Override
            public void illuminateRed() {
                System.out.println("Greenhouse is illuminated with red light");
            }

            @Override
            public void illuminateWhite() {
                System.out.println("Greenhouse is illuminated with white light");
            }
        };

        String separator = "================================================";
        Greenhouse greenhouse1 = new BrandNewGreenhouse();

        //using of anonymous - illuminate
        illumination.illuminateRed();
        illumination.illuminateWhite();
        System.out.println(separator);

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

        // add plants to greenhouse
        greenhouse1.buyPlant(ficus);
        greenhouse1.buyPlant(raspberry);
        greenhouse1.buyPlant(tulip);

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

        //using of nested - get greenhouse1 capacity
        BrandNewGreenhouse greenhouse2 = new BrandNewGreenhouse();
        BrandNewGreenhouse.GreenhouseCapacity location = new GreenhouseCapacity("Small", 532);
        location.displayGreenhouseCapacity();

        //using of inner - remove all plants from the greenhouse2 (add, get, delete, get)
        greenhouse2.buyPlant(tulip);
        greenhouse2.buyPlant(ficus);

        // get all plants
        System.out.println(separator);
        List<Plant> plantsInGreenhouse2 = greenhouse2.getAllPlants();
        for (Plant plant : plantsInGreenhouse2) {
            System.out.println("In greenhouse: " + plant.getPlantName());
        }

        //clear greenhouse
        BrandNewGreenhouse.ClearGreenhouse mondayClear = greenhouse2.new ClearGreenhouse();
        mondayClear.removeAllPlants();
        System.out.println(separator);
        List<Plant> plantsInGreenhouse3 = greenhouse2.getAllPlants();
        for (Plant plant : plantsInGreenhouse3) {
            System.out.println("In greenhouse: " + plant.getPlantName());
        }

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