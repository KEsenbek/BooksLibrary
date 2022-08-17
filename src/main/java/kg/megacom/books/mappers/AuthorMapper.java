package kg.megacom.books.mappers;

import kg.megacom.books.models.Author;
import kg.megacom.books.models.dto.AuthorDto;

import java.util.List;

public interface AuthorMapper {

    Author fromDto (AuthorDto authorDto);
    AuthorDto toDto (Author author);

    List<Author> fromDtos(List<AuthorDto> authorDtos);
    List<AuthorDto> toDtos(List<Author> authors);
}
