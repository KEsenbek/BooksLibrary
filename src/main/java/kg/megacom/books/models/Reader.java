package kg.megacom.books.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "readers")
public class Reader {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;

    String name;
    String surname;
    String patronymic;

    String ticketNum;
    String address;

    Date birthDate;

}
