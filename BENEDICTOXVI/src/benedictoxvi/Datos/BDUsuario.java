/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Datos;

import benedictoxvi.Entidades.Usuario;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import com.sun.org.apache.bcel.internal.generic.Select;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
 

/**
 *
 * @author pcrojas
 */
public class BDUsuario {
    
    public boolean ExisteUsuario(Usuario pusuario)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("MSantiago");
        list.add("RMarquezma");
        list.add("LupeGonzales");
        
        for(String item : list)
        {
            if(item.equalsIgnoreCase(pusuario.getUsuario())) return true;
        }
        return false;
    }
    
    public Result GuardarUsuario(Usuario pusuario)
    {
        return new Result(ResultType.Ok, "El usuario ha sido registrado correctamente.", null);
    }
    
    public Result ModificarUsuario(Usuario pusuario)
    {
        return new Result(ResultType.Ok, "El usuario ha sido modificado correctamente.", null);
    }
    
    
    
    public boolean ExisteTransacciones(int pCodigoUsuario)
    {
        boolean existe = false;
        ArrayList<Usuario> list = new ArrayList<Usuario>();
        //list.add(new Usuario(1, "MSantiago"));
        list.add(new Usuario(2, "RMarquezma"));
        list.add(new Usuario(3, "LupeGonzales"));
       
        
        for(Usuario item : list)
        {
            if(item.getCodigo() == pCodigoUsuario) 
            {
                existe = true;
                break;
            } 
        }
        
        return existe;
        
    }
    
    public Result EliminarUsuario(Usuario pusuario)
    {
        ArrayList<Usuario> list = new ArrayList<Usuario>();
        list.add(new Usuario(1, "MSantiago"));
        list.add(new Usuario(2, "RMarquezma"));
        list.add(new Usuario(3, "LupeGonzales"));
        
        int indexItem = -1; 
        for(int index=0; index < list.size(); index++)
        {
            if(list.get(index).getCodigo() == list.get(index).getCodigo())
            {
                indexItem = index;
            }
        }
        
        if (indexItem > -1)
        {
            list.remove(indexItem);
            return new Result(ResultType.Ok, "Usuario eliminado correctamente.", null);            
        }
        else
        {
           return new Result(ResultType.Ok, "No se encuentra el usuario.", null);   
        }
    }
    
    public Usuario BuscarUsuarios(Usuario pusuario)
    {
        ArrayList<Usuario> list = new ArrayList<Usuario>();
       
        Usuario usr1 = new Usuario();
        usr1.setCodigo(1);
        usr1.setUsuario("MSantiago");
        usr1.setNroDocumento("99911922");
        usr1.setNombre("Miguel");
        usr1.setApellidoPaterno("Santiago");
        usr1.setApellidoMaterno("Flores");

        Usuario usr2 = new Usuario();
        usr2.setCodigo(2);
        usr2.setUsuario("RMarquezma");
        usr2.setNroDocumento("99911922");
        usr2.setNombre("Miguel");
        usr2.setApellidoPaterno("Santiago");
        usr2.setApellidoMaterno("Flores");
        
        
        Usuario usr3 = new Usuario();
        usr3.setCodigo(3);
        usr3.setUsuario("LupeGonzales");
        usr3.setNroDocumento("99911922");
        usr3.setNombre("Miguel");
        usr3.setApellidoPaterno("Santiago");
        usr3.setApellidoMaterno("Flores");
        
        list.add(usr1);
        list.add(usr2);
        list.add(usr3);
        
        for(Usuario item : list)
        {
            if(item.getUsuario() == pusuario.getUsuario()) return item;
        }
        
        return null;
    }
}
