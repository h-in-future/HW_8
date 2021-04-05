package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Adress firstAdress= new Adress("Minsk","Nemanskaya",13);
        Adress secondAdress= new Adress("Minsk","Solodilova",17);
        Adress thirdAdress= new Adress("Minsk","Nevorofskay",15);
        Adress fourthAdress= new Adress("Minsk","Lidskaya",16);
        Adress fifthAdress= new Adress("Minsk","Samsonova",18);
        Adress sixthAdress= new Adress(null,null,0);

	Person vadim=new Person("Vadim","Alferov",firstAdress);
        Person vitaliy=new Person("Vitaliy","Kulebyaka",secondAdress);
        Person ignatiy=new Person("Ignatiy","Mironov",thirdAdress);
        Person tumakov=new Person(null,"Tumakov",fourthAdress);
        Person dima=new Person("Dmitriy",null,fifthAdress);
        Person sasha=new Person("Sasha","Sluhov",sixthAdress);
        List<Person> personaList=new ArrayList<>();
        personaList.add(vadim);
        personaList.add(vitaliy);
        personaList.add(ignatiy);
        personaList.add(tumakov);
        personaList.add(dima);
        personaList.add(sasha);
        for(int a=0;a<personaList.size(); a++){
            int finalA = a;
            int finalB = a+1;
            List<Person> filter = personaList
                    .stream()
                    .filter((person) -> personaList.get(finalA).getName()!=null&&personaList.get(finalA).getSurname()!=null&&personaList.get(finalA).getCity()!=null)
                    .sorted((person1,person2) -> personaList.get(finalA+1).compareTo(personaList.get(finalA)))
                    .collect(Collectors.toList());
            System.out.println(filter.get(finalA));
        }
//        List<String> list = new ArrayList<>();
//list.add("aaaaaaaaaa");
//list.add("bbbb");
//list.add("c");
//        List<String> modified = list
//                .stream()
//                .sorted((s1, s2) -> s1.length() - s2.length())
//                .collect(Collectors.toList());
//        System.out.println(modified);
    }

}
