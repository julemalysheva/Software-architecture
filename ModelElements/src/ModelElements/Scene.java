package ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * class Scene...
 */
public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras = new ArrayList<Camera>();

    /**
     * Конструктор Scene
     * @param id Scene
     * @param models должен быть больше 0 
     * @param flashes
     * @param cameras должен быть больше 0
     * @throws Exception 
     */
    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0) {
            this.models = models; 
        } else {
            throw new Exception("Должна быть хотя бы одна модель");
        }
        this.flashes = flashes;
        if (cameras.size() > 0) {
            this.cameras = cameras; 
        } else {
            throw new Exception("Должна быть хотя бы одна камера");
        }

    }

    /**
     * Метод method1
     * @param <T>
     * @param flash
     * @return T
     */
    public <T> T method1(T flash){
        return flash;
    }

    /**
     * Метод method2
     * @param <T>
     * @param <E>
     * @param model
     * @param flash
     * @return T
     */
    public <T, E> T method2(T model, E flash){
        return model;
    }

    
}
