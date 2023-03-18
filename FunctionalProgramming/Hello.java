package FunctionalProgramming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static FunctionalProgramming.Gender.*;

public class Hello {

    public static void main(String[] args) {

        List<Person> listPerson = List.of(
                new Person("AASHISH", MALE),
                new Person("MARIA", FEMALE),
                new Person("JOHN", MALE),
                new Person("ALEX", MALE),
                new Person("DALIA", FEMALE));

        listPerson.stream().filter(l -> Gender.FEMALE.equals(l.getGender())).collect(Collectors.toList());

        listPerson.stream().map(Person::getName).mapToInt(String::length).forEach(System.out::println);

        boolean containsOnly = listPerson.stream()
                .noneMatch(p -> FEMALE.equals(p.getGender()));

        System.out.println(containsOnly);

        Optional.ofNullable(null).ifPresentOrElse(email -> System.out.println("send mail to " + email),
                () -> System.out.println("cannot send email"));

    }

    static class Person {
        private final String name;
        private final Gender Gender;

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return Gender;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", Gender=" + Gender + "]";
        }

        public Person(String name, Gender gender) {
            this.name = name;
            Gender = gender;
        }

    }

}
