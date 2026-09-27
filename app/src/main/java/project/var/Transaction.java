package project.var;
import java.time.LocalDateTime;

public class Transaction {
    private String Transation_Id;
    private double amount;
    private boolean credit_transaction;
    private LocalDateTime timestamp;
      
    Transaction(string transation_id,double a,boolean c){
        this.Transation_Id = transation_id;
        this.amount = a;
        this.credit_transaction = c;
        this.timestamp = LocalDateTime.now();
    }

}
