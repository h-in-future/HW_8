package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Adress firstAdress= new Adress("Minsk","Nemanskaya",15);
        Adress secondAdress= new Adress("Minsk","Solodilova",14);
        Adress thirdAdress= new Adress("Minsk","Nevorofskay",13);
        Adress fourthAdress= new Adress("Minsk","Lidskaya",16);
        Adress fifthAdress= new Adress("Minsk","Samsonova",11);
	Person vadim=new Person("Vadim","Alferov",firstAdress);
        Person vitaliy=new Person("Vitaliy","Kulebyaka",secondAdress);
        Person ignatiy=new Person("Ignatiy","Mironov",thirdAdress);
        Person tumakov=new Person(null,"Tumakov",fourthAdress);
        Person dima=new Person("Dmitriy",null,fifthAdress);
        Person sasha=new Person("Sasha","Sluhov",null);
        List<Person> personList=new ArrayList<>();
        personList.add(vadim);
        personList.add(vitaliy);
        personList.add(ignatiy);
        personList.add(tumakov);
        personList.add(dima);
        personList.add(sasha;
        List<Person> filter= personList
        .stream()
                .filter((person)->!personList.contains(null))
        .collect(Collectors.toList());
        System.out.println(personList);
    }
}
