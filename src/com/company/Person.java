package com.company;

public class Person {
    private String name;
    private String surname;
    private Adress adress;
    public Person(String name, String surname, Adress adress){
        this.name=name;
        this.surname=surname;
        this.adress=adress;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public Adress getAdress(){
        return adress;
    }
    @Override
    public String toString(){
        return "Name: "+ name+
                " Surname:"+surname+
                " Adress: "+adress+"\n";
    }
}
