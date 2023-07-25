package Classes.Rewards;

import Classes.iGameItem;

/**
 * Пример конкретной награды "Shield" (щит).
 */
public class Shield implements iGameItem{

    @Override
    public void open() {
        System.out.println("Shield!");
    }
    
}
