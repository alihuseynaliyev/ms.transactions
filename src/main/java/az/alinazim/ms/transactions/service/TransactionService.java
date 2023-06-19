package az.alinazim.ms.transactions.service;

import az.alinazim.ms.transactions.dao.repository.TransactionRepository;
import az.alinazim.ms.transactions.mapper.TransactionMapper;
import az.alinazim.ms.transactions.model.request.TransactionRequest;
import az.alinazim.ms.transactions.model.response.TransactionResponse;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import static az.alinazim.ms.transactions.mapper.TransactionMapper.TRANSACTION_MAPPER;
import static lombok.AccessLevel.PRIVATE;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class TransactionService {

    TransactionRepository transactionRepository;

    public TransactionResponse getTransactionById(Long id) {
        return TRANSACTION_MAPPER.buildTransactionResponse(
                transactionRepository.findById(id)
                        .orElseThrow(
                                () -> new RuntimeException("Transaction not found this id: " + id)
                        )
        );
    }

    public void createTransaction(TransactionRequest transactionRequest) {
        transactionRepository.save(
                TRANSACTION_MAPPER.buildTransactionEntity(transactionRequest)
        );
    }
}
