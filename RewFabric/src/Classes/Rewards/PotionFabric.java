package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * Фабрика для создания награды "Potion".
 */
public class PotionFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Potion();
    }
    
}
