package Classes.Rewards;

import Classes.iGameItem;

/**
 * Пример конкретной награды "Gem" (драгоценный камень).
 */
public class Gem implements iGameItem{
    @Override
    public void open() {
        System.out.println("Gem!");
    }
}
