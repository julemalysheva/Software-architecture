package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * Фабрика для создания награды "Gem".
 */
public class GemFabric extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Gem();
    }
}
