package ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * class PoligonalModel...
 */
public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;
    /**
     * конструктор PoligonalModel
     * @param textures
     */
    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        this.poligons = new ArrayList<Poligon>();
    }
}
