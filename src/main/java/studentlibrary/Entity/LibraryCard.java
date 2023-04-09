package studentlibrary.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import studentlibrary.Enum.CardStatus;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LibraryCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;

    @Enumerated(EnumType.STRING)
    private CardStatus status;

    @CreationTimestamp
    private Date creationDate;

    @UpdateTimestamp
    private Date updationDate;

    @OneToOne
    @JoinColumn
    Student student;

    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    List<Transaction> transactionList = new ArrayList<>();

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    List<Book> booksIssued = new ArrayList<>();
}
