package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        // method put - dobavlenie elementa
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.put(98745, "Nikolay Petrov");
        // method putIfAbsent - proveryaet po klyuchu - esli takoy klyuch est ne dobavlyaet element - esli net, dobavlyaet
        map1.putIfAbsent(1000, "Oleg Ivanov");
        map1.put(null, "Sergey Petrov");
        map1.put(85214, null);
        System.out.println(map1);
        // method get - po klyuchu vidaet znachenie
        System.out.println(map1.get(1000));
        // esli takogo elementa net - null
        System.out.println(map1.get(1001));
        // method remove - udalyaet element
        map1.remove(15879);
        System.out.println(map1);
        // method containsValue po znacheniyu vidaet est li takoy element (true)
        System.out.println(map1.containsValue("Ivan Ivanov"));
        // false
        System.out.println(map1.containsValue("Sergey Ivanov"));
        // method containsKey po klyuchu vidaet est li takoy element (true)
        System.out.println(map1.containsKey(6578));
        // false
        System.out.println(map1.containsKey(500));
        // method keySet - vidaet spisok klyuchey v kollekcii
        System.out.println(map1.keySet());
        // method values - vidaet spisok znacheniy v kollekcii
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha", "Dobriy");
        map2.put("Misha", "Umniy");
    }
}
