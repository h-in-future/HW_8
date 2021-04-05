package com.company;

public class Person extends Adress implements Comparable<Person>{
    private String name;
    private String surname;

    public Person(String name, String surname, Adress adress){
        super(adress.getCity(), adress.getStreet(), adress.getHouseNumber());
        this.name=name;
        this.surname=surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname() {
        return surname;
    }
    @Override
    public String toString(){
        return "Name: "+ name+
                " Surname: "+surname+
                " Adress: "+getCity()+" "+getStreet()+" "+getHouseNumber()+"\n";
    }
@Override
    public int compareTo(Person o) {
        return this.getHouseNumber() - o.getHouseNumber();
    }
}
