package az.alinazim.ms.transactions.controller;

import az.alinazim.ms.transactions.model.request.TransactionRequest;
import az.alinazim.ms.transactions.model.response.TransactionResponse;
import az.alinazim.ms.transactions.service.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/transactions")
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class TransactionController {

    TransactionService transactionService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void createTransaction(@RequestBody TransactionRequest transactionRequest){
        transactionService.createTransaction(transactionRequest);
    }


    @GetMapping("/{id}")
    public TransactionResponse getTransactionById(@PathVariable Long id){
        return transactionService.getTransactionById(id);
    }
}
