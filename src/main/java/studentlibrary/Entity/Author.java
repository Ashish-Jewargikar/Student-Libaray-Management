package studentlibrary.Entity;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String name;

    private int age;

    private String mobNo;

    private String email;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    List<Book> books = new ArrayList<>();
}