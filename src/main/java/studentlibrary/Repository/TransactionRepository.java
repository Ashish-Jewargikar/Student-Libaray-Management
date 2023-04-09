package studentlibrary.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;
import studentlibrary.Entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    @Query(value = "select * from transaction t where t.card_card_no=:cardId AND t.transaction_status='SUCCESS'",
            nativeQuery = true)
    List<Transaction> getAllSuccessfullTxnsWithCardNo(int cardId);
}