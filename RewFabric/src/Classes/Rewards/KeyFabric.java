package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * Фабрика для создания награды "Key".
 */
public class KeyFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Key();
    }
    
}
