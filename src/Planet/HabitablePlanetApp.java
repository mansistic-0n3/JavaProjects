package Planet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class HabitablePlanetApp {
    private static final String SOLID="solid";
    private static final int AVERAGE_EARTH_TEMP=15;
    private static final double SUN_DISTANCE=0.00001581;
    public static void main(String[] args) {
        ArrayList<Planet> planets = PlanetRepository.getPlanets();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("The number of planets available in galaxy: "+planets.stream().distinct().count());
        System.out.println("---------------------------------------------------------------------------");
        Optional <Planet> theBiggest = planets.stream().max(Comparator.comparing(Planet::getSize));
        System.out.println("The Biggest planet amongst all is "+theBiggest.get().getName() +" with size "+ theBiggest.get().getSize()+"kms.");
        Optional <Planet> theSmallest = planets.stream().min(Comparator.comparing(Planet::getSize));
        System.out.println("The Smallest planet amongst all is "+theSmallest.get().getName() +" with size "+ theSmallest.get().getSize()+"kms.");
        System.out.println("---------------------------------------------------------------------------");
        Optional<Planet> theColdest = planets.stream().min(Comparator.comparing(Planet::getTemperature));
        System.out.println("The Coldest planet amongst all is "+theColdest.get().getName() +" with size "+ theColdest.get().getTemperature()+"°C.");
        Optional<Planet> theHottest = planets.stream().max(Comparator.comparing(Planet::getTemperature));
        System.out.println("The Hottest planet amongst all is "+theHottest.get().getName() +" with size "+ theHottest.get().getTemperature()+"°C.");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Top 10 most Habitable Planets:");
        planets.stream()
                .filter(planet -> SOLID.equals(planet.getType()))
                .sorted(Comparator.comparing((Planet p)-> Math.abs(p.getTemperature()-AVERAGE_EARTH_TEMP)).thenComparing(Planet::getDistanceFromEarth))
                .limit(10)
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("The planet that is at the same distance from its closet star from the sun: ");
        planets.stream()
                .sorted(Comparator.comparing(p-> Math.abs(p.getClosestStarDistance()-SUN_DISTANCE)))
                .limit(1)
                .forEach(System.out::println);
        Planet earthSunDistancePlanet = planets.stream()
                .min(Comparator.comparing(p -> Math.abs(p.getClosestStarDistance() - SUN_DISTANCE)))
                .get();
        System.out.println(earthSunDistancePlanet);
        System.out.println("---------------------------------------------------------------------------");
    }
}
