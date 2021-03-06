
package Modelo;

import java.util.List;

public interface CRUD {
    public List listar();
    public TipoDocumento listarID(int id);
    public String add(String nameDoc, String descriptionDoc);
    public String edit (int id, String nameDoc, String descriptionDoc);
    public TipoDocumento delete (int id);
}
