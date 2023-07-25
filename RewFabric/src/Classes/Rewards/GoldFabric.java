package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * Фабрика для создания награды "Gold".
 */
public class GoldFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Gold();
    }
    
}
