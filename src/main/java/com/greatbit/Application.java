package com.greatbit;

import com.greatbit.models.Book;
import com.greatbit.models.BookStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        BookStorage.getBooks().add(
                new Book("Учение Дона Хуана", "Карпас Кастанеда", 400)
        );
        BookStorage.getBooks().add(
                new Book("Богатый папа, бедный папа", "Роберт Киосаки", 300)
        );

        SpringApplication.run(Application.class, args);
    }
}
