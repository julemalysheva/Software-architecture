### Задание 1. Закончить разработку паттерна Фабричный метод. Добавить в пример из семинара как минимум 5 наград.
***


В коде добавлены пять новых наград ("Experience", "Weapon", "Potion", "Shield", "Key") и соответствующие фабрики для их создания.

Каждая новая награда должна реализовать интерфейс iGameItem, а каждая новая фабрика должна наследоваться от ItemGenerator и реализовать метод createItem().