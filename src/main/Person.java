package main;

import java.util.Objects;

/**
 * Created by eugen on 27.04.2016.
 */
public class Person {
    private int id;
    private String fio;
    private int age;

    public Person(int id, String fio, int age) {
        this.id = id;
        this.fio = fio;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Objects.equals(fio, person.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", age=" + age +
                '}';
    }
}
