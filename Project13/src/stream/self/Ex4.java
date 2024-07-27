package stream.self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
//    기본 스트림 생성
//        리스트

        // 문자열 리스트를 스트림으로 변환
        List<String> l1 = Arrays.asList("a","b","c");
        Stream<String> stream = l1.stream();

        // 정수 리스트를 스트림으로 변환
        List<Integer> l2 = Arrays.asList(1,2,3,4,5);
        Stream<Integer> s1 = l2.stream();

        // Boolean 리스트를 스트림으로 변환
        List<Boolean> l3 = Arrays.asList(true,false,true);
        Stream<Boolean> S2 = l3.stream();

        // Float 리스트를 스트림으로 변환
        List<Float> l4 = Arrays.asList(2.3f,2.34f,34.00f);
        Stream<Float> s3 = l4.stream();

        // Double 리스트를 스트림으로 변환
        List<Double> l5 = Arrays.asList(34.5,55.34,343.3);
        Stream<Double> s4 = l5.stream();

        // Character 리스트를 스트림으로 변환
        List<Character> l6 = Arrays.asList('a','b','v');
        Stream<Character> s5 = l6.stream();

        // short 리스트를 스트림으로 변환
        List<Short> l7 = Arrays.asList((short)1,(short)2,(short)3);
        Stream<Short> s6 = l7.stream();

        // Byte 리스트를 스트림으로 변환
        List<Byte> l8 = Arrays.asList((byte)1,(byte)2,(byte)3);
        Stream s7 = l8.stream();

//        배열
        // 정수 배열을 스트림으로 변환
        Integer[] a1 = {1,2,3,4,5};
        Stream<Integer> s9 = Arrays.stream(a1);

        // 문자열 배열을 스트림으로 변환
        String[] a2 = {"Alic","Bov","Charlie"};
        Stream<String> s10 = Arrays.stream(a2);

        // Boolean 배열을 스트림으로 변환
        Boolean[] a3 = {true,false,true};
        Stream<Boolean> s11 = Arrays.stream(a3);

        // Float 배열을 스트림으로 반환
        Float[] a4 = {23.5f,32.8f,342.3f};
        Stream<Float> s12 = Arrays.stream(a4);

        // Double 배열을 스트림으로 변환
        Double[] a5 = {34.5,33.4,34.3};
        Stream<Double> a13 = Arrays.stream(a5);

        // Charcter 배열을 스트림을 변환
        Character[] a6 = {'a','b','c'};
        Stream<Character> a14 = Arrays.stream(a6);

        // Long 배열을 스트림으로 변환
        Long[] a7 = {100L,200L,300L};
        Stream<Long> a15 = Arrays.stream(a7);

        // Short 배열을 스트림으로 변환
        Short[] a8 = {(short)1, (short)2, (short)3};
        Stream<Short> s16 = Arrays.stream(a8);

        // Byte 배열을 스트림으로 변환
        Byte[] a9 = {(byte)1,(byte)2,(byte)3};
        Stream<Byte> s17 = Arrays.stream(a9);
//
        // 기본형 배열

        //  int 배열을 IntStream으로 변환
        int[] i1 = {1,2,3,4,5};
        IntStream s18 = Arrays.stream(i1);

        // double 배열을 DoubleStream으로 변환
        double[] i2 = {1.1,32.2,334.4};
        DoubleStream s19 = Arrays.stream(i2);

        // long 배열을 LongStream으로 변환
        long[]  i3 = {100L, 200L, 300L};
        LongStream s20 = Arrays.stream(i3);

        // char 배열을 스트림으로 변환
        char[] i4 = {'a','b','c'};
        IntStream s21 = IntStream.range(0,i4.length).map(i->i4[i]);

        // byte 배열을 스트림으로 변환
        byte[] i5 = {(byte)1, (byte)2, (byte)3 };
        IntStream s22 = IntStream.range(0,i5.length).map(i->i5[i]);

        // Person 객체 리스트를 스트림으로 변환
        class Person {
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        List<Person> people = Arrays.asList(new Person("Alice",30), new Person("Bob", 25));
        Stream<Person> s23 = people.stream();

        // Car 객체 리스트를 스트림으로 변환
        class Car{
            String model;
            int year;

            public Car(String model, int year) {
                this.model = model;
                this.year = year;
            }
        }

        List<Car> cars = Arrays.asList(new Car("sonata",1998), new Car("Benz",2022));
        Stream<Car> s24 = cars.stream();

        // Book 객체 리스트를 스트림으로 변환
        class Book{
            String title;
            String author;

            public Book(String title, String author) {
                this.title = title;
                this.author = author;
            }
        }
        List<Book> books = Arrays.asList(new Book("Geodf dsd","df"),new Book("sdf","dfdf"));
        Stream<Book> s25 = books.stream();

//        Employee 객체를 스트림으로 변환
        class Employee{
            String name;
            double salary;

            public Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }
        }
        List<Employee> employees =  Arrays.asList(new Employee("DFD",34));
        Stream<Employee> s26 = employees.stream();

    }

    // Q1
    String[] words = {"Hello","World","Stream"};
    Stream<String> s27 = Arrays.stream(words);




}
