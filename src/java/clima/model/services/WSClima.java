
package clima.model.services;

import clima.model.ModelClima;
import clima.model.entities.Clima;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Roxiis Ulloa
 */
@WebService(serviceName = "WSClima")
public class WSClima {

    @EJB
    private ModelClima ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "consultarClima")
    public Clima consultarClima() {
        return ejbRef.consultarClima();
    }
    
}
