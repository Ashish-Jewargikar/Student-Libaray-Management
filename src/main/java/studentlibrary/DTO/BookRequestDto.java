package studentlibrary.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import studentlibrary.Enum.Genre;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookRequestDto {

    private String title;

    private int price;

    private Genre genre;

    private int authorId;
}