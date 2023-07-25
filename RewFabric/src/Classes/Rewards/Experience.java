package Classes.Rewards;

import Classes.iGameItem;

/**
 * Пример конкретной награды "XP" (опыт).
 */
public class Experience implements iGameItem{

    @Override
    public void open() {
        System.out.println("Experience!");
    }
    
}
