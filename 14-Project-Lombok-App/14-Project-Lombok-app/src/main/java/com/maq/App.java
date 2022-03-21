package com.maq;

import com.maq.model.Book;

public class App 
{
    public static void main( String[] args )
    {
        Book b = new Book();
        b.setId(101);
        b.setName("Sachin");
        System.out.println(b);
    }
}
