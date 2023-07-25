package Classes.Rewards;

import Classes.iGameItem;

/**
 * Пример конкретной награды "Gold" (золото).
 */
public class Gold implements iGameItem{

    @Override
    public void open() {
        System.out.println("Gold!");
    }
    
}
