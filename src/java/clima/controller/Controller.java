
package clima.controller;

import clima.model.ModelClima;
import clima.model.entities.Clima;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Roxiis Ulloa
 */
@ManagedBean
@SessionScoped
public class Controller {
    
    private Clima clima;
    @EJB
    private ModelClima modelclima;
    
    public String actionConsultarClima(){
        clima = modelclima.consultarClima();
        return "resultado";
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }
    
    
}
