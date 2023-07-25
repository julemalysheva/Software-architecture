package Classes.Rewards;

import Classes.iGameItem;

/**
 * Пример конкретной награды "Potion" (зелье).
 */
public class Potion implements iGameItem{

    @Override
    public void open() {
        System.out.println("Potion!");
    }
    
}
