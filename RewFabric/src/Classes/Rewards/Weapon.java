package Classes.Rewards;

import Classes.iGameItem;

/**
 * Пример конкретной награды "Weapon" (оружие).
 */
public class Weapon implements iGameItem{

    @Override
    public void open() {
        System.out.println("Weapon!");
    }
    
}
