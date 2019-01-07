package com.htp.task11;

import com.htp.task11.entity.People;
import com.htp.task11.entity.Sex;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //P.S. I'm sorry for this name of types (ex1, ex2 etc.). I promise next time i'll use the correct spelling. :)

    public static void main(String[] args) {

        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");

        long ex1 = collection.stream().filter("a1"::equals).count();
        System.out.println("Кол-во вхождений a1: " + ex1);
        String ex2 = collection.stream().findFirst().orElse("0");
        System.out.println("Первый элемент коллекции: " + ex2);
        String ex3 = collection.stream().skip(collection.size() - 1).findAny().orElse("empty");
        System.out.println("Последний элемент коллекции: " + ex3);
        String ex4 = collection.stream().filter("a3"::equals).findFirst().get();
        System.out.println("Результат: " + ex4);
        String ex5 = collection.stream().skip(2).findFirst().get();
        System.out.println("Третий элемент из коллекции: " + ex5);
        List<String> ex6 = collection.stream().skip(1).limit(2).collect(Collectors.toList());
        System.out.println("Два элемента, начиная со второго: " + ex6);
        List<String> ex7 = collection.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());
        System.out.println("Все значения, содержащие 1: " + ex7);

        System.out.println("-----------------------------------------------------");

        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)
        );

        List<People> ex8 = peoples.stream().filter((p) -> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == Sex.MAN).collect(Collectors.toList());
        System.out.println("Военнообязанные: " + ex8);
        double ex9 = peoples.stream().filter((p) -> p.getSex() == Sex.MAN).
                mapToInt(People::getAge).average().getAsDouble();
        System.out.println("Средний возраст мужчин: " + ex9);
        long ex10 = peoples.stream().filter((p) -> p.getAge() >= 18).filter(
                (p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55) || (p.getSex() == Sex.MAN && p.getAge() < 60)).count();
        System.out.println("Кол-во работоспособных людей: " + ex10);

        System.out.println("-----------------------------------------------------");

        Collection<String> ordered = Arrays.asList("a1", "a2", "a2", "a3", "a1", "a2", "a2");
        Collection<String> nonOrdered = new HashSet<>(ordered);

        List<String> ex11 = nonOrdered.stream().distinct().collect(Collectors.toList());
        System.out.println("Коллекция без дубликатов из неупорядоченного стрима(порядок не гарантируется): " + ex11);
        List<String> ex12 = ordered.stream().distinct().collect(Collectors.toList());
        System.out.println("Коллекция без дубликатов из упорядоченного стрима (порядок гарантируется): " + ex12);

        System.out.println("-----------------------------------------------------");

        boolean ex13 = collection.stream().anyMatch("a1"::equals);
        System.out.println("Существуют ли хоть один «a1» элемент в коллекции: " + ex13);
        boolean ex14 = collection.stream().anyMatch("a8"::equals);
        System.out.println("Существуют ли хоть один «a8» элемент в коллекции: " + ex14);
        boolean ex15 = collection.stream().allMatch((s) -> s.contains("1"));
        System.out.println("Есть ли символ «1» у всех элементов коллекции: " + ex15);
        boolean ex16 = collection.stream().noneMatch("a7"::equals);
        System.out.println("Не существуют ни одного «a7» элемента в коллекции: " + ex16);

        System.out.println("-----------------------------------------------------");

        List<String> ex17 = collection.stream().map((s) -> s + "_1").collect(Collectors.toList());
        System.out.println("Добавление _1 к каждому элементу первой коллекции: " + ex17);
        List<Integer> ex18 = collection.stream().map((s) -> Integer.parseInt(s.substring(1))).collect(Collectors.toList());
        System.out.println("Убран первый символ и получен массив чисел " + ex18);

        Collection<String> newCollection = Arrays.asList("1,2,0", "4,5");

        String[] ex19 = newCollection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);
        System.out.println("Числа, перечисленные через запятую из всех элементов: " + Arrays.toString(ex19));
        int ex20 = newCollection.stream().flatMapToInt((p) -> Arrays.asList(p.split(",")).stream().mapToInt(Integer::parseInt)).sum();
        System.out.println("Сумма всех чисел, перечисленных через запятую: " + ex20);
    }
}
