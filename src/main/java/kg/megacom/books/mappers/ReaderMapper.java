package kg.megacom.books.mappers;

import kg.megacom.books.models.Reader;
import kg.megacom.books.models.dto.ReaderDto;

import java.util.List;

public interface ReaderMapper {
    Reader fromDto (ReaderDto readerDto);
    ReaderDto toDto (Reader reader);

    List<Reader> fromDtos (List<ReaderDto> readerDtos);
    List<ReaderDto> toDtos (List<Reader> readers);

}
