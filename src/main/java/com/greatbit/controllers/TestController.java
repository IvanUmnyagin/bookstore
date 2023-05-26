package com.greatbit.controllers;

import com.greatbit.models.BooksStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.stream.Collectors;
import static java.lang.String.format;

@RestController
@RequestMapping("/start")
public class TestController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/books")
    public String books() {
        return BooksStorage.getBooks().stream().
                map(book -> format("%s - %s - %s </br>", book.getAuthor(), book.getName(), book.getPages())).
                collect(Collectors.joining("</br>"));
    }


}
