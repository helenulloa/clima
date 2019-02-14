
package clima.model;

import clima.model.entities.Clima;

/**
 * @author Roxiis Ulloa
 */
public class ModelClima {

    public Clima consultarClima(){ 
        Clima c = new Clima();
        c.setHumedad(23.4f);
        c.setTemperatura(19);
        return c;
    }
}
