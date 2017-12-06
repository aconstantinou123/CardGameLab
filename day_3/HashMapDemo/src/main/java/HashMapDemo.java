import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap();
        favouriteFruits.put("Sophie", "Blueberry");
        favouriteFruits.put("Fraser", "Banana");
        favouriteFruits.put("Alex", "Mango");


//        HashMap<Integer, Integer> numbers = new HashMap<>();
//        numbers.put(1, 2);
//        System.out.println(numbers.get(1));
//
//        System.out.println(favouriteFruits.get("Alex"));
//        favouriteFruits.put("Alex", "Apple");
//        System.out.println(favouriteFruits.get("Alex"));

        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put( "UK", 64100000);
        countryPopulation.put( "Germany", 80620000);
        countryPopulation.put( "France", 66030000);
        countryPopulation.put( "Japan", 127300000);

        System.out.println(countryPopulation.get("UK"));
        System.out.println(countryPopulation.get("Germany"));
        System.out.println(countryPopulation.get("Japan"));
        System.out.println(countryPopulation.values());
        System.out.println(countryPopulation.keySet());
        System.out.println(countryPopulation.entrySet());
        System.out.println(countryPopulation.replace("UK", 4000000));



    }
}
