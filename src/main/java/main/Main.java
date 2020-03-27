package main;

import entity.Person;
import repository.impl.RepositoryPersonImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        RepositoryPersonImpl repositoryPerson = new RepositoryPersonImpl();
        List<Person> list = repositoryPerson.getAll();
        System.out.println(list);
    }
}
