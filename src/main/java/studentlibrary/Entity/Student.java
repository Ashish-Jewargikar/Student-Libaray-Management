package studentlibrary.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import studentlibrary.Enum.Department;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;

    @Column(unique = true)
    private String email;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    LibraryCard card;
}