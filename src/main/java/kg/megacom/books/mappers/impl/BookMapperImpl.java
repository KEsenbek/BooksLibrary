package kg.megacom.books.mappers.impl;

import kg.megacom.books.mappers.BookMapper;
import kg.megacom.books.models.Book;
import kg.megacom.books.models.dto.BookDto;

import java.util.ArrayList;
import java.util.List;

public class BookMapperImpl implements BookMapper {
    @Override
    public Book fromDto(BookDto bookDto) {
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setPrice(bookDto.getPrice());
        return book;
    }

    @Override
    public BookDto toDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());
        bookDto.setPrice(book.getPrice());
        return bookDto;
    }

    @Override
    public List<Book> fromDtos(List<BookDto> bookDtos) {
        List<Book> books = new ArrayList<>();
        for(BookDto item: bookDtos){
            Book book = fromDto(item);
            books.add(book);
        }
        return books;
    }

    @Override
    public List<BookDto> toDtos(List<Book> books) {
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book item: books){
            BookDto bookDto = toDto(item);
            bookDtos.add(bookDto);
        }
        return bookDtos;
    }
}
