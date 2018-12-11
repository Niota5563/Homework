package com.htp.collections;

import com.htp.collections.books.Book;
import com.htp.collections.books.comparator.BookByAuthorNameComparator;
import com.htp.collections.books.comparator.BookByAuthorSurnameComparator;
import com.htp.collections.students.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Спящие красавицы", 20.72, "Стивен", "Кинг");
        Book book2 = new Book("Гарри Поттер и филосовский камень", 20.25, "Джоан", "Роулинг");
        Book book3 = new Book("Кладбище домшних животных", 11.57, "Стивен", "Кинг");
        Book book4 = new Book("Последнее желание", 13.66, "Анджей", "Сапковский");
        Book book5 = new Book("Портрет Дориана Грея", 6.61, "Оскар", "Уайльд");
        Book book6 = new Book("Метро 2033", 23.15, "Дмитрий", "Глуховский");
        Book book7 = new Book("Гарри Поттер и Проклятое дитя", 20.19, "Джоан", "Роулинг");
        Book book8 = new Book("Варкрафт.Хроники", 30.80, "Крис", "Метцен");
        Book book9 = new Book("Игра престолов", 16.31, "Джордж", "Мартин");
        Book book10 = new Book("Гарри Поттер и Тайная комната", 20.25, "Джоан", "Роулинг");
        Book book11 = new Book("Зеленая миля", 12.92, "Стивен", "Кинг");
        Book book12 = new Book("Фантастические твари и где они обитают", 20.19, "Джоан", "Роулинг");
        Book book13 = new Book("Сияние", 14.05, "Стивен", "Кинг");
        Book book14 = new Book("Оно", 21.59, "Стивен", "Кинг");
        Book book15 = new Book("Идиот", 6.61, "Фёдор", "Достоевский");
        Book book16 = new Book("Гарри Поттер и узник Азкабана", 6.61, "Джоан", "Роулинг");
        Book book17 = new Book("Метро 2035", 21.05, "Дмитрий", "Глуховский");
        Book book18 = new Book("Убийство в " + "Восточном экспрессе", 21.05, "Агата", "Кристи");
        Book book19 = new Book("Убийство в " + "Восточном экспрессе", 21.05, "Агата", "Кристи");
        Book book20 = new Book("Метро 2033", 23.15, "Дмитрий", "Глуховский");
        Book book21 = new Book("Варкрафт.Хроники", 30.80, "Крис", "Метцен");
        Book book22 = new Book("Зеленая миля", 12.92, "Стивен", "Кинг");
        Book book23 = new Book("Фантастические твари и где они обитают", 20.19, "Джоан", "Роулинг");
        Book book24 = new Book("Спящие красавицы", 20.72, "Стивен", "Кинг");
        Book book25 = new Book("Идиот", 6.61, "Фёдор", "Достоевский");

        List<Book> list = new LinkedList<>();

        list.add(book1);
        list.add(book2);
        list.add(book3);

        System.out.println("Оригинал: ");

        list.forEach(System.out::println);

        System.out.println("\nУдаление второго элемента: ");

        list.remove(1);

        list.forEach(System.out::println);

        HashSet<Book> hashList = new HashSet<>();

        hashList.add(book1);
        hashList.add(book2);
        hashList.add(book3);
        hashList.add(book4);
        hashList.add(book5);
        hashList.add(book6);
        hashList.add(book7);
        hashList.add(book8);
        hashList.add(book9);
        hashList.add(book10);
        hashList.add(book11);
        hashList.add(book12);
        hashList.add(book13);
        hashList.add(book14);
        hashList.add(book15);
        hashList.add(book16);
        hashList.add(book17);
        hashList.add(book18);
        hashList.add(book19);
        hashList.add(book20);
        hashList.add(book21);
        hashList.add(book22);
        hashList.add(book23);
        hashList.add(book24);
        hashList.add(book25);

        System.out.println("\nОригинальный HashList: ");
        hashList.forEach(System.out::println);
        System.out.println("\nСортировка по имени автора");
        hashList.stream().sorted(new BookByAuthorNameComparator()).forEach(System.out::println);

        System.out.println("\nСортировка по фамилии автора");
        hashList.stream().sorted(new BookByAuthorSurnameComparator()).forEach(System.out::println);

        System.out.println("\nСортировка по гласным буквам");

        Pattern compile = Pattern.compile("^([ауеиэюяоё]).*$");
        TreeSet<Student> treeSet = new TreeSet<>();
        for (Book book : hashList) {
            Matcher matcher = compile.matcher(book.getTitle().toLowerCase());
            if (matcher.find()) {
                System.out.println(book.toString());
            }
        }
        System.out.println("\nСписок студентов: ");

        treeSet.add(new Student("Егор", "2"));
        treeSet.add(new Student("Николай", "1"));
        treeSet.add(new Student("Семён", "2"));
        treeSet.add(new Student("Евгений", "1"));
        treeSet.add(new Student("Антон", "2"));

        treeSet.forEach(System.out::println);

        Iterator<Student> iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            Student nextStudent = iterator.next();
            if (nextStudent.getGroup().equals("1")) {
                iterator.remove();
            }
        }
        System.out.println("\n" + treeSet);
    }
}
