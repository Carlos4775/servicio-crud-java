
package Modelo;

public class TipoDocumento {
    int id;
    String nameDoc;
    String descripctionDoc;
    
    public TipoDocumento(){
        
    }

    public TipoDocumento(int id, String nameDoc, String descripctionDoc) {
        this.id = id;
        this.nameDoc = nameDoc;
        this.descripctionDoc = descripctionDoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDoc() {
        return nameDoc;
    }

    public void setNameDoc(String nameDoc) {
        this.nameDoc = nameDoc;
    }

    public String getDescripctionDoc() {
        return descripctionDoc;
    }

    public void setDescripctionDoc(String descripctionDoc) {
        this.descripctionDoc = descripctionDoc;
    }
}
