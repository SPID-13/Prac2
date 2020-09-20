package ru.mirea.lab2;

public class TestAuthor {
    public static void main (String[] args) {
        Author a1 = new Author("Ivan Popov", "", 'M');
        Author a2 = new Author("Anna Ivanova", "anIvanova@somewhere.com", 'F');
        a1.setEmail("ivPopov@somewhere.com");
        System.out.println (a1.ToString());
        System.out.println (a2.ToString());
    }
}
