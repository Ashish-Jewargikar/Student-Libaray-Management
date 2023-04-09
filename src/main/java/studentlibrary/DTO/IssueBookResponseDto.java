package studentlibrary.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import studentlibrary.Enum.TransactionStatus;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IssueBookResponseDto {

    private String transanctionId;

    private String bookName;

    private TransactionStatus transactionStatus;
}