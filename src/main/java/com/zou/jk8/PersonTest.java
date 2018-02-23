package com.zou.jk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 77);
        Person person3 = new Person("wangwu", 32);

        List<Person> people = Arrays.asList(person1, person2, person3);

        PersonTest test = new PersonTest();
        List<Person> personList = test.getPersonByUsername("zhangsan", people);
        personList.forEach(person -> System.out.println(person.getUsername()));


        List<Person> personList1 = test.getPersonByAge(20, people);
        personList1.forEach(person -> System.out.println(person.getAge()));


        List<Person> personList2 = test.getPersonByAge2(20, people, (age, persons) -> {
            return persons.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());
        });

        personList2.forEach(person -> System.out.println(person.getAge()));


    }


    //根据名字查询集合
    public List<Person> getPersonByUsername(String username, List<Person> people) {

        return people.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }


    //根据年龄查询
    public List<Person> getPersonByAge(int age, List<Person> people) {

        BiFunction<Integer, List<Person>, List<Person>> biFunction = (ageOfPerson, personList) -> people.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());

        return biFunction.apply(age, people);
    }


    //更加灵活的方式
    public List<Person> getPersonByAge2(int age, List<Person> people, BiFunction<Integer, List<Person>, List<Person>> biFunction) {

        return biFunction.apply(age, people);

    }
}




















