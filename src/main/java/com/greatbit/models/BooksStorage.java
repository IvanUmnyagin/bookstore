package com.greatbit.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class BooksStorage {
    private static Set<Book> books = new HashSet<>();

    static {
        books.add(new Book(UUID.randomUUID().toString(),"Учение Дона Хуана", "Карлос Кастанеда", 400));
        books.add(new Book(UUID.randomUUID().toString(),"Богатый папа, Бедный папа", "Роберт Киосаки", 300));
    }

    public static Set<Book> getBooks(){
        return books;
    }

}
