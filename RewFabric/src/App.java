import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Classes.Rewards.GoldFabric;
import Classes.Rewards.KeyFabric;
import Classes.Rewards.PotionFabric;
import Classes.Rewards.ShieldFabric;
import Classes.Rewards.WeaponFabric;
import Classes.Rewards.ExperienceFabric;
import Classes.Rewards.GemFabric;

/**
 * Главный класс приложения, демонстрирующий использование паттерна Фабричный метод.
 */
public class App {
    public static void main(String[] args) throws Exception {
        // Создание экземпляров фабрик
        ItemGenerator gemFabric = new GemFabric();
        ItemGenerator goldFabric = new GoldFabric();
        ItemGenerator experienceFabric = new ExperienceFabric();
        ItemGenerator weaponFabric = new WeaponFabric();
        ItemGenerator potionFabric = new PotionFabric();
        ItemGenerator shieldFabric = new ShieldFabric(); 
        ItemGenerator keyFabric = new KeyFabric(); 

        // Открытие наград с использованием фабрик
        gemFabric.openReward();
        goldFabric.openReward();
        experienceFabric.openReward();
        weaponFabric.openReward();
        potionFabric.openReward();
        shieldFabric.openReward(); 
        keyFabric.openReward(); 

        System.out.println("---------------------------------------------------------------------");
        // Создание списка фабрик для рандомизированного выбора
        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(gemFabric);
        fabricList.add(goldFabric);
        fabricList.add(experienceFabric);
        fabricList.add(weaponFabric);
        fabricList.add(potionFabric);
        fabricList.add(shieldFabric); 
        fabricList.add(keyFabric); 

        // Случайное открытие наград 20 раз
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 20; i++) {
            int index = rnd.nextInt(fabricList.size());
            fabricList.get(index).openReward();
        }
    }
}
