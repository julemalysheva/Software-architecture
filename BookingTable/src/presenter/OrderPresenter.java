package presenter;

import model.domain.Customer;
import model.domain.Table;
import model.domain.Dish;

/**
 * Интерфейс для презентера заказа
 */
public interface OrderPresenter {
    /**
     * Получаем все залы из данных и запускаем отображение пользователю
     */
    void loadHalls();

    /**
     * Загружаем все столы по выбранному залу и запускаем отображение пользователю
     * @param hallId ID выбранного Зала
     */
    void loadTablesInHall(int hallId);

    /**
     * Получаем объект выбранного стола по id
     * @param tableId id стола
     * @return Table
     */
    Table getTableById(int tableId);

    /**
     * Получаем объект выбранного блюда по id
     * @param dishId 
     * @return Dish
     */
    Dish getDishById(int dishId);

    /**
     * Получаем все блюда из базы данных и запускаем отображение пользователю
     */
    void loadDishes();

    /**
     * Передаем в модель данные для нового заказа. Запускаем у пользователя отображение вновь созданного заказа
     * @param table стол
     * @param customer пользователь
     */
    void createOrder(Table table, Customer customer);

    /**
     * Передаем в модель данные для добавления в заказ блюд. На стороне пользователя запускаем обновление данных о заказе.
     * @param dish блюдо
     * @param quantity количество
     */
    void addDishToOrder(Dish dish, int quantity);

    /**
     * Метод размещения заказа после подтверждения пользователя. Сохраняем заказ в БД. Создаем данные для запроса, отправляем
     * запрос на сервер, получая ответ. Запускаем оповещение пользователя об успешности бронирования.
     */
    void placeOrder();
}
