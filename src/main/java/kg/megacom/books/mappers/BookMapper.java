package kg.megacom.books.mappers;

import kg.megacom.books.models.Book;
import kg.megacom.books.models.dto.BookDto;

import java.util.List;

public interface BookMapper {

    Book fromDto (BookDto bookDto);
    BookDto toDto(Book book);

    List<Book> fromDtos(List<BookDto> bookDtos);
    List<BookDto> toDtos(List<Book> books);

}
