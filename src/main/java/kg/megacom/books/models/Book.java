package kg.megacom.books.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "books")
public class Book {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;
    double price;

    @ManyToMany
            @JoinTable(
                    name = "book_authors",
                    joinColumns = @JoinColumn(name = "book_id"),
                    inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    Set<Author> authors;

}
