package kg.megacom.books.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ReaderDto {

    Long id;
    String name;
    String surname;
    String patronymic;
    String ticketNum;
    String address;
    Date birthDate;

}
