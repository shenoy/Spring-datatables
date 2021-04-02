package com.example.SpringREST.service;


import com.example.SpringREST.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@Service
public class PersonService {

    List<Person> persons = new ArrayList<>();

    public PersonService() {
        persons.add(new Person("1", "Anu", "Aggarwal", 23));
        persons.add(new Person("2", "Bhanu", "Prakash", 44));
        persons.add(new Person("3", "Chaitra", "Chauhan", 21));
        persons.add(new Person("4", "Naresh", "Parmar", 67));
        persons.add(new Person("5", "Prithviraj", "Chauhan", 24));
        persons.add(new Person("6", "Naresh", "Verma", 43));
        persons.add(new Person("7", "Vineet", "Sinha", 17));
        persons.add(new Person("8", "Gaurav", "Vohra", 61));
        persons.add(new Person("9", "Sushanth", "Rao", 49));
        persons.add(new Person("10", "Sunil", "Rao", 33));
        persons.add(new Person("11", "Nicolas", "Payet", 27));
        persons.add(new Person("12", "Ramachandra", "Murthy", 56));

    }

    //    public Person getPerson(String id){
//        if(persons.containsKey(id))
//            return persons.get(id);
//        else
//            return null;
//    }
    public List<Person> getAll() {
        return persons;
    }
}
