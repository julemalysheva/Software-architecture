package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

/**
 * class ModelStore реализует интерфейс iModelChanger, представляет собой Хранилище моделей....
 */
public class ModelStore implements iModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserver[] changeObservers;
    
    /**
     * конструктор Хранилища моделей, при создании экземпляра должен иметь как минимум по одному экземпляру models, 
     * flashes, cameras, scenes
     * @param changeObservers
     * @throws Exception может быть выброшено исключение при отсутствии экземпляров models и cameras у создаваемого
     * экземпляра scenes
     */
    public ModelStore(iModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    @Override
    public void notifyChanger(iModelChanger sender) {
        // загрушка
        
    }

    /**
     * Метод возвращает Scene по заданному id
     * @param id уникальный идентификатор Scene 
     * @return Scene
     */
    public Scene getScene(int id){
        return scenes.get(id);
    }

}
