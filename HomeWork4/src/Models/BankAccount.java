package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    //private long oldCard;
    private static long oldCard = 0;

    private long card;
    private int balance;

    /**
     * конструктор класса
     */
    public BankAccount() {
        this.card = oldCard++;
        // this.card = oldCard + 1;
        // oldCard = this.card;
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }

    /**
     * @return card номер банковского счета
     */
    public long getCard() {
        return card;
    }

    /**
     * 
     * @return balance баланс банковского счета
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Метод изменения баланса банковского счета
     * @param balance
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

}
