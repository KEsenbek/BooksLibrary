package kg.megacom.books.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "operations")
public class Operation {

    @Id
            @GeneratedValue
Long id;

Date startDate;
Date endDate;

@ManyToOne
    @JoinColumn(name = "readers_id")
    Reader reader;
@ManyToOne
    @JoinColumn(name = "book_id")
    Book book;

@Enumerated(value = EnumType.STRING)
    OperationStatus status;

}
