package model.domain;

/**
 * Класс описывает сущность Клиент
 */
public class Customer {
    private static int nextId = 1;

    private int customerId;
    private String name;
    private String phoneNumber;
    private String email;

    /**
     * Конструктор Клиента
     * @param name Имя
     * @param phoneNumber Номер телефона
     * @param email эл.почта
     */
    public Customer(String name, String phoneNumber, String email) {
        this.customerId = nextId++;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * Геттеры и Сеттеры - не используются
     * @return
     */
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
