package SingletonPattern;

/**
 * Класс AppSettings хранит настройки приложения и гарантирует, 
 * что настройки будут доступны во всех частях приложения и существуют только в одном экземпляре
 */
public class AppSettings {
    // Приватное статическое поле для хранения единственного экземпляра
    private static AppSettings instance;

    // Приватные поля настроек приложения
    private String language;
    private int fontSize;
    // ... другие настройки ...

    /**
     * Приватный конструктор, чтобы предотвратить создание экземпляров извне
     */
    private AppSettings() {
        // можно добавить настройки по умолчанию
        language = "en";
        fontSize = 12;
    }

    /**
     * Статический метод для получения ссылки на единственный экземпляр класса
     * @return ссылка на единственный экземпляр класса настроек приложения AppSettings
     */
    public static AppSettings getInstance() {
        // Если экземпляр еще не создан, создаем его
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    /**
     * Метод для установки настроек приложения
     * @param language язык приложения
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Метод для получения настроек приложения
     * @return язык приложения
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Метод для установки настроек приложения
     * @param fontSize размер шрифта
     */
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Метод для получения настроек приложения
     * @return размер шрифта
     */
    public int getFontSize() {
        return fontSize;
    }
}
