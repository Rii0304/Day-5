package jpa;

import jpa.configuration.SpringConfig;
import jpa.entity.BookDetailsEntity;
import jpa.entity.BookEntity;
import jpa.entity.CategoryEntity;
import jpa.repository.BookDetailsRepository;
import jpa.repository.BookRepository;
import jpa.repository.CategoryRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    static ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    static BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");
    static CategoryRepository categoryRepository = (CategoryRepository) context.getBean(("categoryRepository"));
    static BookDetailsRepository bookDetailsRepository = (BookDetailsRepository) context.getBean(("bookDetailsRepository"));

    public static void main(String[] args){
//        createNewBookEntityWithNewCategory();
//        createNewBookEntity();
//        findByAuthor("Roger");
//        findByNameAndAuthor("lunix", "Roger");
//        findByNameOrAuthor("lunix", "Roger");
//        findByPriceLessThan(80);
//        findByBookDetailsIsbn("ISIBF1219321");
//        findByNameContaining("Nu");
//        findAllUsingQuery();
//        newBook();
    }

//    private static void newBook(){
//        CategoryEntity categoryEntity = new CategoryEntity();
//        categoryEntity.setName("IT");
//        categoryEntity.setDescription("IT Books");
//
//        categoryRepository.save(categoryEntity);
//
//        BookEntity bookEntity = new BookEntity();
//        bookEntity.setName("Java A-z");
//        bookEntity.setAuthor("Roger");
//        bookEntity.setCategory(categoryEntity);
//
//        bookRepository.save(bookEntity);
//
//        BookDetailsEntity bookDetails = new BookDetailsEntity();
//        bookDetails.setIsbn("ISIBF 1219323");
//        bookDetails.setNumberOfPage(23);
//        bookDetails.setPrice(65);
//
//        bookDetailsRepository.save(bookDetails);
//    }

//    public static void findByAuthor(String author){
//        List<BookEntity> bookEntityList = bookRepository.findByAuthor(author);
//        if (bookEntityList != null) {
//            System.out.println("\nFind " + bookEntityList.size() + "books with author = " + author);
//            for (BookEntity bookEntity: bookEntityList){
//                System.out.println(bookEntity.toString());
//            }
//        }
//    }
//
//    public static void findByNameAndAuthor (String name, String author){
//        List<BookEntity> bookEntityList = bookRepository.findByNameAndAuthor(name, author);
//        if (bookEntityList != null) {
//            System.out.println("\nFind " + bookEntityList.size() + "books with name = " + name + "and author = " + author);
//            for (BookEntity bookEntity: bookEntityList){
//                System.out.println(bookEntity.toString());
//            }
//        }
//    }
//
//    public static void findByNameOrAuthor(String name, String author) {
//        List<BookEntity> bookEntityList = bookRepository.findByNameOrAuthor(name,author);
//        if (bookEntityList != null) {
//            System.out.println("\nFind " + bookEntityList.size() + "books with name = " + name + "and author = " + author);
//            for (BookEntity bookEntity: bookEntityList){
//                System.out.println(bookEntity.toString());
//            }
//        }
//    }

//    public static void findByNameContaining(String name) {
//        List<BookEntity> bookEntityList = bookRepository.findByNameContaining(name);
//        if (bookEntityList != null) {
//            System.out.println("\nFind " + bookEntityList.size() + "books with containing name = " + name);
//            for (BookEntity bookEntity: bookEntityList){
//                System.out.println(bookEntity.toString());
//            }
//        }
//    }

//    public static void findAllUsingQuery() {
//        List<BookEntity> bookEntityList = bookRepository.findAll();
//        if (bookEntityList != null) {
//            System.out.println("\nFind " + bookEntityList.size() + "books");
//            for (BookEntity bookEntity: bookEntityList){
//                System.out.println(bookEntity.toString());
//            }
//        }
//    }

//        public static void findByBookDetailsIsbn(String isbn) {
//        BookEntity bookEntityList = bookRepository.findByBookDetailsIsbn(isbn);
//        if (bookEntityList != null) {
//            System.out.println("\nFind book with isbn" + isbn);
//            System.out.println(bookEntityList.toString());
//        }
//    }

    public static void createNewBookEntity() {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setId(1);

        BookEntity bookEntity = createNewBook();
        bookEntity.setCategory(categoryEntity);
        bookRepository.save(bookEntity);

    }
}