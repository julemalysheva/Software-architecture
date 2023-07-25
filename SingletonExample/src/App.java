import SingletonPattern.AppSettings;

/**
 * Пример использования Singleton-класса AppSettings
 */
public class App {
    public static void main(String[] args) throws Exception {
        // Получаем ссылку на единственный экземпляр AppSettings
        AppSettings settings = AppSettings.getInstance();

        // Устанавливаем настройки приложения
        settings.setLanguage("ru");
        settings.setFontSize(14);

        // Получаем и используем настройки приложения
        String language = settings.getLanguage();
        int fontSize = settings.getFontSize();

        System.out.println("Язык приложения: " + language); // Вывод: Язык приложения: ru
        System.out.println("Размер шрифта: " + fontSize);  // Вывод: Размер шрифта: 14

        // Получаем еще раз ссылку на экземпляр AppSettings
        AppSettings settings2 = AppSettings.getInstance();

        // Проверяем, что это один и тот же объект
        System.out.println(settings == settings2); // Вывод: true
    }
}
