import java.util.Comparator;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        Comparator<Hero> comparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero orig, Hero compare) {
                return orig.getName().compareTo(compare.getName());
            }
        };
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet
        TreeMap<Hero, Flower> heroesFavFlowers = new TreeMap<>(comparator);
        heroesFavFlowers.put(hulk, rose);
        heroesFavFlowers.put(scarletWitch, rose);
        heroesFavFlowers.put(thor, rose);
        heroesFavFlowers.put(vision, tulip);
        heroesFavFlowers.put(captainAmerica, lily);
        heroesFavFlowers.put(blackWidow, violet);
        heroesFavFlowers.put(doctorStrange, violet);

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println(heroesFavFlowers.containsValue(begonia));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for (Flower flower : heroesFavFlowers.values()){
            System.out.println(flower.getName());
        }
    }
}
