package Classes.Rewards;

import Classes.iGameItem;

/**
 * Пример конкретной награды "Key" (ключ).
 */
public class Key implements iGameItem{

    @Override
    public void open() {
        System.out.println("Key!");
    }
    
}
