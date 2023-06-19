package az.alinazim.ms.transactions.model.response;

import az.alinazim.ms.transactions.model.enums.Cards;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class TransactionResponse {
    Long id;
    String accountNumber;
    Cards type;
    BigDecimal amount;
    LocalDateTime transactionDate;
}

