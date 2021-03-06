package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class TipoDocumentoDAO implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex=new Conexion();
    int res;
    String msj;
    TipoDocumento doc=new TipoDocumento();
    
    @Override
    public List listar() {
       List<TipoDocumento> datos=new ArrayList<>(); 
       String sql="select * from documentos";
        try{
            con=conex.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                TipoDocumento u=new TipoDocumento();
                u.setId(rs.getInt("Id"));
                u.setNameDoc(rs.getString("nameDoc"));
                u.setDescripctionDoc(rs.getString("descripctionDoc"));
                datos.add(u);
            }
        } catch (Exception e){
            
        }
        return datos;
    }

    @Override
    public TipoDocumento listarID(int id) {
        String sql="select * from documentos where id="+id;
        
        try{
            con=conex.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                doc.setId(rs.getInt("Id"));
                doc.setNameDoc(rs.getString("nameDoc"));
                doc.setDescripctionDoc(rs.getString("descripctionDoc"));
            }
        } catch (Exception e){
        }
        return doc;
    }

    @Override
    public String add(String nameDoc, String descripctionDoc) {
        String sql="insert into documentos(nameDoc, descripctionDoc) values(?,?)";
        try {
            con=conex.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, nameDoc);
            ps.setString(2, descripctionDoc);
            res=ps.executeUpdate();
            if (res==1){
                msj="Usuario Agregado";
            } 
            else{
                msj="Error";
            }
        } catch (Exception e) {
        }
        return msj;
    }

    @Override
    public String edit(int id, String nameDoc, String descripctionDoc) {
        String sql="update documentos set nameDoc=?, descripctionDoc=? where id="+id;
        try{
            con=conex.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, nameDoc);
            ps.setString(2, descripctionDoc);
            res=ps.executeUpdate();
            if (res==1){
                msj="Usuario Actualizado";
            } 
            else{
                msj="Error";
            }
        } catch (Exception e) {
        }
        return msj;
    }

    @Override
    public TipoDocumento delete(int id) {
        String sql="delete from documentos where id="+id;
        try{
            con=conex.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e){
            
        }
        return doc;
    }
    
}
