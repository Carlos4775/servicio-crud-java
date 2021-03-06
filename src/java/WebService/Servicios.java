
package WebService;

import Modelo.TipoDocumento;
import Modelo.TipoDocumentoDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Servicios")
public class Servicios {
    TipoDocumentoDAO dao = new TipoDocumentoDAO();
    @WebMethod(operationName = "listar")
    public List<TipoDocumento> listar() {
        List datos=dao.listar();
        return datos;
    }
    
    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion) {
        String datos=dao.add(nombre, descripcion);
        return datos;
    }
    
    @WebMethod(operationName = "actualizar")
    public String Actualizar(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion) {
        String datos=dao.edit(id, nombre, descripcion);
        return datos;
    }
    
    @WebMethod(operationName = "listarID")
    public TipoDocumento listarID(@WebParam(name="Id")int id ) {
        TipoDocumento documento=dao.listarID(id);
        return documento;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Eliminar")
    public TipoDocumento Eliminar(@WebParam(name = "id") int id) {
        TipoDocumento u=dao.delete(id);
        return u;
    }
}
