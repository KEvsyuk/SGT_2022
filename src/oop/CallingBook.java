package oop;

public class CallingBook {
    public static void main(String[] args) {

        //Creating Book class object
        Book book1 = new Book();
        book1.printBookInfo();

        book1.setTitle("Test title");
        book1.setAuthor("Test Author");
        book1.setNumberOfPages(167);

        book1.printBookInfo();

    }
}
