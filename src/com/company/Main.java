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
        Adress fifthAdress= new Adress("Minsk","Samsonova",0);
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

            List<Person> filter = personaList
                    .stream()

                    .filter((person) -> person.getName()!=null&&person.getSurname()!=null&&person.getCity()!=null)
                    .sorted(Comparator.comparing(Person::getHouseNumber))
                    .collect(Collectors.toList());
            System.out.println(filter);

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
