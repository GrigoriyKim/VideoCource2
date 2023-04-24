package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        // mojem dobavlyat raznie ob`ekti tak kak v osnove lista stoit objekt (no tak delat ne pravilno tak kak eto siroy tip)
//        List list = new ArrayList();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("dsfsdfklsdf"));
//        list.add(new Car());
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("dsfdsfsdf");

        // v osnove list object a ne String po etomu oshibka
//        for (String s : list){}
        for(Object o : list){
            System.out.println(o + " dlina " + ((String)o).length());
        }
    }
}

class Car{}
