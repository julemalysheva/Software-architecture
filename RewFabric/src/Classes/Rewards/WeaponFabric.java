package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * Фабрика для создания награды "Weapon".
 */
public class WeaponFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Weapon();
    }
    
}
