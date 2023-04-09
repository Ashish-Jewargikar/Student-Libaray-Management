package studentlibrary.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import studentlibrary.Enum.Department;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentRequestDto {

    private String name;

    private String email;

    private int age;

    private Department department;
}