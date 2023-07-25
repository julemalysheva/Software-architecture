package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * Фабрика для создания награды "XP".
 */
public class ExperienceFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Experience();
    }
    
}
