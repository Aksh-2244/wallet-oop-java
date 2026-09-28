package project.var;
import java.time.LocalDateTime;
public class WalletAnalyser {
    private Wallet wallet;

    WalletAnalyser(Wallet w){
        this.wallet = w;
    }
    public double totalamountcredited(){
        Transaction T[] = wallet.getTransactions();
        double a = 0;
        for(int i = 0;i<wallet.getOP();i++){
           if(T[i].getcredit() == true){
           a+= T[i].getamount();
          }
        }  
        return a;
    }
    public double totalamountdebited(){
        Transaction T[] = wallet.getTransactions();
        double a = 0;;
        for(int i = 0;i<wallet.getOP();i++){
           if(T[i].getcredit() == false){
           a+= T[i].getamount();
          }
        }  
        return a;
    }
    public double expenditure(LocalDateTime t1,LocalDateTime t2){
        Transaction T[] = wallet.getTransactions();
        double a = 0;
        for(int i=0;i<wallet.getOP();i++){
           if(T[i].getTime().isAfter(t1) && T[i].getTime().isBefore(t2) && T[i].getcredit() == false){
            a+= T[i].getamount();
           }
        }
        return a;
}
}
