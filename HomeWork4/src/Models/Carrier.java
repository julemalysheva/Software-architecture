package Models;

/**
 * Модель перевозчика
 */
public class Carrier {

    
    private int id;
    private long cardNumber;

    /**
     * конструтор класса
     * @param id перевозчика
     * @param cardNumber номер счета перевозчика
     */
    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    /**
     * 
     * @return id перевозчика
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @return номер счета перевозчика
     */
    public long getCardNumber() {
        return cardNumber;
    }

}
