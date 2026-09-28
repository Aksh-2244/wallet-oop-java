package project.var;
public class Wallet {
    private String UpiId;
    private double balance;
    private Transaction[] Transactions;
    private int op = 0;
    Wallet(String Id,double b){
        this.UpiId = Id;
        if(b<0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }else{
          this.balance = b;;
        }
        this.Transactions = new Transaction[500];
    }
    public void addmoney(double k){
       if(k<0){
        throw new IllegalArgumentException("Amount cannot be negative");
       }else{
         balance+=k;
         Transactions[op] = new Transaction(UpiId, k, false);
         op++;
       }
    }
    public void deductmoney(double k){
     if(k<0){
        throw new IllegalArgumentException("Amount cannot be negative");
     }else if(k>balance){
        throw new IllegalArgumentException("balance is insufficient");
     }else{
        balance-=k;
       Transactions[op] = new Transaction(UpiId, k, true);
        op++;
     } 
    }
    public String getUpiId(){
        return UpiId;
    }
    public double getbalance(){
        return balance;
    }
    public String getlatestTransaction(){
         return "TransactionId " + UpiId
        + "\nTransaction amount-" + Transactions[op-1].getamount()
        + "\nTransaction type-" + Transactions[op-1].getcredit();
    }
}


