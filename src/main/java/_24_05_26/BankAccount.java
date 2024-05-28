package _24_05_26;

import _24_05_26.constants.ErrorMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
public class BankAccount {
     double balance;
    User user;

    public BankAccount(double balance, User user) {
        this.balance = balance;
        this.user = user;
    }

    public double deposit(double sum){
        if(sum < 0){
            throw new IllegalArgumentException(ErrorMessage.LESS_THAN_ZERO);
        }
        return balance+=sum;
    }

    public double withdraw(double sum){
        if(sum>balance){
            throw  new IllegalArgumentException(ErrorMessage.MORE_THAN_BALANCE);
        }
        return balance-=sum;
    }
}

