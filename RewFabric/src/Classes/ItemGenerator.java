package Classes;

/**
 * Базовый класс фабрики наград. Содержит метод openReward(),
 * который создает и открывает награду с помощью метода createItem().
 */
public abstract class ItemGenerator {
    public void openReward(){
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}
