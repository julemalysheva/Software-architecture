package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * Фабрика для создания награды "Shield".
 */
public class ShieldFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Shield();
    }
    
}
