package Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Модель перевозчика
 */
public class Carrier {

    
    private int id;
    private long cardNumber;
    private List<Integer> zones;

    /**
     * конструтор класса
     * @param id перевозчика
     * @param cardNumber номер счета перевозчика
     */
    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;

        zones = new ArrayList<>();
        zones.add(0);
        zones.add(1);
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
