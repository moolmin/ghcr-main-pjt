package org.moolmin;

import com.example.ghcrlibrarypjt.LibraryClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("Main project running, invoking library project...");

        // Example call to a method from the library
        LibraryClass libraryInstance = new LibraryClass();
        libraryInstance.someMethod();
    }
}
