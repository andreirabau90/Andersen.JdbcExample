package repository;

import entity.Person;

import java.util.List;

public interface RepositoryPerson {
    void save(Person person);
    void update(int id,Person person);
    void delete(int id);
    List<Person> getAll();
}
