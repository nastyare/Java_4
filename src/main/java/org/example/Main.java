package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.SneakyThrows;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    //@SneakyThrows
    /*public static void main(String[] args) {
        Gson gson = new Gson();
        Type visitorListType = new TypeToken<List<Visitor>>(){}.getType();
        List<Visitor> visitors = gson.fromJson(new FileReader("books.json"), visitorListType);

        printVisitorsAndCount(visitors);
    }

    public static void printVisitorsAndCount(List<Visitor> visitors) {
        System.out.println("Список посетителей:");
        visitors.stream()
                .map(visitor -> visitor.getName() + " " + visitor.getSurname())
                .forEach(System.out::println);

        System.out.println("\nОбщее количество посетителей: " + visitors.size());
    }*/
}
