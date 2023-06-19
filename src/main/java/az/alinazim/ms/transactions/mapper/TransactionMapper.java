package az.alinazim.ms.transactions.mapper;

import az.alinazim.ms.transactions.dao.entity.TransactionEntity;
import az.alinazim.ms.transactions.model.request.TransactionRequest;
import az.alinazim.ms.transactions.model.response.TransactionResponse;

import java.util.List;

public enum TransactionMapper {
    TRANSACTION_MAPPER;

    public TransactionResponse buildTransactionResponse(TransactionEntity transactionEntity) {
        return TransactionResponse.builder()
                .id(transactionEntity.getId())
                .accountNumber(transactionEntity.getAccountNumber())
                .type(transactionEntity.getType())
                .amount(transactionEntity.getAmount())
                .transactionDate(transactionEntity.getTransactionDate())
                .build();
    }

    public TransactionEntity buildTransactionEntity(TransactionRequest transactionRequest) {
        return TransactionEntity.builder()
                .accountNumber(transactionRequest.getAccountNumber())
                .type(transactionRequest.getType())
                .amount(transactionRequest.getAmount())
                .transactionDate(transactionRequest.getTransactionDate())
                .build();
    }
}
