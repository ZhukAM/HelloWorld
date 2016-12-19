package mypackage;

/**
 * Created by Aleksandr Zhuk on 19.12.16.
 */

class Book{

    private int id;
    private static int counter = 1;

    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }

    private String author;
    private int year;
    private String name;

    Book(String name, String author, int year){

        this.name = name;
        this.author = author;
        this.year = year;
        id = counter++;
    }
}
