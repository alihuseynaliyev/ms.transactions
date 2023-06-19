package az.alinazim.ms.transactions.model.request;

import az.alinazim.ms.transactions.model.enums.Cards;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;

@Data
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class TransactionRequest {
    String accountNumber;
    Cards type;
    BigDecimal amount;
    LocalDateTime transactionDate;
}
