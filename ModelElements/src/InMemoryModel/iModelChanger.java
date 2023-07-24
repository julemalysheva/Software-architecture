package InMemoryModel;

/**
 * interface iModelChanger используется для уведомлений об изменениях
 */
public interface iModelChanger {
    public void notifyChanger(iModelChanger sender);
}
