package kg.megacom.books.mappers.impl;

import kg.megacom.books.mappers.AuthorMapper;
import kg.megacom.books.models.Author;
import kg.megacom.books.models.dto.AuthorDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorMapperImpl implements AuthorMapper {
    @Override
    public Author fromDto(AuthorDto authorDto) {
        Author author = new Author();
        author.setId(authorDto.getId());
        author.setName(authorDto.getName());

        return author;
    }

    @Override
    public AuthorDto toDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
        authorDto.setName(author.getName());
        return null;
    }

    @Override
    public List<Author> fromDtos(List<AuthorDto> authorDtos) {

        List<Author> authors = new ArrayList<>();
        for(AuthorDto item: authorDtos) {
            Author author = fromDto(item);
            authors.add(author);
        }
        return authors;
        //return authorDtos.stream().map((x) -> fromDto(x)).collect(Collectors.toList());
    }

    @Override
    public List<AuthorDto> toDtos(List<Author> authors) {
        List<AuthorDto> authorDtos = new ArrayList<>();
        for(Author item: authors) {
            AuthorDto authorDto = toDto(item);
            authorDtos.add(authorDto);
        }
        return authorDtos;
    }
}
