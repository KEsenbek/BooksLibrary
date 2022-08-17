package kg.megacom.books.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "authors")
public class Author {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @ManyToMany (mappedBy = "authors")
    Set<Book> books;
    
}
